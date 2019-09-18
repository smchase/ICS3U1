import java.util.Scanner;

public class DivAndMod
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter a second integer: ");
        int num2 = input.nextInt();

        System.out.printf("\n%d / %d = %d\n%d %% %d = %d\n\n%d / %d = %d\n%d %% %d = %d\n\n", num1, num2, num1/num2, num1, num2, num1%num2, num2, num1, num2/num1, num2, num1, num2%num1);
    }
}
