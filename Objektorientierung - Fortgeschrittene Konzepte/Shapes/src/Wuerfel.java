public class Wuerfel extends DreiDimensional
{
    private double hoehe;
    private double breite;
    private double tiefe;

    public Wuerfel(double hoehe, double breite, double tiefe) {
        this.hoehe = hoehe;
        this.breite = breite;
        this.tiefe = tiefe;
    }


    @Override
    public double berechneVolumen() {
        double result = breite * hoehe * tiefe;
        return result;
    }

    @Override
    public double berechneFlaeche() {
        return 0;
    }
}
