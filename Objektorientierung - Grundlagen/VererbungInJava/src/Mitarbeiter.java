public class Mitarbeiter extends Person
{
    private String abteilung;

    public Mitarbeiter(String abteilung, String name)
    {
        super(name);
        this.abteilung = abteilung;
    }

    @Override
    public String toString() {
        return super.toString() + "\nAbteilung: " + abteilung;
    }

    public String getAbteilung() {
        return abteilung;
    }

    public void setAbteilung(String abteilung) {
        this.abteilung = abteilung;
    }
}
