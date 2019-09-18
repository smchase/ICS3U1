import java.util.Scanner;

public class Project
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of minutes spent on each of the following project tasks:\n\nDesigning: ");
        double des = input.nextDouble();
        System.out.print("Coding: ");
        double cod = input.nextDouble();
        System.out.print("Debugging: ");
        double deb = input.nextDouble();
        System.out.print("Testing: ");
        double tes = input.nextDouble();

        System.out.printf("\nTask          %% Time\nDesigning:    %.2f %%\nCoding:       %.2f %%\nDebugging:    %.2f %%\nTesting:      %.2f %%\n\n", des/(des+cod+deb+tes)*100, cod/(des+cod+deb+tes)*100, deb/(des+cod+deb+tes)*100, tes/(des+cod+deb+tes)*100);
    }
}
