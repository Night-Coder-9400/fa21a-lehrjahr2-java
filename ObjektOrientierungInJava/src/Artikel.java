public class Artikel
{
    private long ean13;
    private String artikelname;
    private int warenbestand;
    private double preis;
    private char warengruppe;
    private boolean auslaufartikel;

    public Artikel(long ean13, String artikelname, int warenbestand, double preis, char warengruppe, boolean auslaufartikel)
    {
        this.ean13 = ean13;
        this.artikelname = artikelname;
        this.warenbestand = warenbestand;
        this.preis = preis;
        this.warengruppe = warengruppe;
        this.auslaufartikel = auslaufartikel;
    }

    public String toString()
    {
        String result = "EAN13: " + ean13;
        result += "\nArtikelname: " + artikelname;
        result += "\nWarenbestand:" + warenbestand;
        result += "\nPreis: " + preis + "€";
        result += "\nWarengruppe: " + warengruppe;
        result += "\nAuslaufartikel: " + auslaufartikel;

        return result;
    }
    public String getArtikelname(){
        return this.artikelname;
    }

    public void setArtikelname(String name){
        this.artikelname = name;
    }

    public long getEan13(){
        return this.ean13;
    }

    public void setEan13(long ean){
        this.ean13 = ean;
    }

    public int getWarenbestand(){
        return this.warenbestand;
    }

    public void setWarenbestand(int anzahl) {
        this.warenbestand = anzahl;
    }

    public double getPreis(){
        return this.preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public boolean getAuslaufartikel(){
        return this.auslaufartikel;
    }

    public void setAuslaufartikel(boolean auslaufartikel) {
        this.auslaufartikel = auslaufartikel;
    }
    public char getWarengruppe(){
        return this.warengruppe;
    }

    public void setWarengruppe(char gruppe) {
        this.warengruppe = gruppe;
    }
}
