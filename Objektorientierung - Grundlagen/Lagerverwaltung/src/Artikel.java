public class Artikel
{
    private static int id = 0;
    private int artikelnummer;
    private String name;
    private int vorraetigeAnzahl;
    private double einzeplreis;

    public Artikel(String name, int vorraetigeAnzahl, double einzelpreis)
    {
        this.artikelnummer = id;
        this.name=name;
        this.vorraetigeAnzahl=vorraetigeAnzahl;
        this.einzeplreis=einzelpreis;
        id++;
    }

    @Override
    public String toString() {
        return "Artikel{" +
                "artikelnummer=" + artikelnummer +
                ", name='" + name + '\'' +
                ", vorraetigeAnzahl=" + vorraetigeAnzahl +
                ", einzeplreis=" + einzeplreis +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getVorraetigeAnzahl()
    {
        return vorraetigeAnzahl;
    }

    public void setVorraetigeAnzahl(int vorraetigeAnzahl)
    {
        this.vorraetigeAnzahl = vorraetigeAnzahl;
    }

    public double getEinzelPreis()
    {
        return einzeplreis;
    }

    public void setEinzeplreis(double einzelPreis)
    {
        this.einzeplreis = einzelPreis;
    }

    public double getEinzeplreis()
    {
        return einzeplreis;
    }
}
