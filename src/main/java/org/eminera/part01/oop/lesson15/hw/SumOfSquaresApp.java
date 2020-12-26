package org.eminera.part01.oop.lesson15.hw;

import java.util.Scanner;
import java.util.stream.IntStream;

public class SumOfSquaresApp {
  public static void mainV1(String[] args) {
    // 1. input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 2. process
    long sum = 0;
    for (int i = 1; i <= n; i++) sum += (long) Math.pow(i, 2);

    // 3. output
    System.out.println(sum);
  }
  public static void main(String[] args) {
    // 1. input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // 2. process
    long sum = IntStream.rangeClosed(1, n)
            .mapToLong(i -> (long) Math.pow(i, 2))
            .sum();

    // 3. output
    System.out.println(sum);
  }
}