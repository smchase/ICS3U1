import java.util.Scanner;

public class Luhn
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number to validate: ");
        String num = input.nextLine();
        int sum = 0, temp;

        for (int i = num.length()-2; i >= 0; i -= 2) {
            temp = Character.getNumericValue(num.charAt(i))*2;
            if (temp > 9) {
                temp -= 9;
            }
            num = num.substring(0, i) + Integer.toString(temp) + num.substring(i+1, num.length());
        }

        for (int i = num.length()-1; i >= 0; i--) {
            sum += Character.getNumericValue(num.charAt(i));
        }
        if (sum%10 == 0) {
            System.out.print("Valid.\n");
        } else {
            System.out.print("Invalid.\n");
        }
    }
}
