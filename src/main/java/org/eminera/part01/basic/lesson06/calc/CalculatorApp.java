package org.eminera.part01.basic.lesson06.calc;

import java.util.Scanner;

public class CalculatorApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number");
    int num1 = sc.nextInt();
    System.out.println("Enter second number");
    int num2 = sc.nextInt();

    String op = sc.next();  // +, -, *, /, %

    switch (op) {
      case "+":
        System.out.println(sum(num1, num2));
        break;
      case "-":
        System.out.println(sub(num1, num2));
        break;

      case "*":
        System.out.println(mult(num1, num2));
        break;

      case "/":
        System.out.println(div(num1, num2));
        break;

      case "%":
        System.out.println(mod(num1, num2));
        break;

      default:
        System.out.println("BU EMELIYYAT DESTEKLENMIR!");
    }

  }

  private static int sum(int num1, int num2) {
    return num1 + num2;
  }

  private static int sub(int num1, int num2) {
    return num1 - num2;
  }

  private static int mult(int num1, int num2) {
    return num1 * num2;
  }

  private static double div(int num1, int num2) {
    return (double) num1 / num2;
  }

  private static double mod(int num1, int num2) {
    return num1 % num2;
  }
  void foo() {
    System.out.println("asmdkjasda");
    System.out.println("asmdkjasda");
    System.out.println("asmdkjasda");
    System.out.println("asmdkjasda");
    System.out.println("asmdkjasda");
    System.out.println(5 + 5);
  }
}