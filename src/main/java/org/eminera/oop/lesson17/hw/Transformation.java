package org.eminera.oop.lesson17.hw;

import java.util.Scanner;

public class Transformation {
  public static void main(String[] args) {
    // 1. input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 2. process
    int count = getCount(n);

    // 3. output
    System.out.println(count);
  }

  private static int getCount(int n) {
    int count = 0;
    while (n > 1) {
      n = n % 2 == 0 ? n / 2 : n + 1;
      count++;
    }
    return count;
  }
}