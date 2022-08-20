import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.println("1. Verzweigungen");
        System.out.println("2. Mehrfache Alternativen");
        System.out.println("3. Zählschleifen");
        System.out.println("4. Kopf- und Fußgesteuerte Schleifen");

        String auswahl = scanner.next();
        switch (auswahl)
        {
            case "1":
                Verzweigung verzweigung = new Verzweigung();
                System.out.println("Aufagbe4.4: ");
                verzweigung.Aufgabe4_4b();
                break;
            case "2":
                MehrfacheAlternativen mehrfacheAlternativen = new MehrfacheAlternativen();
                System.out.println("Aufgabe 5.4a:");
                mehrfacheAlternativen.Aufgabe5_4a();
                System.out.println("Aufgabe 5.4b");
                mehrfacheAlternativen.Aufgabe5_4b();
                System.out.println("Aufgabe 5.4c:");
                mehrfacheAlternativen.Aufgabe5_4c();
                break;
            case "3":
                Zaehlschleifen zaehlschleifen = new Zaehlschleifen();
                System.out.println("Aufgabe 6.5a:");
                zaehlschleifen.Aufgabe6_5a();
                System.out.println("Aufgabe 6.5b:");
                zaehlschleifen.Aufgabe6_5b();
                break;
            case "4":
                KopfUndFussgesteuerteSchleifen kopfUndFussgesteuerteSchleifen = new KopfUndFussgesteuerteSchleifen();
                System.out.println("Aufgabe 7.4a:");
                kopfUndFussgesteuerteSchleifen.Aufgabe7_4a();
                System.out.println("Aufgabe 7.4b:");
                kopfUndFussgesteuerteSchleifen.Aufgabe7_4b();
                break;
        }
    }
}