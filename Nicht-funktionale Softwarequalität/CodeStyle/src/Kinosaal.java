import java.util.Random;

public class Kinosaal
{
    public static boolean[][] erzeugeSitzplan(int belegungsProzent)
    {
        final int reihe = 9;
        final int sitzeProReihe = 30;

        int seed = 123;
        Random random = new Random(seed);

        boolean[][] sitzplan = new boolean[reihe][sitzeProReihe];

        for (int i = 0; i < reihe; i++)
        {
            for (int j = 0; j < sitzeProReihe; j++)
            {
                int zufall = random.nextInt(100);
                if (zufall < belegungsProzent)
                {
                    sitzplan[i][j] = true;
                }
                else
                {
                    sitzplan[i][j] = false;
                }
            }
        }

        return sitzplan;
    }

    public static void zeigeSitzplan(boolean[][] sitzplan)
    {
        for (int j = 0; j < sitzplan[0].length + 1; j++)
        {
            if (j == 0)
            {
                System.out.print(j + " ");
            }
            else if (j > 9)
            {
                System.out.print("  " + j + " |");
            }
            else
            {
                System.out.print("  " + j + "  |");
            }
        }
        System.out.print("\n");
        for (int i = 0; i < sitzplan.length; i++)
        {
            System.out.print(i + 1 + ": ");
            for (int j = 0; j < sitzplan[i].length; j++)
            {
                if (sitzplan[i][j] == true)
                {
                    System.out.print("[B]");
                }
                else
                {
                    System.out.print("[F]");
                }
                System.out.print(" | ");
            }
            System.out.print("\n");
        }
    }

    public static int findeFreiePlaetze(boolean[][] sitzplan, int anzahlSitze)
    {
        int anzahlFrei = 0;
        for (int reihe = 0; reihe < sitzplan.length; reihe++)
        {
            for (int sitz = 0; sitz < sitzplan[reihe].length; sitz++)
            {
                if (sitzplan[reihe][sitz] == false)
                {
                    anzahlFrei++;
                }
                else
                {
                    anzahlFrei = 0;
                }

                if (anzahlFrei == anzahlSitze)
                {
                    int ersterFreierSitz = (sitz+1) - (anzahlSitze-1);
                    for (int i = 0; i < anzahlSitze; i++)
                    {
                        sitzplan[reihe][ersterFreierSitz + i -1] = true;
                    }
                    return (reihe+1) * 100 + ersterFreierSitz;
                }
            }
            anzahlFrei = 0;
        }
        return 0;
    }

    public static int findeFreiePlaetze(boolean[][] sitzplan, int anzahlSitze, int reihe)
    {
        reihe = reihe-1;
        int anzahlFrei = 0;
        for (int sitz = 0; sitz < sitzplan[reihe].length; sitz++)
        {
            if (sitzplan[reihe][sitz] == false)
            {
                anzahlFrei++;
            }
            else
            {
                anzahlFrei = 0;
            }

            if (anzahlFrei == anzahlSitze)
            {
                int ersterFreierSitz = (sitz+1) - (anzahlSitze-1);
                for (int i = 0; i < anzahlSitze; i++)
                {
                    sitzplan[reihe][ersterFreierSitz + i -1] = true;
                }
                return (reihe+1) * 100 + ersterFreierSitz;
            }
        }
        return 0;
    }
}
