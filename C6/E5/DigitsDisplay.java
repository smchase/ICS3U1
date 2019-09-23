import java.util.Scanner;

public class DigitsDisplay
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a positive integer: ");
        String n = input.nextLine();

        for (int i = 0; i < n.length(); i++) {
            System.out.println(n.charAt(i));
        }
    }
}
