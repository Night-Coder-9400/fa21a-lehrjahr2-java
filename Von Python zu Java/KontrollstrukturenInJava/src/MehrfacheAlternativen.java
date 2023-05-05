import java.util.Scanner;

public class MehrfacheAlternativen {
    /*
        Schreiben Sie ein Programm, das zu einer eingegebenen Zahl den entsprechenden Monat
        ausgibt (1 - Januar, 2 - Februar, usw.).
    */
    public static void Aufgabe5_4a() {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.println("Bitte geben Sie eine Zahl von 1-12 ein:");
        String monat = scanner.next();

        switch (monat) {
            case "1":
                System.out.println("Januar");
                break;
            case "2":
                System.out.println("Februar");
                break;
            case "3":
                System.out.println("März");
                break;
            case "4":
                System.out.println("April");
                break;
            case "5":
                System.out.println("Mai");
                break;
            case "6":
                System.out.println("Juni");
                break;
            case "7":
                System.out.println("Juli");
                break;
            case "8":
                System.out.println("August");
                break;
            case "9":
                System.out.println("September");
                break;
            case "10":
                System.out.println("Oktober");
                break;
            case "11":
                System.out.println("November");
                break;
            case "12":
                System.out.println("Dezember");
                break;
            default:
                System.out.println("Keine gültige eingabe!");
        }
        scanner.close();
    }

    /*
         Ein Möbelhaus berechnet die Auslieferungspreise für Möbel folgendermaßen. Setzen Sie
        die Logik jeweils in Python um:
        i) Wenn die Entfernung mehr als 30 km beträgt, ist der Lieferpreis 30 Euro.
        ii) Wenn die Entfernung mehr als 30 km beträgt, ist der Lieferpreis 30 Euro, sonst
            kostet es 10 Euro.
        iii) Wenn die Entfernung <= 30 km ist, ist der Lieferpreis 10 Euro.
            Wenn die Entfernung > 30 km und <=70 km ist, ist der Lieferpreis 30 Euro.
            Wenn die Entfernung > 70 km und <=100 km ist, ist der Lieferpreis 50 Euro.
            Wenn die Entfernung > 100 km ist, ist der Lieferpreis 100 Euro.
        iv) Ergänzen Sie iii) wie folgt: Das Möbelhaus hat seine Kunden in drei Typen kategorisiert.
            Wenn der Kundentyp „A“ ist, dann wird der Lieferpreis um 10 Euro reduziert.
            Wenn der Kundentyp „B“ ist, dann wird der Lieferpreis um 20 Euro reduziert.
            Wenn der Kundentyp „C“ ist, dann wird der Lieferpreis um 30 Euro reduziert.
            Dabei darf der Lieferpreis nicht negativ werden.
    */
    public static void Aufgabe5_4b()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.print("Bitte geben sie die Entfernung ein: ");
        int entfernung = scanner.nextInt();
        int lieferpreis;

        if (entfernung <= 30) {
            lieferpreis = 10;
        }
        else if (entfernung > 30 && entfernung <= 70)
        {
            lieferpreis = 30;
        }
        else if (entfernung > 70 && entfernung <= 100)
        {
            lieferpreis = 50;
        }
        else
        {
            lieferpreis = 100;
        }

        System.out.print("Bitte geben sie den Kundentyp ein (A, B oder C): ");

        char kundentyp = scanner.next().charAt(0);

        if (kundentyp != 'A' && kundentyp != 'a')
        {
            if (kundentyp != 'B' && kundentyp != 'b')
            {
                if (kundentyp == 'C' || kundentyp == 'c')
                {
                    lieferpreis -= 30;
                }
            }
            else
            {
                lieferpreis -= 20;
            }
        }
        else
        {
            lieferpreis -= 10;
        }
        if (lieferpreis < 0) {
            lieferpreis = 0;
        }

        System.out.println("Der Lieferpreis beträgt: " + lieferpreis + "€.");

        scanner.close();
    }

    /*
        Schreiben Sie ein Programm, das zu einer eingegebenen Zahl einen Würfel mit einer
        entsprechenden Augenzahl anzeigt. Wird eine Zahl außerhalb des Wertebereichs von 1-6
        angegeben, soll ein Würfel mit einem Fragezeichen als Auge ausgegeben werden.
     */
    public static void Aufgabe5_4c()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        int augenzahl = scanner.nextInt();

        switch (augenzahl) {
            case 1:
                System.out.print(" -----\n|     |\n|  *  |\n|     |\n -----\n");
                break;
            case 2:
                System.out.print(" -----\n| *   |\n|     |\n|   * |\n -----\n");
                break;
            case 3:
                System.out.print(" -----\n| *   |\n|  *  |\n|   * |\n -----\n");
                break;
            case 4:
                System.out.print(" -----\n| * * |\n|     |\n| * * |\n -----\n");
                break;
            case 5:
                System.out.print(" -----\n| * * |\n|  *  |\n| * * |\n -----\n");
                break;
            case 6:
                System.out.print(" -----\n| * * |\n| * * |\n| * * |\n -----\n");
                break;
            default:
                System.out.print(" -----\n|     |\n|  ?  |\n|     |\n -----\n");
        }

        scanner.close();
    }
}



