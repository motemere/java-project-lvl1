package hexlet.code;

import java.util.Scanner;

public class Cli {

  public static String hello() {
    System.out.println("Welcome to the Brain Games!");

    Scanner scanner = new Scanner(System.in);

    System.out.print("May I have your name? ");

    String name = scanner.nextLine();

    System.out.printf("Hello, %s!\n", name);

    return name;
  }
}
