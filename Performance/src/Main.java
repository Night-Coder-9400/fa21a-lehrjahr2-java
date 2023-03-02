import java.util.Arrays;
import java.util.Random;

public class Main
{
    public static void main(String[] args)
    {
        long startTime = System.nanoTime();
        countCommas("Hallo, wie,,, geht es dir?");
        long endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        startTime =System.nanoTime();
        countCommas("Hallo, wie,,, geht es dir?", 0);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        int seed = 123;
        Random random = new Random(seed);

        int[] randomArray = new int[222];

        for (int i = 0; i < randomArray.length; i++)
        {
            int zufall = random.nextInt(12222);
            randomArray[i] = zufall;
        }

        int[] randomArraySort = randomArray.clone();


        //int[] unsortiert = { 4, 1, 8, -3, 5, 7, 8, 10 };
        //ohne Array.sort
        startTime = System.nanoTime();
        int[] sortiert = selectionsort(randomArray);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);

        System.out.println(Arrays.toString(sortiert));

        //int[] unsortiert1 = { 4, 1, 8, -3, 5, 7, 8, 10 };
        //Array.sort
        startTime = System.nanoTime();
        Arrays.sort(randomArraySort);
        endTime = System.nanoTime();
        System.out.println(endTime - startTime);
        System.out.println(Arrays.toString(randomArraySort));

    }

    static int countCommas(String text ,int count) {
        if (text.equals(""))
        {
            return count;
        }
        if (text.charAt(0) == ',')
        {
            return countCommas(text.substring(1), count+1);
        }
        else
        {
            return countCommas(text.substring(1), count);
        }
    }

    static int countCommas (String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ',') {
                count++;
            }
        }
        return count;
    }


    public static int[] selectionsort(int[] sortieren) {
        for (int i = 0; i < sortieren.length - 1; i++) {
            for (int j = i + 1; j < sortieren.length; j++) {
                if (sortieren[i] > sortieren[j]) {
                    int temp = sortieren[i];
                    sortieren[i] = sortieren[j];
                    sortieren[j] = temp;
                }
            }
        }

        return sortieren;
    }

}