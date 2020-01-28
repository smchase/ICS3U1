package examq2;

import java.io.*;

public class ExamQ2
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.printf("%d\n%d\n%s\n%s\n", s.length()-s.replace(" ", "").length()+1, s.length()-s.replace("a", "").length(), s.contains("we")?"YES":"NO", s.toUpperCase());
    }
}
