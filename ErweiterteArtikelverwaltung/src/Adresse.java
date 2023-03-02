public class Adresse
{
    private static int id = 1;
    private int adressenId;
    private String strasse;
    private String hausnummer;
    private String postleitzahl;
    private String Stadt;

    public Adresse(String strasse, String hausnummer, String postleitzahl, String stadt) {
        this.adressenId = id;
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.postleitzahl = postleitzahl;
        Stadt = stadt;

        id++;
    }

    @Override
    public String toString() {
        return "Adresse: " +
                "AdressenId: " + adressenId +
                ", Straße: " + strasse + '\'' +
                ", Hausnummer: " + hausnummer + '\'' +
                ", Postleitzahl: " + postleitzahl + '\'' +
                ", Stadt: " + Stadt + '\'';
    }
}
