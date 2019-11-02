import java.io.*;
import java.util.*;

public class Palindrome
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter string: ");
		String s = br.readLine().toLowerCase().replace(" ", "");
		char[] f = new char[s.length()], b = new char[s.length()];
		for (int i = 0; i < s.length(); i++) {
			f[i] = s.charAt(i);
			b[s.length()-i-1] = s.charAt(i);
		}
		boolean p = true;
		for (int i = 0; i < s.length(); i++) {
			if (f[i] != b[i]) {
				p = false;
			}
		}
		System.out.println("Palindrome? " + p);
	}
}
