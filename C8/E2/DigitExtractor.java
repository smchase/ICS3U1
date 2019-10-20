import java.io.*;
import java.util.*;

public class DigitExtractor
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter an integer: ");
		Num n = new Num(Integer.parseInt(br.readLine()));
		char c = 'w';
		while (c != 'q') {
			System.out.print("\nshow (W)ole number\nshow (O)nes place number\nshow (T)ens place number\nshow (H)undreds place number\n(Q)uit\nEnter your choice: ");
			c = Character.toLowerCase(br.readLine().charAt(0));
			switch (c) {
				case 'w':
					n.showWhole();
					break;
				case 'o':
					n.showPlace(1);
					break;
				case 't':
					n.showPlace(10);
					break;
				case 'h':
					n.showPlace(100);
					break;
			}
		}
	}
}
