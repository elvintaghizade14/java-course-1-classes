package org.eminera.oop.lesson16.lesson;

public class MainApp {
  public static void main(String[] args) {
    Car bmw = new Car("BMW");

    Car opel = new Car("OPEL");

    System.out.println(bmw.model);
    System.out.println(opel.model);

    System.out.println("change via CAR");
    Car.personCount = 5;
    System.out.println(Car.personCount);      // 5
    System.out.println(bmw.personCount);      // 5
    System.out.println(opel.personCount);     // 5

    System.out.println("change via bmw");
    Car.personCount = 4;
    System.out.println(Car.personCount);      // 4
    System.out.println(bmw.personCount);      // 4
    System.out.println(opel.personCount);     // 4

    System.out.println("change via opel");
    opel.personCount = 7;
    System.out.println(Car.personCount);      // 7
    System.out.println(bmw.personCount);      // 7
    System.out.println(opel.personCount);     // 7

    // bmw.personCount => Car.personCount
  }
}
