import java.util.Scanner;

public class MathTutor
{
    public static void main(String[] args)
    {
        int num1 = (int)(10*Math.random() + 1), num2 = (int)(10*Math.random() + 1), operator = (int)(4*Math.random() + 1);
        Scanner input = new Scanner(System.in);
        System.out.printf("What is %d + %d? ", num1, num2);
        int answer = input.nextInt();
        if (answer == num1+num2) {
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
        }
        if (operator == 0)
    }
}
