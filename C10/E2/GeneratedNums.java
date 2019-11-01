import java.io.*;
import java.util.*;

public class GeneratedNums
{
    public static void main(String[] args) throws Exception
    {
        int[] arr = new int[101];
        System.out.printf("%-10s%-20s\n", "Index", "Generated Number");
        for (int i = 0; i < 101; i++) {
            arr[i] = i+i%10+(int)(i/10)%10+(int)(i/100)%10;
            System.out.printf("%-10s%-20s\n", i, arr[i]);
        }
    }
}
