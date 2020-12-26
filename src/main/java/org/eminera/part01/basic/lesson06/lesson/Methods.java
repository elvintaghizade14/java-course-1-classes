package org.eminera.part01.basic.lesson06.lesson;

import java.util.Scanner;

public class Methods {
  public static void main0(String[] args) {
//    1. input

//    2. process

//    3. output
  }

  public static void main1(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter 1st number:");
    int n1 = sc.nextInt();
    if (n1 % 2 == 0) System.out.println("Even!");
    else             System.out.println("Odd!");

    System.out.println("Enter 2nd number:");
    int n2 = sc.nextInt();
    if (n2 % 2 == 0) System.out.println("Even!");
    else             System.out.println("Odd!");

    System.out.println("Enter 3rd number:");
    int n3 = sc.nextInt();
    if (n3 % 2 == 0) System.out.println("Even!");
    else             System.out.println("Odd!");

    System.out.println("Enter 4th number:");
    int n4 = sc.nextInt();
    if (n4 % 2 == 0) System.out.println("Even!");
    else             System.out.println("Odd!");

    System.out.println("Enter 5th number:");
    int n5 = sc.nextInt();
    if (n5 % 2 == 0) System.out.println("Even!");
    else             System.out.println("Odd!");

  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

//  1. input
    System.out.println("Enter a number:");
    int n1 = sc.nextInt();

    System.out.println("Enter a number:");
    int n2 = sc.nextInt();

//  2. process
//  TODO find even or odd
    boolean isEven = isEven(n1);
    boolean isEven2 = isEven(n2);

//  3. output
//  ternary operator -> "condition ? true : false;"
    String result = isEven ? "EVEN!" : "ODD!";
    System.out.println(result);

  }

  /**
   * returns true if number is even; false if number is odd
   */
  private static boolean isEven(int num) {
    return num % 2 == 0;
  }
}