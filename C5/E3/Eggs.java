import java.util.Scanner;

public class Eggs
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of eggs purchased: ");
        int eggs = input.nextInt();
        if (eggs >= 11*12) {
            System.out.printf("The bill is equal to: $%.2f", eggs*0.35/12);
        } else if (eggs >= 6*12) {
            System.out.printf("The bill is equal to: $%.2f", eggs*0.4/12);
        } else if (eggs >= 4*12) {
            System.out.printf("The bill is equal to: $%.2f", eggs*0.45/12);
        } else {
            System.out.printf("The bill is equal to: $%.2f", eggs*0.5/12);
        }
    }
}
