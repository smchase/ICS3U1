import java.io.*;
import java.util.*;

public class AddCoins
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your total coins:\n\nQuarters: ");
        int q = Integer.parseInt(br.readLine());
        System.out.print("Dimes: ");
        int d = Integer.parseInt(br.readLine());
        System.out.print("Nickels: ");
        int n = Integer.parseInt(br.readLine());
        System.out.print("Pennies: ");
        int p = Integer.parseInt(br.readLine());
        System.out.printf("\nTotal: %s\n", getDollarAmount(q, d, n, p));
    }

    public static String getDollarAmount(int q, int d, int n, int p)
    {
        String s = String.valueOf(q*0.25+d*0.1+n*0.05+p*0.01);
        return "$" + s.substring(0, s.indexOf(".")+3);
    }
}
