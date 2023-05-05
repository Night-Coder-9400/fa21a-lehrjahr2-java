import java.util.Date;

public class Verbrauchszyklus
{
    private Date datumDesTankvorgangs;
    private double getankteLiter;
    private double preisProLiter;
    private double gefahreneKm;

    Verbrauchszyklus(Date datumDesTankvorgangs, double getankteLiter, double preisProLiter, double gefahrneKm)
    {
        this.datumDesTankvorgangs = datumDesTankvorgangs;
        this.getankteLiter = getankteLiter;
        this.preisProLiter = preisProLiter;
        this.gefahreneKm = gefahrneKm;
    }

    public double durschnittsVerbrauchPro100Km()
    {
        double durchschnitt = getankteLiter / gefahreneKm * 100;
        //durchschnitt = Math.round(durchschnitt);

        return durchschnitt;
    }

    public double kraftstoffkostenPro100Km()
    {
        double preis =  durschnittsVerbrauchPro100Km() * preisProLiter;

        return preis;
    }

    @Override
    public String toString() {
        return "DatumDesTankvorgangs: " + datumDesTankvorgangs + "\nGetankteLiter: " + getankteLiter + "\nPreisProLiter: " + preisProLiter + "\nGefahreneKm: " + gefahreneKm;
    }

    public Date getDatumDesTankvorgangs()
    {
        return this.datumDesTankvorgangs;
    }

    public void setDatumDesTankvorgangs(Date datumDesTankvorgangs)
    {
        this.datumDesTankvorgangs = datumDesTankvorgangs;
    }

    public double getGetankteLiter() {
        return getankteLiter;
    }

    public void setGetankteLiter(double getankteLiter) {
        this.getankteLiter = getankteLiter;
    }

    public double getPreisProLiter() {
        return preisProLiter;
    }

    public void setPreisProLiter(double preisProLiter) {
        this.preisProLiter = preisProLiter;
    }

    public double getGefahreneKm() {
        return gefahreneKm;
    }

    public void setGefahreneKm(double gefahreneKm) {
        this.gefahreneKm = gefahreneKm;
    }
}
