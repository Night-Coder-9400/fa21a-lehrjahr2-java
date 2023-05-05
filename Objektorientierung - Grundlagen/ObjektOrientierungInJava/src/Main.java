import java.util.Date;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Artikel ausgeben lassen");
        System.out.println("2. Verbrauchszyklus ausgeben lassen");

        String auswahl = scanner.next();
        scanner.close();

        switch (auswahl)
        {
            case "1":

                Artikel a1 = new Artikel(1451234561123L, "Wurst", 4, 4.99, 'F', false);
                Artikel a2 = new Artikel(1451234554123L, "Käse", 10, 2.99, 'F', false);
                Artikel a3 = new Artikel(1457834561123L, "Fußball", 2, 5.01, 'A', true);

                System.out.println("Artikel 1:");
                System.out.println(a1.toString());
                System.out.println("-----------------------");
                System.out.println("Artikel 2:");
                System.out.println(a2.toString());
                System.out.println("-----------------------");
                System.out.println("Artikel 3:");
                System.out.println(a3);
                System.out.println("-----------------------");

                a2.setArtikelname("Gouda");
                a2.setPreis(20.01);

                System.out.println("Geänderte Attribute mit den Set-Methoden");
                System.out.println("Neuer Artikelname: " + a2.getArtikelname());
                System.out.println("Neuer Preis: " + a2.getPreis() + "€");

                break;

            case "2":

                Verbrauchszyklus vz1 = new Verbrauchszyklus(new Date(2022, 8, 22), 58.00, 1.89, 891.00);
                Verbrauchszyklus vz2 = new Verbrauchszyklus(new Date(2022, 8, 21), 63.00, 1.87, 1014.00);

                System.out.println("Verbrauchszyklus 1:");
                System.out.println(vz1.toString());
                System.out.println("------------------------------------------------------------");
                System.out.println("Verbrauchszyklus 2:");
                System.out.println(vz2.toString());
                System.out.println("------------------------------------------------------------");
                System.out.println("Durchschnittsverbrauch: " + String.format("%1$,.2f", vz1.durschnittsVerbrauchPro100Km())+ "L");
                System.out.println("Durchschnittsverbrauch: " + String.format("%1$,.2f", vz2.durschnittsVerbrauchPro100Km()) + "L");
                System.out.println("------------------------------------------------------------");
                System.out.println("Kraftstoffkosten pro 100km: " + String.format("%1$,.2f", vz1.kraftstoffkostenPro100Km()) + "€");
                System.out.println("Kraftstoffkosten pro 100km: " + String.format("%1$,.2f", vz2.kraftstoffkostenPro100Km()) + "€");

                break;

            default:
                System.out.println("Leider wurde keine gültige Auswahl getroffen.");
        }



    }
}