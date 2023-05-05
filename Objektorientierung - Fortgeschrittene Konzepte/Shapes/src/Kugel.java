public class Kugel extends DreiDimensional
{
    private double radius;

    public Kugel(double radius) {
        this.radius = radius;
    }

    @Override
    public double berechneVolumen() {
        double result = 4/3 * Math.PI * Math.pow(radius, 3) ;
        return result;
    }

    @Override
    public double berechneFlaeche() {
        return 0;
    }
}
