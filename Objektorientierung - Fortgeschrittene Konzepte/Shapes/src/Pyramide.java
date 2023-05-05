public class Pyramide extends DreiDimensional
{
    private double seitenlaenge;
    private double grundflaeche = seitenlaenge * seitenlaenge;
    private double hoehe;

    public Pyramide(double seitenlaenge, double hoehe) {
        this.seitenlaenge = seitenlaenge;
        this.hoehe = hoehe;
    }


    @Override
    public double berechneVolumen() {
        double result = 1/3 * grundflaeche * hoehe;
        return result;
    }

    @Override
    public double berechneFlaeche() {
        return 0;
    }
}
