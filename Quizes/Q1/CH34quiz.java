import java.util.Scanner;

public class CH34quiz
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        double amount = input.nextDouble();
        System.out.print("enter the principal: ");
        double principal = input.nextDouble();
        System.out.print("Enter the rate: ");
        double rate = input.nextDouble();
        System.out.printf("\nThe time period is %.1f\n", (amount/principal - 1)/rate);
    }
}
