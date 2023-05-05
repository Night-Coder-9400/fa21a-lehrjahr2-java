import java.util.ArrayList;
import java.util.Iterator;

public class Collection
{
    ArrayList<GeometrischeFiguren> figuren;
    Iterator<GeometrischeFiguren> iterator = figuren.iterator();

    public Collection(ArrayList<GeometrischeFiguren> figuren) {
        this.figuren = figuren;
    }

    public void figurenAnzeigen()
    {
        for(figuren.iterator(); iterator.hasNext();)
        {
            System.out.println("Figur: " + iterator.next());
            System.out.println(figuren);
        }
    }

    public void ausgabeGesamtFlaeche()
    {

    }

    public void ausgabeGesamtVolumen()
    {

    }

    //Liste der Figuren

}
