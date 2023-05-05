import java.util.Scanner;

public class Zaehlschleifen
{
    /*
        Schreiben Sie ein Programm, das die Summe der Zahlen von 1 bis n berechnet:
        Der Wert n wird vom Benutzer eingegeben.
     */
    public static void Aufgabe6_5a()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.print("Gebe eine Zahl zwischen 1 und 100 ein: ");
        int eingabe = scanner.nextInt();
        int summe = 0;

        for(int i = 1; i <= eingabe; i++)
        {
            summe += i;
        }
        System.out.println(summe);

        scanner.close();
    }

    /*
        Schreiben Sie ein Programm, das die Summe berechnet. Die Werte m und n werden vom Benutzer eingegeben.
     */
    public static void Aufgabe6_5b()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.print("Gebe eine Zahl zwischen 1 und n ein: ");
        int eingabeN = scanner.nextInt();

        System.out.print("Gebe eine Zahl zwischen 1 und m ein: ");
        int eingabeM = scanner.nextInt();
        int summe = 0;

        for(int i = eingabeN; i < eingabeM; i++)
        {
            summe = summe +i;
        }
        System.out.println("Die Summe lautet: " + summe);

        scanner.close();
    }
}
