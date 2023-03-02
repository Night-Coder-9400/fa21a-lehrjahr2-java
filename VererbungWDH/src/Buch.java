public class Buch extends Artikel
{

    private String isbn;
    private String verlag;
    private int seitenzahl;

    public Buch(int id, String artikelbezeichnung, double preis, String isbn, String verlag, int seitenzahl)
    {
        super(id, artikelbezeichnung, preis);
        this.isbn = isbn;
        this.verlag = verlag;
        this.seitenzahl = seitenzahl;
    }

    @Override
    public String toString() {
        return super.toString()+  "\nIsbn: " + isbn +
                "\nVerlag: " + verlag +
                "\nSeitenzahl: " + seitenzahl;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
