package org.eminera.lesson12;

import java.util.Scanner;

public class ExactlyOneConditionOutOfTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean isEven = n % 2 == 0;
    boolean negAnd3divisible = (n < 0) && (n % 3 == 0);
    System.out.println(isEven == negAnd3divisible ? "NO" : "YES");
  }
}