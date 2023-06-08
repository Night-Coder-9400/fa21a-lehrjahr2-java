import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class TextUtils
{
    public TextUtils()
    {
        this.hashMap = new HashMap();
    }
    private HashMap<String, Integer> hashMap;
    private Random random;

    public void readText(String text)
    {
        String[] woerter = text.split(" ");

        for (String wort : woerter)
        {
            wort = wort.toLowerCase();
            int counter = hashMap.getOrDefault(wort, 0);
            hashMap.put(wort, counter + 1);

        }
    }

    public void showWordCount()
    {
        for(String wort : hashMap.keySet())
        {
            int wordCount = hashMap.get(wort);
            System.out.println(wort + ": " + wordCount);
        }
    }

    public int getFrequency(String wort)
    {
       wort = wort.toLowerCase();

       return hashMap.getOrDefault(wort, 0);
    }

    public String getMostFrequentWord()
    {
        int maxFrequency = 0;
        String mostFrequentWord = null;

        for(Map.Entry<String, Integer> entry : hashMap.entrySet())
        {
            String word = entry.getKey();
            int frequency = entry.getValue();

            if(frequency > maxFrequency)
            {
                maxFrequency = frequency;
                mostFrequentWord = word;
            }
            else if (frequency == maxFrequency)
            {
                    if(random.nextBoolean())
                    {
                        mostFrequentWord = word;
                    }
            }
        }
        return mostFrequentWord;
    }

}
