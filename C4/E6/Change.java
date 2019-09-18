import java.util.Scanner;

public class Change
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int cost;

        System.out.println("Enter the change in cents: ");
        cost = input.nextInt();

        System.out.printf("\nThe minimum number of coins is:\nQuarters: %d\n", cost/25);
        cost = cost%25;
        System.out.printf("Dimes: %d\n", cost/10);
        cost = cost%10;
        System.out.printf("Nickels: %d\n", cost/5);
        cost = cost%5;
        System.out.printf("Pennies: %d\n\n", cost);
    }
}
