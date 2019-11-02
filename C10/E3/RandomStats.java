import java.io.*;
import java.util.*;

public class RandomStats
{
    public static void main(String[] args) throws Exception
    {
        int[] arr = new int[500];
        for (int i = 0; i < 500; i++) {
            arr[i] = (int)(Math.random()*10);
        }
        System.out.printf("%-10s%-20s\n", "Number", "Occurrences");
        int c;
        for (int n = 0; n < 10; n++) {
            c = 0;
            for (int i = 0; i < 500; i++) {
                if (arr[i] == n)
                    c++;
            }
            System.out.printf("%-10s%-20s\n", String.valueOf(n), String.valueOf(c));
        }
    }
}
