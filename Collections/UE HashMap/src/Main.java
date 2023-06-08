import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main
{
    public static void main(String[] args)
    {
        TextUtils textUtils = new TextUtils();

        try
        {
            String text = readTextFile("C:\\Users\\lukas.wagner\\Desktop\\textdatei.txt");

            textUtils.readText(text);

            textUtils.showWordCount();

            String wort = "Hallo";
            int frequency = textUtils.getFrequency(wort);
            System.out.println("Häufigkeit " + wort + " : " + frequency);

            String mostFrequentWord = textUtils.getMostFrequentWord();


        }
        catch (Exception e)
        {
            throw new RuntimeException(e);
        }
    }

    private static String readTextFile(String fileName) throws Exception
    {
        String text = "";
        text = new String(Files.readAllBytes(Paths.get(fileName)));

        return text;
    }
}