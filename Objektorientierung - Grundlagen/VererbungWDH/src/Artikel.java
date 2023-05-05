public class Artikel
{
    private int id;
    private String artikelbezeichnung;
    private double preis;

    public Artikel(int id, String artikelbezeichnung, double preis)
    {
        this.id = id;
        this.artikelbezeichnung = artikelbezeichnung;
        this.preis = preis;
    }

    @Override
    public String toString() {
        return  "Id: " + id +
                "\nArtikelbezeichnung: " + artikelbezeichnung +
                "\nPreis: " + preis + "€";
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
