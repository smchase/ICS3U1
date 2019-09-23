import java.util.Scanner;

public class QuadraticEquation
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		double a, b, c, r1, r2;
		System.out.print("Enter value for a: ");
		a = input.nextDouble();
		System.out.print("Enter value for b: ");
		b = input.nextDouble();
		System.out.print("Enter value for c: ");
		c = input.nextDouble();

		r1 = (-b + Math.sqrt(b*b -4*a*c))/(2*a);
		r2 = (-b - Math.sqrt(b*b -4*a*c))/(2*a);
		System.out.printf("The roots are %.1f and %.1f\n", r1, r2);
	}
}
