import java.io.*;
import java.util.*;

public class Ch78Test
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter an order amount: $");
        double amt = sc.nextDouble();
        CalcTax ct = new CalcTax();
        double tr = ct.Taxrate(amt);
        double tax = amt*tr/100;
        double total = amt+tax;
        Delivery(total);
    }

    public static void Delivery(double t)
    {
        if (t < 1000) System.out.printf("Total: $%.2f\n", t+25);
        else if (t < 5000) System.out.printf("Total: $%.2f\n", t+65);
        else System.out.printf("Total: $%.2f\n", t+85);
        return;
    }
}
