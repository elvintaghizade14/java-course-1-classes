package org.eminera.basic.lesson11.lesson;

public class MoreReferencesApp {
  public static void main(String[] args) {
    int[] a = {1, 2, 3};        // {1, 2, 3}    // abc
    int[] b = a;                // {1, 2, 3}    // abc
    System.out.println(a[1]);   // 2            //
    System.out.println(b[1]);   // 2
    a[1] = 10;                  // 10
    System.out.println(a[1]);   // 10
    System.out.println(b[1]);   // 10
  }

  public static void main2(String[] args) {
    int a = 5;                // 5
    int b = a;                // 5
    System.out.println(a);    // 5
    System.out.println(b);    // 5
    a = 10;                   // 10
    System.out.println(a);    // 10
    System.out.println(b);    // 5
  }
}
