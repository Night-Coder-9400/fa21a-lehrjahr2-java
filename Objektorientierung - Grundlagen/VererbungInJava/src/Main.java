public class Main {
    public static void main(String[] args)
    {
        /*
        AbgeleiteteKlasse ak = new AbgeleiteteKlasse();
        System.out.println("<--------------------------------------->");
        BasisKlasse bk = new BasisKlasse();
        */

        Kunde k1 = new Kunde(1024, "Lukas");
        Kunde k2 = new Kunde(1025, "Manuel");
        Kunde k3 = new Kunde(1026, "Janina");

        Mitarbeiter m1 = new Mitarbeiter("HR","Gustaf");
        Mitarbeiter m2 = new Mitarbeiter("Qualitätsmanagement","Ronald");
        Mitarbeiter m3 = new Mitarbeiter("PE","Sybille");

        System.out.println(k1.toString());
        System.out.println("-------------");
        System.out.println(m1.toString());



    }
}