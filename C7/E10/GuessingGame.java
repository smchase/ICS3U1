import java.io.*;
import java.util.*;

public class GuessingGame
{
	public static void main(String[] args) throws Exception
	{
		int answer = (int)(Math.random()*20 + 1);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number between 1 and 20: ");
		int guess = Integer.parseInt(br.readLine());
        while (guess != answer) {
			giveHint(guess, answer);
            System.out.print("\nEnter a number between 1 and 20: ");
			guess = Integer.parseInt(br.readLine());
        }
		System.out.print("You won!\n");
	}

	public static void giveHint(int in, int ans)
	{
		if (in < ans) System.out.println("Hint: try a higher number");
		else System.out.println("Hint: try a lower number");
	}
}
