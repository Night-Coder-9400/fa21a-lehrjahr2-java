import java.util.Scanner;

public class ErstellungVonArrays
{
    public static void Aufgabe1a()
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

        scanner.close();
    }

    public static void Aufgabe1b()
    {
        double[] tagesumsaetze = {28535.43, 7899.99, 10000.00, 321.34, 84412.17, 55000.00};

        int position = 1;

        //for-Schleife
        for(double tagesumsatz:tagesumsaetze)
        {
            System.out.println(position + ": " + tagesumsatz);
            position++;
        }

        System.out.println("");

        //foreach-Schleife
        for(position = 1; position <= tagesumsaetze.length; position++)
        {
            System.out.println(position + ": " + tagesumsaetze[position-1]);
        }
    }

}
