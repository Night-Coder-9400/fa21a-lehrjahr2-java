import java.util.HashSet;
import java.util.Scanner;

public class Aufgabe_5
{
    public static void teil_eins()
    {
        HashSet<String> postleitzahlen = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie 10 Postleitzahlen ein:");

        for (int i = 0; i < 10; i++) {
            String plz = scanner.nextLine();
            postleitzahlen.add(plz);
        }

        System.out.println("Die eingegebenen Postleitzahlen ohne Duplikate:");

        for (String plz : postleitzahlen) {
            System.out.println(plz);
        }
    }

    public static void teil_zwei()
    {
        HashSet<String> postleitzahlen_eins = new HashSet<>();
        HashSet<String> postleitzahlen_zwei = new HashSet<>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie ersten 5 Postleitzahlen ein:");

        for (int i = 0; i < 5; i++) {
            String plz = scanner.nextLine();
            postleitzahlen_eins.add(plz);
        }

        System.out.println("Geben Sie die zweiten 5 Postleitzahlen ein:");

        for (int i = 0; i < 5; i++){
            String plz = scanner.nextLine();
            postleitzahlen_zwei.add(plz);
        }

        postleitzahlen_eins.retainAll(postleitzahlen_zwei);

        for (String plz : postleitzahlen_eins) {
            System.out.println(plz);
        }
    }
}
