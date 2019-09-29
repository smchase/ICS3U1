import java.io.*;
import java.util.*;

public class Rebel
{
    public static void main(String[] args) throws Exception
    {
        Scanner input = new Scanner(new File("data.txt"));
        String decoded = input.nextLine(), encoded = input.nextLine(), message = input.nextLine();

        char[] map = new char[95];
		Arrays.fill(map, '.');
        for (int i = 0; i < decoded.length(); i++) {
            map[(int)encoded.charAt(i)-32] = decoded.charAt(i);
        }

		for (int i = 0; i < message.length(); i++) {
			System.out.print(map[(int)message.charAt(i)-32]);
		}
		System.out.println();
    }
}
