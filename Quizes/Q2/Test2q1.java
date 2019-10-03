import java.io.*;
import java.util.*;

public class Test2q1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your height: ");
        double h = input.nextDouble();
        System.out.print("Enter your weight: ");
        double w = input.nextDouble();
        System.out.print("Enter your pulse pressure: ");
        double p = input.nextDouble();
        System.out.print("Enter your diastolic pressure: ");
        double d = input.nextDouble();

        if (h <= 137 || w < 60) {
            System.out.println("Cannot ride.");
        } else if (h > 221 || w > 300) {
            System.out.println("Cannot ride.");
        } else if (d+p/3 < 60) {
            System.out.println("Cannot ride.");
        } else {
            System.out.println("Can ride.");
        }
    }
}
