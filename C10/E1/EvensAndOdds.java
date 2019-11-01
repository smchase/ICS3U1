import java.io.*;
import java.util.*;

public class EvensAndOdds
{
    public static void main(String[] args) throws Exception
    {
        int[] arr = new int[25];
        for (int i = 0; i < 25; i++) {
            arr[i] = (int)(Math.random()*100);
        }
        System.out.print("ODD:\n");
        for (int i = 0; i < 25; i++) {
            if (arr[i]%2 == 1)
                System.out.print(arr[i]+" ");
        }
        System.out.print("\nEVEN:\n");
        for (int i = 0; i < 25; i++) {
            if (arr[i]%2 == 0)
                System.out.print(arr[i]+" ");
        }
        System.out.print("\n");
    }
}
