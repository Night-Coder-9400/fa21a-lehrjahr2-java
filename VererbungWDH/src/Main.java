
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {

        Artikel[] artikel = new Artikel[3];

        artikel[0] = new Buch(1, "Herr der Ringe", 14.99, "098765432-765", "Ringe Verlage", 500);
        artikel[1] = new CD(2, "Linkin Park", 12.99, "Sony", "Rock", 10034);
        artikel[2] = new Videospiel(3,"Fortnite", 0.00, "Pc", "Epic Games", true);


        for(int i = 0; i < artikel.length; i++)
        {
            System.out.println(artikel[i].toString());
            System.out.println("-----------------------------------");
        }

        Artikel[] array = findeCD(artikel);

        for(int a = 0; a < artikel.length; a++)
        {
            System.out.println(array[a]);
        }

    }

    public static Artikel[] findeCD(Artikel[] array)
    {
        Artikel[] result = new Artikel[array.length];

        for(int i = 0; i < array.length; i++)
        {
            if(array[i] instanceof CD && ((CD) array[i]).getSpielzeitInSek() >= 3600)
            {
                result[i] = array[i];
            }
        }
        return result;
    }
}