package org.eminera.lesson11.lesson;

public class PassingApp {
  public static void main1(String[] args) {
    int a = 5;              // local variable -> method ve ya block daxili variable
    int b = 6;              // local variable
    System.out.println(a);  // 5
    System.out.println(b);  // 6
    swap(a, b);             // passing-by-value
    System.out.println(a);  // 5
    System.out.println(b);  // 6
    a = b;
    System.out.printf("a is %d", a);
  }

  private static void swap(int a, int b) {
    int c = a;      // c = 5
    a = b;          // a = 6
    b = c;          // b = 5
    /*
      a = 6
      b = 5
     */
  }

  public static void main(String[] args) {
    int[] a = {5};
    int[] b = {6};
    System.out.println(a[0]);   // 5
    System.out.println(b[0]);   // 6
    swap2(a, b);                // pass-by-reference
    System.out.println(a[0]);   // 6
    System.out.println(b[0]);   // 5
  }

  private static void swap2(int[] a, int[] b) {
    /*
      a[0] -> 123
      b[0] -> 789
      a[0] = b[0] ->
     */
    int c = a[0];
    a[0] = b[0];
    b[0] = c;
  }
}