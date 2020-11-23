package org.eminera.oop.lesson17.hw;

import java.util.Scanner;

public class DollarsInBank {
  public static void main(String[] args) {
    // 1. input
    Scanner sc = new Scanner(System.in);
    long s = sc.nextLong();

    // 2. process
    int age = getAge(s);

    // 3. output
    System.out.println(age);
  }

  private static int getAge(long s) {
    int age = 1;
    long amount = 1;
    long previous = 1;
    while (amount < s) {
      age++;
      previous = previous * 2 + age;
      amount += previous;
    }
    return age;
  }
}