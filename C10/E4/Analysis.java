import java.io.*;
import java.util.*;

public class Analysis
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, modes = new int[50];
        for (int i = 0; i < 50; i++) {
            modes[i] = 0;
        }
        System.out.println("Enter numbers seperated by spaces all on one line below");
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n, total = 0, sum = 0, max = 0, min = 51, mode = -1, modeN = -1;
        while (st.hasMoreTokens()) {
            n = Integer.parseInt(st.nextToken());
            if (n > 0 && n <= 5) {
                arr[0]++;
            } else if (n <= 10) {
                arr[1]++;
            } else if (n <= 15) {
                arr[2]++;
            } else if (n <= 20) {
                arr[3]++;
            } else if (n <= 25) {
                arr[4]++;
            } else if (n <= 30) {
                arr[5]++;
            } else if (n <= 35) {
                arr[6]++;
            } else if (n <= 40) {
                arr[7]++;
            } else if (n <= 45) {
                arr[8]++;
            } else if (n <= 50) {
                arr[9]++;
            }
            sum += n;
            total++;
            if (n > max) max = n;
            if (n < min) min = n;
            modes[n-1]++;
        }
        for (int i = 0; i < 50; i++) {
            if (modes[i] > modeN) {
                modeN = modes[i];
                mode = i+1;
            }
        }
        System.out.printf("Average: %.1f\nMax: %d\nRange: %d\nMode: %d\nHistogram:\n1-5: %d\n6-10: %d\n11-15: %d\n16-20: %d\n21-25: %d\n26-30: %d\n31-35: %d\n36-40: %d\n41-45: %d\n46-50: %d\n", (double)sum/(double)total, max, max-min, mode, arr[0], arr[1], arr[2], arr[3], arr[4], arr[5], arr[6], arr[7], arr[8], arr[9]);
    }
}
