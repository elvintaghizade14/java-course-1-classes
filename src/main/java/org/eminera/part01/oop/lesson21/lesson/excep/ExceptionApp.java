package org.eminera.part01.oop.lesson21.lesson.excep;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionApp {
  public static void main1(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();

//    Exception Handling
    try {
      System.out.println(a / b);
    } catch (ArithmeticException ex) {
      System.out.println("You cannot divide by zero!");
    }

    System.out.println("hello, World!");
    System.out.println("Cont.");
  }

  public static void main2(String[] args) {
    Scanner sc = new Scanner(System.in);

    int a = Integer.MIN_VALUE; // local variable has no default value

    boolean isNum = false;

    while (!isNum) { // true
      try {
        System.out.print("Enter a number: ");
        a = sc.nextInt();
        isNum = true;
      } catch (InputMismatchException ex) {
        System.out.println("Input is wrong, please enter correct input");
        sc.nextLine();
      }
    }

    System.out.println(a);
    System.out.println("Good bye!");
  }

  public static void main3(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s1 = sc.next(); // "1"
    String s2 = sc.next(); // "0"

    try {
      int a = Integer.parseInt(s1);
      int b = Integer.parseInt(s2);
      System.out.println(a / b);
    } catch (NumberFormatException | ArithmeticException ex) {
      System.out.println(ex.getMessage());
      System.out.println(ex.getCause());
      System.out.println(ex.getLocalizedMessage());
    }
  }

  public static void main4(String[] args) {

    int a = 10;

    try {
      System.out.println(a / 0);
    } catch (ArithmeticException e) {
      System.out.println(e);
    } finally {
      System.out.println("Teshekkurler!");
    }

    System.out.println("asjdjhabjsdnkassx");

  }

  public static void main(String[] args) {

    int a = 10;
    int b = 10;

    Integer qismet;

    try {
      qismet = bol(a, b);
    } catch (ArithmeticException e) {
      qismet = null;
    }

    System.out.println(qismet);
  }

  private static int bol(int a, int b) throws ArithmeticException {
    throw new ArithmeticException();
  }
}