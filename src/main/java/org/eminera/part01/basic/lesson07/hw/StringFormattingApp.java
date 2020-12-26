package org.eminera.part01.basic.lesson07.hw;

public class StringFormattingApp {
  public static void main(String[] args) {
//    System.out.print("Hello, World! - 1");
//
//    System.out.println("Hello, World! - 2"); // new line
//    System.out.print("Hello, World! - 3");
//    System.out.print("123456\n");
    String java = "java";
    int x = 100;
    String answer = String.format("%s %d\n", java, x);
    System.out.print(answer);
  }
}