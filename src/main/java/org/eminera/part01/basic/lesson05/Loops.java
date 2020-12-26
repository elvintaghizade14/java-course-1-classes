package org.eminera.part01.basic.lesson05;

public class Loops {
  public static void main(String[] args) {
//    1 -> 100
    System.out.println(1);
    System.out.println(2);
    System.out.println(3);
//    System.out.println(...);
    System.out.println(100);
    // loops - dovrler
    // for loop
    // while loop
    // do-while loop
    for (int i = 0; i < 10; i++) {
      System.out.println('#');
      /*
      1. operation -> int i = 0
      2. operation -> i < 10
      3. operation -> {...}
      4. operation -> i++
       */
    }
    System.out.println("---------");
    for (int i = 0; i <= 20; i++) {
      if (i % 2 == 0) {
        System.out.println("Ededimiz: " + i);
      }
    }

  }
}