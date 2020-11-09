package org.eminera.basic.lesson08.hw;

import java.util.Scanner;

public class FactorialApp {
  public static void main1(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number:"); //5 -> 1*2*3*4*5
    int num = sc.nextInt();
    long factorial = 1;

    for (int i = 1; i <= num; i++) {
      factorial *= i;
    }
    /*
    i = 1 -> t -> f = 1;
    i = 2 -> t -> f = 2;
    i = 3 -> t -> f = 6;
    i = 4 -> t -> f = 24;
    i = 5 -> t -> f = 120;
     */
    System.out.printf("Factorial is: %d\n", factorial);
    System.out.println(0.2 + 0.2 + 0.2);
    // int 4 byte -> - 2 bln: +2 bln
  }

  public static void main(String[] args) {
    int num = 5;
    long f = factorial(num);
    System.out.println("factorial is " + f);

    long f2 = factorialr(num);
    System.out.println("factorial is " + f2);

    long f3 = factorialtr(num);
    System.out.println("factorial is " + f3);
  }

  private static long factorial(int num) {
    if (num < 0) throw new IllegalArgumentException("Emeliyyat duzgun deyil");
    if (num == 0 || num == 1) return 1L;
    long f = 1;
    for (int i = 2; i <= num; i++) f *= i;
    return f;
  }

  /*
    1. num = 5;
    factorialr(5) -> 5 * (factorialr(4) -> 4 * (factorialr(3) -> 3 * (factorialr(2) -> 2 * (factorialr(1) -> 1))))
 */
  private static long factorialr(int num) {
    if (num < 0) throw new IllegalArgumentException("Emeliyyat duzgun deyil");
    if (num == 0 || num == 1) return 1L;    // base condition
    return num * factorialr(num - 1);  // 120
  }

  private static long factorialtr(int num) {
    return factorialtr(num, num);
  }

  private static long factorialtr(int num, long acc) {
    if (num == 0 || num == 1) return acc;                     // base condition
    return factorialtr(num - 1, acc * (num - 1));    // 120
  }

  /*
  num = 5; acc = 1;
  num = 4; acc = 1*5 = 5;
  num = 3; acc = 5 * 3 = 15;
   */

}