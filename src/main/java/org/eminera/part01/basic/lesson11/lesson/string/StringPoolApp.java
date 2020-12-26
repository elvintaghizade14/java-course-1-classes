package org.eminera.part01.basic.lesson11.lesson.string;

public class StringPoolApp {
  public static void main(String[] args) {
    int a = 6;
    int b = 6;
//    System.out.println(a == b); // true pass-by-value -> 6 == 6

    String name1 = new String("Elvin"); // 123456
    String name2 = new String("Elvin"); // 098776
    String name3 = "Elvin";
    String name4 = "Elvin";

    System.out.println(name1 == name2);       // 123456 == 098776
    System.out.println(name1.equals(name2));  // true

    System.out.println("--------=========");
    String s1 = "Karabakh";
    String s2 = "Karabakh";
    System.out.println(s1 == s2);             // true
    System.out.println(s1.equals(s2));        // true
    System.out.println("--------=========");
    String s3 = "Karabakh";
           s3 = "Qarabag";

    System.out.println(s3.toUpperCase());

    int[] array = new int[10]; // 1, 2, 3, 4, 5

  }
}