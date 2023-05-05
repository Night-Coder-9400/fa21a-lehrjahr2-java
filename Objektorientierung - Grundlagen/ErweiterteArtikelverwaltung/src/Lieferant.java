public class Lieferant
{
    private Adresse adresse;
    private int lieferantennummer;
    private static int id = 1;
    private String name;

    public Lieferant(String name, Adresse adresse) {
        this.lieferantennummer = id;
        this.name = name;
        this.adresse = adresse;

        id++;
    }

    @Override
    public String toString() {
        return "Lieferant: " +
                "Lieferantennummer: " + lieferantennummer +
                ", Name: " + name +
                ", " + adresse + '\'';
    }
}
