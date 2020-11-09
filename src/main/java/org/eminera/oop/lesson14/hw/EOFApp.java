package org.eminera.oop.lesson14.hw;

import java.util.Scanner;

public class EOFApp {
  public static void main(String[] args) {
    // eof stop etmek uchun -> "CTRL + D"
    Scanner sc = new Scanner(System.in);
    int sum = 0;
    int count = 0;
    while (sc.hasNext()) {
      int num = sc.nextInt();
      sum += num;
      count++;
    }
    System.out.printf("Sum is %d\n", sum);
    System.out.printf("Count is %d", count);
  }
}
