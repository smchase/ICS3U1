import java.util.Scanner;

public class PackageCheck
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the package weight in kilograms: ");
        double weight = input.nextDouble();
        System.out.print("Enter the package height in centimeters: ");
        double length = input.nextDouble();
        System.out.print("Enter the package width in centimeters: ");
        double width = input.nextDouble();
        System.out.print("Enter the package height in centimeters: ");
        double height = input.nextDouble();

        if (weight > 27 && length*width*height > 100000) {
            System.out.println("\nToo heavy and too large.");
        } else if (weight > 27) {
            System.out.println("\nToo heavy.");
        } else if (length*width*height > 100000) {
            System.out.println("\nToo large.");
        }
    }
}
