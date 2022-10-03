import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Uebung1 uebung1 = new Uebung1();

        int[] array = new int[random.nextInt(50)];

        System.out.println("Welche Aufgabe soll ausgegeben werden?");
        System.out.println("1. Summe, Durchschnitt und Maximum eines Arrays");
        System.out.println("2. PQ-Formel mit zufälligen Werten");
        String auswahl = scanner.next();
        scanner.close();

        switch (auswahl)
        {
            case "1":

                for(int i = 0; i < array.length; i++)
                {
                    array[i] = random.nextInt(50);
                    System.out.print(array[i] + ", ");
                }

                System.out.println();
                System.out.println("Summe: " + uebung1.arr_sum(array));
                System.out.println("Average: " + uebung1.arr_avg(array));
                System.out.println("Maximum: " + uebung1.arr_max(array));

                break;

            case "2":

                double p = random.nextDouble(1, 50);
                double q = random.nextDouble(1, 50);

                System.out.println("Die Werte der PQ-Formel lauten: " + p + ", " + q);
                System.out.println(Arrays.toString(uebung1.pq(p + 1, q + 1)));

                break;
                
            default:
                System.out.println("Das war leider keine gültige Auswahl");

        }



    }
}