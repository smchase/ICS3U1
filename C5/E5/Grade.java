import java.util.Scanner;

public class Grade
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the percentage: ");
        int grade = input.nextInt();
        if (grade < 60) {
            System.out.println("The corresponding letter grade is: F");
        } else if (grade < 70) {
            System.out.println("The corresponding letter grade is: D");
        } else if (grade < 80) {
            System.out.println("The corresponding letter grade is: C");
        } else if (grade < 90) {
            System.out.println("The corresponding letter grade is: B");
        } else {
            System.out.println("The corresponding letter grade is: A");
        }
    }
}
