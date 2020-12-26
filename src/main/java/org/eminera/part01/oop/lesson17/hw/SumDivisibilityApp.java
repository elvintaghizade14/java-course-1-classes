package org.eminera.part01.oop.lesson17.hw;

import java.util.Scanner;

public class SumDivisibilityApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();

    long count = getN(k);

    System.out.println(count);
  }

  private static long getN(int k) {
    long sum = 0;
    long count = 1;
    while (true) {
      sum += count;
      if (sum % k == 0) return count;
      count++;
    }
  }
}