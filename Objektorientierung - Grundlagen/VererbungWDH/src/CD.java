public class CD extends Artikel
{
    private String label;
    private String genre;
    private int spielzeitInSek;

    public CD(int id, String artikelbezeichnung, double preis, String label, String genre, int spielzeitInSek)
    {
        super(id, artikelbezeichnung, preis);
        this.label = label;
        this.genre = genre;
        this.spielzeitInSek = spielzeitInSek;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nLabel: " + label +
                "\nGenre: " + genre +
                "\nSpielzeitInSek: " + spielzeitInSek;
    }

    public int getSpielzeitInSek() {
        return spielzeitInSek;
    }

    public void setSpielzeitInSek(int spielzeitInSek) {
        this.spielzeitInSek = spielzeitInSek;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
