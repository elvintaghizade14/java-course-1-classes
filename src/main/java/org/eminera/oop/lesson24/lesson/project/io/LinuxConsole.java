package org.eminera.oop.lesson24.lesson.project.io;

import java.util.Scanner;

public class LinuxConsole implements Console {
  public final Scanner SCANNER;

  public LinuxConsole(Scanner scanner) {
    SCANNER = scanner;
  }

  @Override
  public void print(String line) {
    System.out.print(line);
  }

  @Override
  public String readLn() {
    return SCANNER.nextLine();
  }
}
