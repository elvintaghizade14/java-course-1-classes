package org.eminera.lesson10.hw;

import java.util.Scanner;

public class EOFApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (sc.hasNext()) {
      int n = sc.nextInt();
      System.out.printf("%d x 2 = %d\n", n, n * 2);
    }
  }
}
