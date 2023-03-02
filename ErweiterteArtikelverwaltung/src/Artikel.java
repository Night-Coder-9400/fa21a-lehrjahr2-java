public class Artikel
{
    private static int counter = 1;
    private Lieferant lieferant;
    private int artikelnummer;
    private String artikelname;
    private int warenbestand;
    private float einkaufspreisProStueck;
    private char warengruppe;
    private boolean auslaufartikel;

    public Artikel(String artikelname, int warenbestand, float einkaufspreisProStueck, char warengruppe, boolean auslaufartikel, Lieferant lieferant) {
        this.artikelnummer = counter;
        this.artikelname = artikelname;
        this.warenbestand = warenbestand;
        this.einkaufspreisProStueck = einkaufspreisProStueck;
        this.warengruppe = warengruppe;
        this.auslaufartikel = auslaufartikel;
        this.lieferant = lieferant;
        
        counter++;
    }

    @Override
    public String toString() {
        return "Artikel: " +
                lieferant +
                ", Artikelnummer: " + artikelnummer +
                ", Artikelname: " + artikelname + '\'' +
                ", Warenbestand: " + warenbestand +
                ", Einkaufspreis pro Stück: " + einkaufspreisProStueck +
                ", Warengruppe: " + warengruppe +
                ", Auslaufartikel: " + auslaufartikel;

    }



    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Artikel.counter = counter;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getArtikelname() {
        return artikelname;
    }

    public void setArtikelname(String artikelname) {
        this.artikelname = artikelname;
    }

    public int getWarenbestand() {
        return warenbestand;
    }

    public void setWarenbestand(int warenbestand) {
        this.warenbestand = warenbestand;
    }

    public float getEinkaufspreisProStueck() {
        return einkaufspreisProStueck;
    }

    public void setEinkaufspreisProStueck(float einkaufspreisProStueck) {
        this.einkaufspreisProStueck = einkaufspreisProStueck;
    }

    public char getWarengruppe() {
        return warengruppe;
    }

    public void setWarengruppe(char warengruppe) {
        this.warengruppe = warengruppe;
    }

    public boolean isAuslaufartikel() {
        return auslaufartikel;
    }

    public void setAuslaufartikel(boolean auslaufartikel) {
        auslaufartikel = auslaufartikel;
    }
}

