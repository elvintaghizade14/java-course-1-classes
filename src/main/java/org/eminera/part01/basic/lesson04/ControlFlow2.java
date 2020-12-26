package org.eminera.part01.basic.lesson04;

import java.util.Scanner;

public class ControlFlow2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.println("Ededi daxil edin:");
    int input = in.nextInt();

    if (input >= 5) {
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
    } else {
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
      System.out.println(input);
    }

    // loops -> dovrler

//    int eded2 = 20;
//
//    for (int i = 0; i < 100; i++) System.out.println(eded2);

    if (input >= 5) {
      for (int i = 0; i < 10; i++) System.out.println((i + 1) + "My number is : " + input);
    } else {
      for (int i = 0; i < input; i++) System.out.println((i + 1) + "My number is : " + input);
    }

  }
}
