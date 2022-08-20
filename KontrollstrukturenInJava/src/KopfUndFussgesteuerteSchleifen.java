import java.util.Scanner;

public class KopfUndFussgesteuerteSchleifen
{
    /*
        Es soll ein Programm zur Passwortabfrage erstellt werden.
        i) Das Programm fragt den Benutzer so lange nach einem Passwort, bis die Eingabe
            „Nixdorf“ erfolgt.
        ii) Erweitern Sie das Programm um eine Fehlermeldung, die ausgegeben wird, falls das
            eingegebene Passwort falsch war.
        iii) Begrenzen Sie die Anzahl der ungültigen Versuche auf 3. Danach wird das Programm mit einer Fehlermeldung beendet.
     */
    public static void Aufgabe7_4a()
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        String richtigesPasswort = "Nixdorf";
        String passwort;
        int versuche = 3;

        do
        {
            System.out.print("Bitte geben Sie ein Passwort ein: ");
            passwort = scanner.next();

            versuche-=1;
            if(!passwort.equals(richtigesPasswort))
            {
                System.out.println("Falsches Passwort! Sie haben noch " + versuche + " Versuche übrig!");
            }

            if(versuche == 0 && !passwort.equals(richtigesPasswort))
            {
                System.out.println("Sie haben die maximale Anzahl an Verusuchen erreicht.");
                break;
            }
        }
        while(!passwort.equals(richtigesPasswort));

        if(passwort.equals(richtigesPasswort))
        {
            System.out.println("Das war das richtige Passwort!");
        }

        scanner.close();
    }

    /*
        Die Bevölkerung im Land A beträgt 60 Millionen und die Bevölkerung im Land B beträgt
        4 Millionen. Die Bevölkerung im Land A nimmt jährlich um 0,5% ab, die Bevölkerung
        im Land B nimmt jährlich um 2,5% zu.
        i) Nach wieviel Jahren hat Land B mindestens 10% der Bevölkerung von Land A
            erreicht?
        ii) Nach wieviel Jahren ist die Bevölkerung von Land B mindestens so groß wie in
            Land A?
        Geben Sie die Bevölkerungszahlen mit zwei Nachkommastellen aus
     */
    public static void Aufgabe7_4b()
    {
        int bevoelkerung_landA = 60000000;
        int bevoelkerung_landB = 4000000;

        double zuwachsA = 0.5;
        double zuwachsB = 2.5;

        int jahre = 0;
        boolean erreicht = false;

        //i

        while(erreicht = false)
        {
            jahre += 1;
            bevoelkerung_landA = bevoelkerung_landA * 0.995;
        }

        System.out.println("Land B hat nach " + jahre + " 10% der Bevölkerung von Land A erreicht.");


        //ii


        System.out.println("Die Bevölkerung von Land B ist nach " + jahren + "so groß wie in Land A.");
    }
}
