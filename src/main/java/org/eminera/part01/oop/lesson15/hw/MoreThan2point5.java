package org.eminera.part01.oop.lesson15.hw;

import java.util.Scanner;
import java.util.stream.IntStream;

public class MoreThan2point5 {

  // 2.5  2.3   2.7   2.4   1

  public static void mainV1(String[] args) {
    // 1. input
    Scanner scan = new Scanner(System.in);
    short n = scan.nextShort();
    String result = "Not Found";

    // 2. process
    for (int i = 0; i < n; i++) {
      double num = scan.nextDouble();
      if (num <= 2.5) {
        result = String.format(" %d   %.2f %n", i, num); // "Found!"
        break;
      }
    }

    // 3. output
    System.out.println(result);
  }

  public static void mainV2(String[] args) {
    // 1. input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 2. process
    String result = IntStream.range(0, n)
            .mapToDouble(idx -> sc.nextDouble())
            .boxed()
            .filter(num -> num <= 2.5)
            .findFirst()
            .map(num -> String.format("%.2f %n", num))
            .orElse("Not Found");

    // 3. output
    System.out.println(result);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    String result = "Not Found";
    for (int i = 1; i <= n; i++) {
      double number = sc.nextDouble();
      if (number <= 2.5) {
        result = String.format("%d %.2f", i, number);
        break;
      }
    }

    System.out.println(result);
  }
}