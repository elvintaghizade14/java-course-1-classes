package org.eminera.part01.oop.lesson17.hw;

import java.util.Scanner;

/**
 * https://www.e-olymp.com/en/problems/921
 */
public class NegativeElements {
  public static void main(String[] args) {
    // 1. input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 2. business process
    double sumOfNeg = 0;
    int countOfNeg = 0;
    for (int i = 0; i < n; i++) {
      double num = sc.nextDouble();
      if (num < 0) {
        countOfNeg++;
        sumOfNeg += num;
      }
    }

    // 3. output
    System.out.printf("%d %.2f", countOfNeg, sumOfNeg);
  }
}