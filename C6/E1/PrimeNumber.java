import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number to start at (inclusive): ");
        int start = input.nextInt();
        System.out.print("Enter the number to end at (inclusive): ");
        int end = input.nextInt();

        boolean prime;
        if (start == end) {
            prime = true;
            for (int i = 2; i < start; i++) {
                if (start%i == 0) {
                    prime = false;
                }
            }
            if (prime) {
                System.out.printf("%d is prime.", start);
            } else {
                System.out.printf("%d is not prime.", start);
            }
        } else {
            System.out.print("Prime numbers:");
            for (int n = start; n <= end; n++) {
                prime = true;
                for (int i = 2; i < n; i++) {
                    if (n%i == 0) {
                        prime = false;
                    }
                }
                if (prime) {
                    System.out.printf(" %d", n);
                }
            }
        }
    }
}
