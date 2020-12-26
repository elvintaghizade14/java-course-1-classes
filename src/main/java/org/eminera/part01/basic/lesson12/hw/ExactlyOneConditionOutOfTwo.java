package org.eminera.part01.basic.lesson12.hw;

import java.util.Scanner;

public class ExactlyOneConditionOutOfTwo {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean isEven = n % 2 == 0;
    boolean negAndDivisible3 = (n < 0) && (n % 3 == 0);

    /*
    XOR
      true  + true  -> false
      false + false -> false
      false + true  -> true
      true + false  -> true
     */

    System.out.println(isEven == negAndDivisible3 ? "NO" : "YES");
  }
}