package org.eminera.part01.basic.lesson06.hw_solution;

import java.util.Scanner;

public class JavaIfElseHackerrank {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter n:");
    int n = sc.nextInt();

    int k = 5;

//    cut
//    cut
//    cut
//    tek

    if (n % 2 == 1)                               System.out.println("Weird");
    else if ((n % 2 == 0) && (n >= 2 && n <= 5))  System.out.println("Not Weird");
    else if ((n % 2 == 0) && (n >= 6 && n <= 20)) System.out.println("Weird");
    else if ((n % 2 == 0) && (n >= 20))           System.out.println("Not Weird");


  }
}
