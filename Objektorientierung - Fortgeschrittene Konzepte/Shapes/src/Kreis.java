public class Kreis extends ZweiDimensional
{
    private double radius;

    public Kreis(double radius) {
        this.radius = radius;
    }


    @Override
    public double berechneFlaeche() {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    @Override
    public double berechneUmfang() {
        return 0;
    }
}
