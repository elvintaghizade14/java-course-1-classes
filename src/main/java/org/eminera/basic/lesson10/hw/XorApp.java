package org.eminera.basic.lesson10.hw;

import java.util.Scanner;

public class XorApp {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    if ((n % 2 == 0) == (n < 0 && n % 3 == 0)) System.out.println("YES");
    else System.out.println("NO");
    /*
    OR ->
    true + true -> true
    true + false -> true
    false + true -> true
    false + false -> false

    XOR ->
    true + true -> false
    true + false -> true
    false + true -> true
    false + false -> false
     */
  }
}
