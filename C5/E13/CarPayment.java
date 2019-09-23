import java.util.Scanner;

public class CarPayment
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double p, r, m, mp;
		System.out.print("Principal: ");
		p = input.nextDouble();
		System.out.print("Interest Rate: ");
		r = input.nextDouble();
		System.out.print("Number of monthly payments: ");
		m = input.nextDouble();

		mp = p * (r/12) / (1 - Math.pow(1 + r/12, -m));
		System.out.printf("The monthly payment is: $%.2f\n", mp);
	}
}
