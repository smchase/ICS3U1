import java.util.Scanner;

public class TrigFunctions
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an angle in degrees: ");
		double a = Math.toRadians(input.nextDouble());
		System.out.printf("Sine: %.2f\nCosine: %.2f\nTangent: %.2f\n", Math.sin(a), Math.cos(a), Math.tan(a));
	}
}
