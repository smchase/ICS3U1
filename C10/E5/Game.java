import java.io.*;
import java.util.*;

public class Game
{
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int p, c, pC, cC, t = 0;
	String a = "", g = "";

	public Game(int pegs, int colors)
	{
		p = pegs;
		c = colors;
	}

	public void start()
	{
		for (int i = 0; i < p; i++) {
			a += String.valueOf(Math.random()*c+1).charAt(0);
		}
		System.out.print("+: 1 correct peg\n-: 1 correct color\n");
	}

	public void play() throws Exception
	{
		t++;
		g = "";
		while (g.length() != a.length()) {
			System.out.printf("Guess %d: ", a.length());
			g = br.readLine();
		}
		pC = 0;
		cC = 0;
		for (int i = 0; i < p; i++) {
			if (g.charAt(i) == a.charAt(i)) {
				pC++;
			}
		}
		for (int i = 1; i <= c; i++) {
			cC += Math.min(a.length()-a.replace(String.valueOf(i), "").length(), g.length()-g.replace(String.valueOf(i), "").length());
		}
		for (int i = 0; i < pC; i++) {
			System.out.print("+");
		}
		for (int i = 0; i < cC; i++) {
			System.out.print("-");
		}
		System.out.print("\n");
	}

	public void end()
	{
		System.out.printf("You have cracked the code in %d tries.\n", t);
	}

	public boolean solved()
	{
		return a.equals(g);
	}
}
