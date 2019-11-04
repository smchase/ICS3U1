import java.io.*;
import java.util.*;

public class WordCount
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new FileReader("source.txt"));
        ArrayList<String> words = new ArrayList<>();
        String line;
        int start, end;
        double total = 0;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
            start = -1;
            end = -1;
            for (int i = 0; i < line.length(); i++) {
                if ("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".contains(line.substring(i, i+1))) {
                    if (start == -1) {
                        start = i;
                    }
                } else {
                    if (end == -1 && start > -1) {
                        end = i;
                    }
                }
                if (i == line.length()-1) {
                    end = i+1;
                }
                if (start > -1 && end > -1) {
                    words.add(line.substring(start, end));
                    start = -1;
                    end = -1;
                }
            }
        }
        for (int i = 0; i < words.size(); i++) {
            total += words.get(i).length();
        }
        System.out.printf("Word count: %d\nAverage word length: %.1f\n", words.size(), total/words.size());
    }
}
