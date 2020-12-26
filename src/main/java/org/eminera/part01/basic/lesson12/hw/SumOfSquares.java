package org.eminera.part01.basic.lesson12.hw;

import java.util.Scanner;

public class SumOfSquares {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextInt();
    long b = sc.nextInt();
    System.out.println((long) (Math.pow(a, 2) + Math.pow(b, 2)));
  }
}