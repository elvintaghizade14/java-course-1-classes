package org.eminera.part01.basic.lesson04;

import java.util.Scanner;

public class ControlFlow {
  public static void main(String[] args) {
//    int grade = 5;
//    System.out.println(grade);
//    System.out.println(grade * 5); // 25
//    System.out.println(grade % 2); // 1  mod- modulo
//
//    // ternary operator
//    // shert ? true : false;
//
//    int mark1 = 100 % 2 == 0 ? 2 : 1;
//    System.out.println(mark1);
//    int mark2 = 100 % 2 == 1 ? 2 : 1;
//    System.out.println(mark2);


    Scanner input = new Scanner(System.in); // ededin daxil edilmesi

    System.out.println("Ededi daxil edin:");
    int eded = input.nextInt();             // eded daxil edildi

    if (eded % 10 == 0) System.out.println("Sizin eded: " + eded + " 10-a qaliqsiz bolunur!");
    else System.out.println("Sizin eded: " + eded + " 10-a qaliqsiz bolunmur!");
  }
}
