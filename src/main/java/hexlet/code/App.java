package hexlet.code;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int choice = -1;

    do {
      System.out.print("Please enter the game number and press Enter.\n"
          + "1 - Greet\n"
          + "2 - Even\n"
          + "0 - Exit\n"
          + "Your choice: ");

      try {
        choice = scanner.nextInt();

        if (0 <= choice && choice <= 2) {
          break;
        } else {
          choice = -1;
        }
      } catch (InputMismatchException e) {
        System.out.println("Invalid number, exit.");
        System.exit(0);
      }
    } while (choice < 0);

    String name;

    switch (choice) {
      case 1:
        name = Cli.hello();
        System.exit(0);
      case 2:
        name = Cli.hello();
        Even.game();
        System.out.printf("%s!\n", name);
        System.exit(0);
      case 0:
      default:
        System.exit(0);
    }
  }
}
