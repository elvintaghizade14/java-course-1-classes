package org.eminera.part01.oop.lesson14.lesson.constructor;

public class MainApp {
  public static void main1(String[] args) {
    Person elvin = new Person();        // create / construct -> // constructor
    int    sum   =     sum();

    System.out.println(elvin.name);
    System.out.println(elvin.surname);
    System.out.println(elvin.age);

    elvin.code();
    elvin.eat();
  }

  static int sum() {
    return 1+2;
  }

  public static void main2(String[] args) {
    Person ismayil = new Person("A", "B", 20);
//    ismayil.name = "A";
//    ismayil.surname = "B";
//    ismayil.age = 20;
    System.out.println(ismayil.name);
    System.out.println(ismayil.surname);
    System.out.println(ismayil.age);

    ismayil.name = "Ismayil";
    System.out.println(ismayil.name);

    ismayil.age++;
    System.out.println(ismayil.age);
  }

  public static void main(String[] args) {
    Person shusha = new Person("SHUSHA", 28);
    System.out.println(shusha.name);
    System.out.println(shusha.surname);
    System.out.println(shusha.age);
  }
}
