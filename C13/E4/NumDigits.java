import java.io.*;
import java.util.*;

public class NumDigits
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(numDigits(Integer.parseInt(br.readLine()), 0));
    }

    public static int numDigits(int num, int dig)
    {
        if (num == 0) {
            return dig+1;
        } else {
            return numDigits(num/10, dig+1);
        }
    }
}
