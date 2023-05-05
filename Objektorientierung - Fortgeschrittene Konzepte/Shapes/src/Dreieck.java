public class Dreieck extends ZweiDimensional
{

    private double breite;
    private double hoehe;
    private double grundseite;

    @Override
    public double berechneFlaeche() {
        double result = grundseite * hoehe / breite;
        return result;
    }

    @Override
    public double berechneUmfang() {
        return 0;
    }
}
