public class Videospiel extends Artikel
{
    private String plattform;
    private String entwicklerstudio;
    private boolean mehrspieler;

    public Videospiel(int id, String artikelbezeichnung, double preis, String plattform, String entwicklerstudio, boolean mehrspieler)
    {
        super(id, artikelbezeichnung, preis);
        this.plattform = plattform;
        this.entwicklerstudio = entwicklerstudio;
        this.mehrspieler = mehrspieler;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nPlattform: " + plattform +
                "\nEntwicklerstudio: " + entwicklerstudio +
                "\nMehrspieler: " + mehrspieler;
    }

    public boolean getMehrspieler()
    {
        return this.mehrspieler;
    }

    public void setMehrspieler(boolean mehrspieler)
    {
        this.mehrspieler = mehrspieler;
    }
}
