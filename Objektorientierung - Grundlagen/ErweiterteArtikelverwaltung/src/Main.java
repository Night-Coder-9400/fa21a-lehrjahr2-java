import java.util.Arrays;

public class Main {
    public static void main(String[] args)
    {
        Adresse a1 = new Adresse("Adidasweg", "12b", "93726", "Adidasstadt");
        Adresse a2 = new Adresse("Nikestraße", "33a", "34256", "Nikehausen");
        Lieferant l1 = new Lieferant("Adidas", a1);
        Lieferant l2 = new Lieferant("Nike", a2);
        Artikel ar1 = new Artikel("Fußball", 10, 10.99f, 'A',true, l1);
        Artikel ar2 = new Artikel("Fußballschuhe", 30, 69.99f, 'C',false, l2);

        System.out.println(ar1);
        System.out.println(ar2);

        /*Methoden m = new Methoden();

        System.out.println("Maximum: " + m.max3(1.00, 100.24, 32.00));
        System.out.println("Mayority: "+ m.majority(true, false, false));

        String[] text1 = {"Test 1", "Test 2", "Test 3", "Platzhalter"};
        String[] text2 = {"Test 1", "Test 2", "Test 3", "Test 4"};

        System.out.println(Arrays.toString(m.textFilter(text1,text2)));*/

    }
}