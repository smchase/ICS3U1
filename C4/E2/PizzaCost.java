import java.util.Scanner;

public class PizzaCost
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double size;

        System.out.println("Enter the diameter of the pizza in inches: ");
        size = input.nextDouble();

        System.out.printf("The cost of making the pizza is: $%.2f\n\n", 1.75+(size*size*0.05));
    }
}
