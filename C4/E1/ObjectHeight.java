import java.util.Scanner;

public class ObjectHeight
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        double time;

        System.out.println("Enter a time less than 4.5 seconds: ");
        time = input.nextDouble();

        System.out.printf("The height of the object is: %.1f\n\n", 100-(time*time*4.9));
    }
}
