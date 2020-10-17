package org.eminera.lesson07.lesson;

public class FinalApp {
  public static void main(String[] args) {
    // immutable type
    final double PI = 3.14;
//    PI = 3.15;
    System.out.println(PI);

//    our code -> compile -> byte code -> run -> output

//    System.out.println(1 / 0); // runtime issue

//    int a = "String";        // compile issue

  }
}
