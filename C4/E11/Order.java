import java.util.Scanner;

public class Order
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of burgers: ");
        int b = input.nextInt();
        System.out.print("Enter the number of fries: ");
        int f = input.nextInt();
        System.out.print("Enter the number of sodas: ");
        int s = input.nextInt();

        double t = b*1.69 + f*1.09 + s*0.99;

        System.out.printf("\nTotal before tax: $%.2f\nTax: $%.2f\nFinal total: $%.2f\n\nEnter amount tendered: $", t, t*0.065, t*1.065);
        double c = input.nextDouble();
        System.out.printf("Change: $%.2f", c-t*1.065);
    }
}
