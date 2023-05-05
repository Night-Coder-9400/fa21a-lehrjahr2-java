import java.util.Scanner;

public class Verzweigung
{
    public static void Aufgabe4_4b()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        double ermaessigteMehrwertsteuer = 1.07;
        double volleMehrwertsteuer = 1.19;
        double preis;


        System.out.print("Bitte geben Sie den Nettopreis ein: ");
        double nettopreis = scanner.nextDouble();

        System.out.print("Ermäßigte Mehrwertsteuer? (Gebe true oder false ein!): ");
        boolean ermaessigt = scanner.nextBoolean();

        if (ermaessigt) {
            preis = (double)Math.round(nettopreis * ermaessigteMehrwertsteuer);
        } else {
            preis = (double)Math.round(nettopreis * volleMehrwertsteuer);
        }

        System.out.println("Bruttopreis: " + preis + "€.");

        scanner.close();
    }
}
