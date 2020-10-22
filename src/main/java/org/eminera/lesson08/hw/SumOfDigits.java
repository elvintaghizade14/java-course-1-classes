package org.eminera.lesson08.hw;

import java.util.Scanner;

public class SumOfDigits {
  public static void main(String[] args) {
//    1. input
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();

//    2. process
    int sumOfDigits = findSumOfDigits(num);

//    3. output
    System.out.println(sumOfDigits);
  }

  private static int findSumOfDigits(int num) {
    int sum = 0;
    while (num > 0) {
      sum += num % 10;
      num /= 10;
    }
    return sum;
  }
}