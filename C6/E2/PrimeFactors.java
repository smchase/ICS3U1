import java.util.Scanner;

public class PrimeFactors
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter a positive integer: ");
        int n = input.nextInt();

        System.out.print("Prime factors:");
        int c = 2;
        while (c <= n) {
            if (n%c == 0) {
                System.out.printf(" %d", c);
                n /= c;
            } else {
                c++;
            }
        }
    }
}
