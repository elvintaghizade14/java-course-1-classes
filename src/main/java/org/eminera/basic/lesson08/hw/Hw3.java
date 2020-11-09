package org.eminera.basic.lesson08.hw;

import java.util.Scanner;

public class Hw3 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number:");
    int num = sc.nextInt();

    for (int i = 2; i <= num; i++) {
      if (isPrime(i)) System.out.print(i + " ");
    }
  }

  private static boolean isPrime(int num) {
    if (num <= 0) throw new IllegalArgumentException("Eded duzgun deyil!");
    if (num == 1) throw new IllegalArgumentException("vahid ne sade, ne de murekkeb ededdir!");
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) return false; // break here
    }
    return true;
  }
}
