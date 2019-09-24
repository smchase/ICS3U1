import java.util.Scanner;

public class Monogram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your first name: ");
        char f = input.nextLine().charAt(0);
        System.out.print("Enter your middle initial: ");
        char m = input.nextLine().charAt(0);
        System.out.print("Enter your last name: ");
        char l = input.nextLine().charAt(0);
        System.out.printf("%c%c%c\n", Character.toLowerCase(f), Character.toUpperCase(l), Character.toLowerCase(m));
    }
}
