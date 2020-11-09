package org.eminera.basic.lesson08.hw;

import java.util.Scanner;

/**
 * PrimeApp
 */
public class Hw1 {
  public static void main(String[] args) {
//    1. input
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter your number:");
    int num = sc.nextInt();

//    2. process
//    boolean primeBoolean = isPrimeBoolean(num);
//    String primeString = isPrimeString(num);
//    System.out.println(Math.sqrt(36));
//    System.out.println(Math.sqrt(6));
//    System.out.println(Math.sqrt(Math.PI));
    isPrimeOptimized(num);

//    3. output
//    System.out.println(primeBoolean ? "Is prime" : "Not prime");
//    System.out.println(primeString);
  }

  private static boolean isPrimeBoolean(int num) {
    if (num <= 0) throw new IllegalArgumentException("Eded duzgun deyil!");
    if (num == 1) throw new IllegalArgumentException("vahid ne sade, ne de murekkeb ededdir!");
    for (int i = 2; i < num; i++) {
      if (num % i == 0) return false; // break here
    }
    return true;
  }

  private static String isPrimeString(int num) {
    if (num <= 0) return "Eded duzgun deyil";
    if (num == 1) return "vahid ne sade, ne de murekkeb ededdir!";
    for (int i = 2; i < num; i++) {
      if (num % i == 0) return "Murekkeb ededdir"; // break here
    }
    return "Sade ededdir";
  }

  private static void isPrimeOptimized(int num) {
    if (num <= 0) System.out.println("Eded duzgun deyil");
    if (num == 1) System.out.println("vahid ne sade, ne de murekkeb ededdir!");
    for (int i = 2; i <= Math.sqrt(num); i++) {
      if (num % i == 0) {
        System.out.println("Murekkeb ededdir"); // break here
        return;
      }
    }
    System.out.println("Sade ededdir");
  }
}
