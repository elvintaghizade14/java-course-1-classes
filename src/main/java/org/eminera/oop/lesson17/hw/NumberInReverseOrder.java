package org.eminera.oop.lesson17.hw;

import java.util.Scanner;

public class NumberInReverseOrder {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();

    String reversed = printReversed(n);

    System.out.println(reversed);
  }

  private static void printReversed1(long n) {
    // 1234 -> 4321
    while (n >= 0) {
      System.out.print(n % 10);
      n /= 10;
      if (n == 0) break;
    }
  }

  private static String printReversed(long n) {
    // 1234 -> 4321
    StringBuilder sb = new StringBuilder();
    while (n > 1) {
      long digit = n % 10;
      sb.append(digit);
      n /= 10;
    }
    return sb.toString();
  }

  public static String getReversedS(long n) {
    return new StringBuilder(String.valueOf(n)).reverse().toString();
  }
}
