package org.eminera.part01.basic.lesson05;

public class DoWhileApp {
  public static void main(String[] args) {
//    for-loop
//    while-loop
//    do-while loop
//    yuxaridan ashagi
//    soldan saga

    int i = 4;
    while (i < 5){
      System.out.println("ABC 123");
      i++;
    }

    i = 4;
    do {
      System.out.println("ABC 123");
      i++;
    }
    while (i < 5);

    /*
    1. i = 4;
    2. do -> print
    3. i = 5;
    4. while (5 < 5) -> false;
     */


/*    Program running:
    1. int i = 4;
    2.  while (i < 5 -> true) System.out.println("ABC 123");
    3. i = 5
    4. while (i < 5 -> false)

    5. i =4
    6. do System.out.println("ABC 123");
    7. i = 5;
    7. while (i < 5 -> false);

  */


  }
}
