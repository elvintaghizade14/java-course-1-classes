package org.eminera.part01.basic.lesson07.lesson;

import java.util.Scanner;

public class StudentArrayApp {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    String[] adlar    = new String[3];
    int[]    yashlar  = new int[3];

    for (int idx = 0; idx < 3; idx++) {
      String ad = in.nextLine();
      int yash = in.nextInt();
      in = new Scanner(System.in);
      adlar[idx]   = ad;
      yashlar[idx] = yash;
    }

    for (int i = 0; i < 3; i++) {
      System.out.printf("%-15s = %d\n", adlar[i], yashlar[i]);
    }

//    DATA STRUCTURES & ALGORITHMS
//    - variables
//    - arrays
//    - list, sets, map, queue, deque, linkedlist
//    - binary search
//    - linear search
//    - sorting (bubble, merge, insertion, selection, quick, heap)

  }
}
