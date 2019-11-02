import java.io.*;
import java.util.*;

public class Game
{
	private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private int p, c, pC, cC, t = 0, n1, n2;
	private int[] a, g;
	String s;

	public Game(int pegs, int colors)
	{
		p = pegs;
		c = colors;
		a = new int[p];
		g = new int[p];
	}

	public void start()
	{
		for (int i = 0; i < p; i++) {
			a[i] = (int)(Math.random()*c+1);
		}
		System.out.print("+: 1 correct peg\n-: 1 correct color\n");
	}

	public void play() throws Exception
	{
		t++;
		s = "";
		while (s.length() != p) {
			System.out.printf("Guess %d: ", t);
			s = br.readLine();
		}
		for (int i = 0; i < p; i++) {
			g[i] = Integer.parseInt(s.substring(i, i+1));
		}
		pC = 0;
		cC = 0;
		for (int i = 0; i < p; i++) {
			if (g[i] == a[i]) {
				pC++;
			}
		}
		for (int i = 1; i <= c; i++) {
			n1 = 0;
			n2 = 0;
			for (int j = 0; j < p; j++) {
				if (a[j] == i) {
					n1++;
				}
				if (g[j] == i) {
					n2++;
				}
			}
			cC += Math.min(n1, n2);
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
		return Arrays.equals(g, a);
	}
}
