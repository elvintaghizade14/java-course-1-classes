package org.eminera.lesson09.lesson;

public class ArrayApp {
  public static void main(String[] args) {
    int[] arr1;     // -> java  style declaration
    int arr2[];     // -> c/c++ style declaration

    int[] arr3 = {1, 2, 3};
    int[] arr4 = new int[]{1, 2, 3};
    int[] arr5 = new int[3];
    arr5[0] = 1;
    arr5[1] = 2;
    arr5[2] = 3;
    int num = 5;
    boolean isOdd = isOdd(num);
  }

  private static boolean isOdd(int num) {
    return (num % 2) == 1;
  }
}