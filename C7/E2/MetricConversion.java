import java.io.*;
import java.util.*;

public class MetricConversion
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a number: ");
        double n = Double.parseDouble(br.readLine());
        System.out.printf("\nCovert:\n%-30s%-30s\n%-30s%-30s\n%-30s%-30s\n%-30s%-30s\n\nEnter your choice: ",  "1. Inches to Centimeters", "5. Centimeters to Inches", "2. Feet to Centimeters", "6. Centimeters to Feet", "3. Yards to Meters", "7. Meters to Yards", "4. Miles to Kilometers", "8. Kilometers to Miles");
        int c = Integer.parseInt(br.readLine());

        switch (c) {
            case 1:
                System.out.printf("\n%.1f inches equals %.1f centimeters.\n", n, itoc(n));
                break;
            case 2:
                System.out.printf("\n%.1f feet equals %.1f centimeters.\n", n, ftoc(n));
                break;
            case 3:
                System.out.printf("\n%.1f yards equals %.1f meters.\n", n, ytom(n));
                break;
            case 4:
                System.out.printf("\n%.1f miles equals %.1f kilometers.\n", n, mtok(n));
                break;
            case 5:
                ctoi(n);
                break;
            case 6:
                ctof(n);
                break;
            case 7:
                mtoy(n);
                break;
            case 8:
                ktom(n);
                break;
        }
    }

    public static double itoc(double n)
    {
        return n*2.54;
    }

    public static double ftoc(double n)
    {
        return n*30;
    }

    public static double ytom(double n)
    {
        return n*0.91;
    }

    public static double mtok(double n)
    {
        return n*1.6;
    }

    public static void ctoi(double n)
    {
        System.out.printf("\n%.1f centimeters equals %.1f inches.\n", n, n/2.54);
    }

    public static void ctof(double n)
    {
        System.out.printf("\n%.1f centimeters equals %.1f feet.\n", n, n/30);
    }

    public static void mtoy(double n)
    {
        System.out.printf("\n%.1f meters equals %.1f yards.\n", n, n/0.91);
    }

    public static void ktom(double n)
    {
        System.out.printf("\n%.1f kilometers equals %.1f miles.\n", n, n/1.6);
    }
}
