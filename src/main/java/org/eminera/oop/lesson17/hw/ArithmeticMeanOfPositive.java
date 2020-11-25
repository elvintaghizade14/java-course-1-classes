package org.eminera.oop.lesson17.hw;

import java.util.Scanner;

/**
 * https://www.e-olymp.com/en/contests/17734/problems/186203
 */
public class ArithmeticMeanOfPositive {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    double sumOfPos = 0;
    int countOfPos = 0;
    for (int i = 0; i < n; i++) {
      double num = sc.nextDouble();
      if (num > 0) {
        countOfPos++;
        sumOfPos += num;
      }
    }
    if (countOfPos == 0) System.out.println("Not Found"); // verilen ededlerin ichinde musbet eded yoxdur!
    else System.out.printf("%.2f", (sumOfPos / countOfPos)); // ededi orta = (ededlerin cemi) / (ededlerin sayi)
  }
}