package org.eminera.part01.oop.lesson19.lesson.part2;

public class WideningNarrowingApp {
  public static void main(String[] args) {

//    primitive data types:
//      byte, short, int, long;
//      float, double

//  widening
    int  a = 5;
    long b = 5L;

//    calc(a); // int -> long
//    calc(b); // long -> long

//  narrowing
    calc(a); // int -> int
    calc((int) b); // long -> int

  }

//  static void calc(long l) {
//    System.out.println(l * 5);
//  }

  static void calc(int i) {
    System.out.println(i * 5);
  }
}