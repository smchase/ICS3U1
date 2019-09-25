import java.util.Scanner;

public class SoManyParts
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = input.nextLine();

        System.out.printf("a) %d\n", s.length());

        System.out.printf("b) %d\n", s.length()-s.replace(" ", "").length()+1);

        System.out.print("c) ");
        for (int i = s.length()-1; i >= 0; i--) {
            System.out.printf("%c", s.charAt(i));
        }
        System.out.print("\n");

		System.out.printf("d) %s\n", s.toUpperCase());

        System.out.printf("e) %s\n", s.toLowerCase());

        int v = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) == 'a' || Character.toLowerCase(s.charAt(i)) == 'e' || Character.toLowerCase(s.charAt(i)) == 'i' || Character.toLowerCase(s.charAt(i)) == 'o' || Character.toLowerCase(s.charAt(i)) == 'u') {
                v++;
            }
        }
        System.out.printf("f) %d\n", v);

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.toLowerCase(s.charAt(i)) >= 'a' && Character.toLowerCase(s.charAt(i)) <= 'z' && Character.toLowerCase(s.charAt(i)) != 'a' && Character.toLowerCase(s.charAt(i)) != 'e' && Character.toLowerCase(s.charAt(i)) != 'i' && Character.toLowerCase(s.charAt(i)) != 'o' && Character.toLowerCase(s.charAt(i)) != 'u') {
                c++;
            }
        }
        System.out.printf("g) %d\n", c);

		System.out.print("h)");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				break;
			}
			System.out.printf(" %d", (int)s.charAt(i));
		}
		System.out.print("\n");

		System.out.printf("i) %s\n", s.toLowerCase().indexOf(" and ") == -1 ? "No" : "Yes");

		System.out.print("j)");
		if (s.toLowerCase().indexOf("aa") != -1) {
			System.out.print(" A");
		}
		if (s.toLowerCase().indexOf("ee") != -1) {
			System.out.print(" E");
		}
		if (s.toLowerCase().indexOf("ii") != -1) {
			System.out.print(" I");
		}
		if (s.toLowerCase().indexOf("oo") != -1) {
			System.out.print(" O");
		}
		if (s.toLowerCase().indexOf("uu") != -1) {
			System.out.print(" U");
		}
		System.out.print("\n");

		int u = 0;
		System.out.print("k) ");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
				u++;
			}
		}
		System.out.printf("%d\n", u);

		int l = 0;
		System.out.print("l) ");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				l++;
			}
		}
		System.out.printf("%d\n", l);

		int p = 0;
		System.out.print("m) ");
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ',' || s.charAt(i) == '.' || s.charAt(i) == ';' || s.charAt(i) == ':' || s.charAt(i) == '!' || s.charAt(i) == '?') {
				p++;
			}
		}
		System.out.printf("%d\n", p);
    }
}
