package org.eminera.oop.lesson20.lesson.inter.example;

import java.util.Scanner;

public class UnixConsole implements Console {
  private final Scanner SCANNER = new Scanner(System.in);

  @Override
  public void print(String line) {
    System.out.print(line);
  }

  @Override
  public String readLn() {
    return SCANNER.nextLine();
  }
}
