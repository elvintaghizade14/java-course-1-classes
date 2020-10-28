package org.eminera.lesson10.lesson;

public class OutOfMemoryApp {
  public static void main(String[] args) {
    byte b = (byte) 130;    // byte [-128;127] [0;127] -> 128
    System.out.println(b);
    String s1 = "a";
    String s2 = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";

    System.out.println(s1.getBytes().length);
    System.out.println(s2.getBytes().length);
  }
}