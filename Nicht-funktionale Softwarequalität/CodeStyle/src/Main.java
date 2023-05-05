public class Main {
    public static void main(String[] args)
    {
        Kinosaal kinosaal = new Kinosaal();
        boolean[][] sitzplan = kinosaal.erzeugeSitzplan(60);

        //Aufgabe c Version 1
        System.out.println("-----------");
        System.out.println("Version 1:");
        System.out.println("-----------\n");
        kinosaal.zeigeSitzplan(sitzplan);
        System.out.println("Der erste freie Platz: " + kinosaal.findeFreiePlaetze(sitzplan, 3));
        System.out.println("Neuer Sitzplan, nach Buchung: ");
        kinosaal.zeigeSitzplan(sitzplan);


        //Aufgabe c Version 2
        System.out.println("\n-----------");
        System.out.println("Version 2:");
        System.out.println("-----------\n");
        kinosaal.zeigeSitzplan(sitzplan);
        System.out.println("Der erste freie Platz: " + kinosaal.findeFreiePlaetze(sitzplan, 2, 3));
        System.out.println("Neuer Sitzplan, nach Buchung: ");
        kinosaal.zeigeSitzplan(sitzplan);
    }
}