public class Rechteck extends ZweiDimensional
{
    private double laenge;
    private double breite;

    public Rechteck(double laenge, double breite) {
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public double berechneFlaeche() {
        double result = laenge * breite;
        return result;
    }

    @Override
    public double berechneUmfang() {
        return 0;
    }
}
