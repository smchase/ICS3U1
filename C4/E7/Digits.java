import java.util.Scanner;

public class Digits
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a three-digit number: ");
        String num = input.nextLine();

        System.out.printf("\nThe hundreds-place digit is: %c\nThe tens-place digit is: %c\nThe ones-place digit is: %c\n\n", num.charAt(0), num.charAt(1), num.charAt(2));
    }
}
