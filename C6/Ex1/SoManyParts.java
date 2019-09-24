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

        System.out.print("d) ");
        for (int i = 0; i < s.length(); i++) {
            System.out.printf("%c", Character.toUpperCase(s.charAt(i)));
        }
        System.out.print("\n");

        System.out.print("e) ");
        for (int i = 0; i < s.length(); i++) {
            System.out.printf("%c", Character.toLowerCase(s.charAt(i)));
        }
        System.out.print("\n");

        int v = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o' || s.charAt(i) == 'u') {
                v++;
            }
        }
        System.out.printf("f) %d\n", v);

        int c = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u') {
                c++;
            }
        }
        System.out.printf("g) %d\n", c); NOT GOOD
    }
}
