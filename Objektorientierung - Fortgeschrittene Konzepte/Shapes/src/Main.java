import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {

        //Dreidimensional
        Pyramide pyramide = new Pyramide(5.5, 4.0);
        Kugel kugel = new Kugel(2.2);
        Wuerfel wuerfel = new Wuerfel(5.2, 4.5,4.0);

        //Zweidimensional
        Kreis kreis = new Kreis(2.0);
        Rechteck rechteck = new Rechteck(5.0, 7.0);
        Dreieck dreieck = new Dreieck();

        ArrayList<GeometrischeFiguren> figuren = new ArrayList<>();
        figuren.add(pyramide);
        figuren.add(kugel);
        figuren.add(wuerfel);
        figuren.add(kreis);
        figuren.add(rechteck);
        figuren.add(dreieck);
        Collection coll = new Collection(figuren);

        System.out.println(coll);

    }
}