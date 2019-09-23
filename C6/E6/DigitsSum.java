import java.util.Scanner;

public class DigitsSum
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a positive integer: ");
        String n = input.nextLine();
        int t = 0;

        for (int i = 0; i < n.length(); i++) {
            t += Character.getNumericValue(n.charAt(i));
        }
        System.out.printf("The sum of the digits is: %d", t);
    }
}
