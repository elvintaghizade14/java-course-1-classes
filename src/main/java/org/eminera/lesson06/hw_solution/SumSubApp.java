package org.eminera.lesson06.hw_solution;

public class SumSubApp {
  public static void main(String[] args) {
    int countOdd = 0;
    int countEven = 0;
    int sumEven = 0;
    int sumOdd = 0;

    for (int i = 1; i <= 100; i++) {
      if (i % 2 == 0) {
        countEven++;
        sumEven += i;
      } else {
        countOdd++;
        sumOdd += i;
      }
    }

    System.out.println("Sum of" + countEven + " even is " + sumEven);
    System.out.printf("Sum of %d even numbers is %d\n", countEven, sumEven);
//                     Sum of 75 even numbers is 4000


    System.out.printf("Sum of %d odd numbers is %d\n",  countOdd, sumOdd);
  }
}