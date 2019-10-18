import java.io.*;
import java.util.*;

public class HiLo
{
    public static void main(String[] args) throws Exception
    {
        System.out.print("High Low Game\n\nRULES\nNumbers 1 through 6 are low\nNumbers 8 through 13 are high\nNumber 7 is neither high now low\n");
        play(1, 1000);
    }

    public static void play(int t, int p) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.printf("\nYou have %d points.\n", p);
        int r;
        do {
            System.out.print("Enter points to risk: ");
            r = Integer.parseInt(br.readLine());
        } while (r > p);
        System.out.print("Predict (1=High, 0=Low): ");
        int in = Integer.parseInt(br.readLine());
        int n = (int)(1+Math.random()*13);
        System.out.printf("Number is %d.\n", n);
        if ((n < 7 && in == 0) || (n > 7 && in == 1)) {
            System.out.printf("You gained %d points.\n", r);
            p += r;
        } else {
            System.out.printf("You lost %d points.\n", r);
            p -= r;
        }
        if (p > 0) {
            play(t+1, p);
        } else {
            System.out.printf("\nIt took you %d turns to reach 0 points.\n", t);
        }
    }
}
