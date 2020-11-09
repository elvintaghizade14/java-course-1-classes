package org.eminera.basic.lesson10.hw;

import java.util.Scanner;

public class FourDigitNumberApp {
  public static void main(String[] args) {
//    1. input
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
//    2. process
    String result = process(n);
//    3. output
    System.out.println(result);
  }

  private static String process(int n) {
    int temp = n;
    while (temp > 0) {
      int digit = temp % 10;
      if ((digit == 0) || (n % digit != 0)) { // OR minimumu 1 eded true
        return "NO";
      }
      temp /= 10;
    }
    return "YES";
  }

  /*
  &&, ||    - short-circuit logical AND, OR
  &, |      - bitwise logical AND, OR
  AND -> true + true; OR -> true + false
   */
}
