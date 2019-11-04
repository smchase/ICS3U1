import java.io.*;
import java.util.*;

public class TestProcessor
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("source.txt"));
        String key = br.readLine(), line;
        double score;
        while ((line = br.readLine()) != null) {
            System.out.printf("%-10.10s ", line);
            line = br.readLine();
            score = 0;
            for (int i = 0; i < line.length(); i++) {
                if (line.charAt(i) == key.charAt(i)) {
                    score++;
                }
            }
            System.out.printf("%d%%\n", (int)(score/key.length()*100));
        }
    }
}
