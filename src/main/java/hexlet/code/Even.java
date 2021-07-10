package hexlet.code;

import java.util.Scanner;

public class Even {

  public static void game() {
    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
    int count = 0;
    final int limit = 19;
    final int iterations = 3;

    do {
      int ask = (int) (Math.random() * limit) + 1;
      boolean isEven = ask % 2 == 0;
      String correct = ask % 2 == 0 ? "yes" : "no";

      Scanner scanner = new Scanner(System.in);

      System.out.printf("Question: %d\n", ask);
      System.out.print("Your answer: ");
      String answer = scanner.nextLine();

      if (isEven && answer.equals("yes")) {
        System.out.println("Correct!");
        count++;
      } else if (!isEven && answer.equals("no")) {
        System.out.println("Correct!");
        count++;
      } else {
        System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, ", answer, correct);
        return;
      }
    } while (count < iterations);
    System.out.print("Congratulations, ");
  }
}
