package org.eminera.part01.oop.lesson18.lesson.overriding;

public class MaInApp {
  public static void main(String[] args) {

    Person elvin1 = new Person(21, "elvin");  // 123456
    Person elvin2 = new Person(21, new String("elvin"));  // 123457

    System.out.println(elvin1 == elvin2);
    System.out.println(elvin1.yoxla(elvin2));

  }
}

/*
    ---

    int a = 1;
    int b = 1;

    System.out.println(a == b);

    ----

    String name1 = "elvin";                 // 123456
    String name2 = "elvin";                 // 123456
    String name3 = new String("elvin");   // 897456

    System.out.println(name1 == name2);
    System.out.println(name2 == name3);
    System.out.println(name1.equals(name3));
    System.out.println(name1.equals(name2));

    ---

    String name1 = "Elvin";
    String name2 = "elvin";

    System.out.println(name1 == name2);
    System.out.println(name1.equals(name2));
    System.out.println(name1.toLowerCase().equals(name2.toLowerCase()));

    ---

    elvin2 = elvin1; // 123456
    System.out.println(elvin1 == elvin2);
    System.out.println(elvin1.equals(elvin2));


 */
