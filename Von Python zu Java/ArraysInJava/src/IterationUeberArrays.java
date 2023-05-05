public class IterationUeberArrays
{
    public static void Aufgabe3()
    {
        double[] tagesumsaetze = {28535.43, 7899.99, 10000.00, 321.34, 84412.17, 55000.00};

        int position = 1;

        //for-Schleife
        for(double tagesumsatz:tagesumsaetze)
        {
            System.out.println(position + ": " + tagesumsatz);
            position++;
        }

        System.out.println("");

        //foreach-Schleife
        for(position = 1; position <= tagesumsaetze.length; position++)
        {
            System.out.println(position + ": " + tagesumsaetze[position-1]);
        }
    }
}
