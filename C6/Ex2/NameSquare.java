import java.util.Scanner;

public class NameSquare
{
    public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a name: ");
		String name = input.nextLine().toUpperCase();

		System.out.printf("\n%s\n", name);

		for (int i = 1; i < name.length()-1; i++) {
			for (int n = 0; n < name.length(); n++) {
				if (n == 0) {
					System.out.printf("%c", name.charAt(i));
				} else if (n == name.length()-1) {
					System.out.printf("%c", name.charAt(name.length()-1-i));
				} else {
					System.out.print("*");
				}
			}
			System.out.print("\n");
		}

		for (int i = name.length()-1; i >= 0; i--) {
			System.out.printf("%c", name.charAt(i));
		}
		System.out.print("\n");
	}
}
