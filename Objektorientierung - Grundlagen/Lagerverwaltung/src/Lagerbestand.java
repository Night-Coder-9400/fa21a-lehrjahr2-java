public class Lagerbestand
{
    private int artikelObergrenze;
    private Artikel artikel;

    public Lagerbestand(int artikelObergrenze, Artikel artikel)
    {
        this.artikelObergrenze = artikelObergrenze;
        this.artikel = artikel;
    }

    public void addArtikel(Artikel artikel)
    {

    }

    public void removeArtikel()
    {

    }

    public void setArtikelObergrenze(int artikelObergrenze)
    {
        this.artikelObergrenze = artikelObergrenze;
    }

    public int getArtikelObergrenze()
    {
        return artikelObergrenze;
    }

    public int[] gesamtBestand()
    {

    }
}
