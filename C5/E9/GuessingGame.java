import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args)
	{
		int answer = (int)(Math.random()*20 + 1);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 20: ");
		int guess = input.nextInt();
		System.out.printf("Computer's Number: %d\nPlayer's Number: %d\n%s\n", answer, guess, guess==answer ? "You won!" : "Better luck next time.");
	}
}
