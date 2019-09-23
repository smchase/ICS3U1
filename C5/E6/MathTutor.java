import java.util.Scanner;

public class MathTutor
{
    public static void main(String[] args)
    {
        int num1 = (int)(10*Math.random() + 1), num2 = (int)(10*Math.random() + 1), operator = (int)(4*Math.random()), answer;
        Scanner input = new Scanner(System.in);

        switch (operator) {
			case 0:
				System.out.printf("What is %d + %d? ", num1, num2);
		        answer = input.nextInt();
		        if (answer == num1+num2) {
		            System.out.println("Correct!");
		        } else {
		            System.out.println("Incorrect!");
		        }
				break;

			case 1:
				System.out.printf("What is %d - %d? ", num1, num2);
		        answer = input.nextInt();
		        if (answer == num1-num2) {
		            System.out.println("Correct!");
		        } else {
		            System.out.println("Incorrect!");
		        }
				break;

			case 2:
				System.out.printf("What is %d * %d? ", num1, num2);
		        answer = input.nextInt();
		        if (answer == num1*num2) {
		            System.out.println("Correct!");
		        } else {
		            System.out.println("Incorrect!");
		        }
				break;

			case 3:
				System.out.printf("What is %d / %d? ", num1, num2);
		        answer = input.nextInt();
		        if (answer == num1/num2) {
		            System.out.println("Correct!");
		        } else {
		            System.out.println("Incorrect!");
		        }
				break;
		}
    }
}
