package org.eminera.part01.oop.lesson17.hw;

import java.util.Scanner;

public class RatioOfProductToTheSum {
  public static void main(String[] args) {
    // 1. input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 2. process
    double ratio = getRatio(n);

    // 3. output
    System.out.printf("%.3f", ratio);
  }

  private static double getRatio(int n) {
    double sum = 0;
    long prod = 1;
    while (n > 0) {
      int digit = n % 10;
      sum += digit;
      prod *= digit;
      n /= 10;
    }
    return prod / sum;
  }
}