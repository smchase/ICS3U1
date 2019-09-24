import java.util.Scanner;

public class RemoveString
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = input.nextLine();
        System.out.print("Enter a string: ");
        String phrase = input.nextLine();

        while (sentence.indexOf(phrase) != -1) {
            sentence =  sentence.substring(0, sentence.indexOf(phrase)) + sentence.substring(sentence.indexOf(phrase)+phrase.length(), sentence.length());
        }
        System.out.printf("%s\n", sentence);
    }
}
