import java.io.*;
import java.util.*;

public class Mastermind
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int p = 0, c = 0;
		while (p < 1 || p > 10 || c < 1 || c > 9) {
			System.out.print("Enter the number of pegs <1-10>: ");
			p = Integer.parseInt(br.readLine());
			System.out.print("Enter the number of colors <1-9>: ");
			c = Integer.parseInt(br.readLine());
		}
		Game g = new Game(p, c);
		g.start();
		while (!g.solved()) {
			g.play();
		}
		g.end();
	}
}
