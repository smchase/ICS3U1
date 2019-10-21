import java.io.*;
import java.util.*;

public class Adder
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Question q = new Question(0, 20);
        int in = 0, score = 0, tries = 0;

        do {
            if (tries == 3) {
                q.showAnswer();
				System.out.print("\n\n");
                tries = 0;
            }
            if (tries == 0) {
                q = new Question(0, 20);
                q.showQuestion();
            } else {
                q.showPrompt(tries);
            }

            in = Integer.parseInt(br.readLine());
            if (in == q.answer()) {
                if (tries == 0) {
					System.out.print("+5 points\n\n");
					score += 5;
				} else if (tries == 1) {
					System.out.print("+3 points\n\n");
					score += 3;
				} else {
					System.out.print("+1 point\n\n");
					score++;
				}
                tries = -1;
            }
            tries++;
        } while (in != 999);

		System.out.printf("\nYour score is: %d\n", score);
    }
}
