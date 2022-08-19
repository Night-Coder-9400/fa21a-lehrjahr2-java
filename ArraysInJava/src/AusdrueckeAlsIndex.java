import java.util.Scanner;

public class AusdrueckeAlsIndex
{
    public static void Aufgabe2()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.println("Geben Sie die Position ein, welche ausgegeben werden soll: ");

        int position = scanner.nextInt();


        String[] mitarbeiter = new String[5];

        mitarbeiter[0] = "Kurt Gertius";
        mitarbeiter[1] = "Anna Wurtele";
        mitarbeiter[2] = "Hajo Obermaier";
        mitarbeiter[3] = "Jörg Advocat";
        mitarbeiter[4] = "Nicole Dulon";

        if(mitarbeiter.length <= position-1)
        {
            System.out.println("Position: " + position + "\nFehler: ungültige Position");
        }
        else
        {
            System.out.println("Position: " + position + "\n" + mitarbeiter[position-1]);
        }
    }
}
