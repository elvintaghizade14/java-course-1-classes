package org.eminera.oop.lesson16.hw;

import java.util.Random;
import java.util.Scanner;

public class RandomApp {
  public static void main1(String[] args) {
    double random = Math.random();  // [0,1)
    double random99 = random * 100; // [0, 100)

    int min = 0;
    int max = 100;
    int random100 = (int) (Math.random() * ((max - min) + 1)) + min;
    // [0, 1)
    // [0, 100)
    // 0.9999999999999999999 * (100 - 0 +1) = 100.99999999
    // (int) 100.99999999 = 100
    // 100 + 0 = 100;
    // [0, 100]

    Random r = new Random(10);
    int i = r.nextInt(101);
    System.out.println(i);
    int anInt = r.nextInt();
    int anInt1 = r.nextInt();
    System.out.println(anInt);
    System.out.println(anInt1);
  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    for (int i = 1; i <= n; i++) {
      int square = i * i;
      if (square <= n) System.out.print(square + " ");
      else break;
    }

    // i = 4
    // i*i = 16
    // 16 <= 10 -> false
    // i = 5

    System.out.println("=============");
    for (int i = 1; i <= n; i++) {
      long kvadrat = (long) Math.pow(i, 2);
      System.out.println("i is: " + i + " and square is: " + kvadrat);
      if (kvadrat <= n) System.out.println(kvadrat);
    }
  }
}