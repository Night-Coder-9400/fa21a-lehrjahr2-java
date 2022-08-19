import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\\n");

        System.out.println("1. Erstellung von Arrays");
        System.out.println("2. Ausdrücke als Index");
        System.out.println("3. Iteration über Arrays");

        String auswahl = scanner.next();

        switch (auswahl)
        {
            case "1":
                System.out.println("Erstellen von Arrays auf zwei verschiedene Weisen.");
                break;
            case "2":
                AusdrueckeAlsIndex ausdrueckeAlsIndex = new AusdrueckeAlsIndex();
                ausdrueckeAlsIndex.Aufgabe2();
                break;
            case "3":
                IterationUeberArrays iterationUeberArrays = new IterationUeberArrays();
                iterationUeberArrays.Aufgabe3();
                break;
            default:
                System.out.println("Das war keine gültige auswahl!");
        }
    }
}