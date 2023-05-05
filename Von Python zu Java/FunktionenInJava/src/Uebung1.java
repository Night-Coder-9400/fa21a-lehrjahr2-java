public class Uebung1
{
    public static int arr_sum(int[] array)
    {
        int summe = 0;

        for(int i = 0; i < array.length; i++)
        {
            summe = summe + array[i];
        }

        return summe;
    }

    public static double arr_avg(int[] array)
    {
        double avg = 0;
        avg = arr_sum(array)/array.length;

        return avg;
    }

    public static int arr_max(int[] array)
    {
        int max = array[0];

        for(int i = 1; i < array.length; i++)
        {
            if(array[i] > max)
            {
                max = array[i];
            }
        }

        return max;
    }

    public static double[] pq(double p, double q)
    {
        double[] result = new double[2];
        result[0] =  -(p/2) + Math.sqrt(Math.pow(p/2, 2) - q);
        result[1] = -(p/2) - Math.sqrt(Math.pow(p/2, 2) - q);

        return result;
    }
}
