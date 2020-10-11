package org.eminera.lesson05;

public class WhileLoopApp {
//  public static void main(String[] args) {
//
//    int i = 0;
//    while (i < 10) {
//      System.out.println(i);
//      i++;
//    }
//    System.out.println("i-miz = " + i);
//    System.out.println("---------");
//
//    for (int j = 0; j < 10; j++) {
//      System.out.println(j);
//    }
////    System.out.println("j-miz = " + j);
//    System.out.println("----------");
//    int a = 4;
//    for (; a > 0; a--) {
//      System.out.println(a);
//    }
//
////    for ( ; ; ) {    }
//
//
//
//  }

  public static void main(String[] args) {
//    while(true) System.out.println(i);
    int i = 0;
    int countEven = 0; // cutlerin sayi
    int countOdd = 0;  // teklerin sayi
    while (i <= 1000) {
      if (i % 2 == 0) countEven++;   // countEven = countEven + 1;
      else countOdd++;               // countOdd = countOdd + 1;
      i++; // 1,2,3,...,999,1000,1001
    }
    System.out.println("i-miz : " + i);
    System.out.println("With While loop");
    System.out.println("0-dan 1000-e qeder cut ededlerin sayi = " + countEven);
    System.out.println("0-dan 1000-e qeder tek ededlerin sayi = " + countOdd);

    countEven = 0;
    countOdd = 0;

    for (int j = 0; j <= 1000; j++) {
      if (j % 2 == 0) countEven++;   // countEven = countEven + 1;
      else countOdd++;               // countOdd = countOdd + 1;
    }
    System.out.println("With For loop");
    System.out.println("0-dan 1000-e qeder cut ededlerin sayi = " + countEven);
    System.out.println("0-dan 1000-e qeder tek ededlerin sayi = " + countOdd);


    /*
    while(condition) {
      operation
     */

  }
}