package org.eminera.part01.oop.lesson20.lesson.inter.example;

public class ConsoleApp {
  public static void main(String[] args) {
    // input
    UnixConsole console = new UnixConsole();
    String a = console.readLn();
    String b = console.readLn();

    // process
    int i = doParse(a);
    int j = doParse(b);
    int result = doOpr(i, j);

    // output
    System.out.println(result);
  }

  private static int doParse(String line) {
    return Integer.parseInt(line);
  }

  private static int doOpr(int a, int b) {
    return (a / b);
  }
}