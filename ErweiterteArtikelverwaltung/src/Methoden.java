public class Methoden
{
    public static double max3(double x, double y, double z)
    {
        double maxValue = 0.00;

        if(x > y)
        {
            maxValue = x;
        }
        else if(maxValue < y)
        {
            maxValue = y;
        }
        else
        {
            maxValue = z;
        }
        return maxValue;
    }

    // ohne if...wenn zwei true dann true
    public static boolean majority(boolean a, boolean b, boolean c)
    {
        //? : Bedingungsoperator
        return a && b == true || b && c == true || a && c == true ? true : false;
    }

    public static  String[] textFilter(String []text1, String []text2)
    {
        String value = "";
        String returnArray[] = new String[text1.length];

        for(int i = 0; i < text1.length; i++)
        {
         for (int j = 0; j < text2.length; j++)
         {
            if(text1[i] != (text2[j]))
            {
                value = text1[i];
                returnArray[i] = value;
            }
            else{
                returnArray[i] = " - ";
                i++;
            }
         }
        }
        //es soll nur das zurückgegeben werden, was in text1 vorkommt und nicht in text2

        return returnArray;
    }
}

//Regel für statische Methoden
//eine statische Methode gehört zu einer Klasse und nicht zu einem Objekt einer Klasse
//eine statische Methode kann aufgerufen werden, ohne das eine Instanz einer Klasse erstellt, werden muss
//die statische Methode kann auf statische Datenelemente zugreifen und kann statische Methoden direkt aufrufen