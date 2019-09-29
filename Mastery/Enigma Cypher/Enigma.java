import java.util.Scanner;

public class Enigma
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
		System.out.print("Enter encrypted message: ");
        String msg = input.nextLine(), a = "ABCDEFGHIJKLMNOPQRSTUVWXYZ.", c1 = "DBUZ.SNPVLKCGJOYEIWTQMFXARH", c2 = "FIYGZKJHABTSCDXVRN.LUMWQOEP";

		for (int i = 0; i < msg.length(); i++) {
			System.out.print(a.charAt(c1.indexOf(a.charAt(c2.indexOf(msg.charAt(i))))));
			c1 = c1.substring(1, 27) + c1.substring(0, 1);
			if (i%27 == 26) {
				c2 = c2.substring(1, 27) + c2.substring(0, 1);
			}
		}
		System.out.println();
    }
}
