import java.util.Scanner;

public class GuessingGame
{
	public static void main(String[] args)
	{
		int answer = (int)(Math.random()*20 + 1);
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number between 1 and 20: ");
		int guess = input.nextInt();
        while (guess != answer) {
            System.out.print("Try again.\nEnter a number between 1 and 20: ");
            guess = input.nextInt();
        }
		System.out.print("You won!\n");
	}
}
