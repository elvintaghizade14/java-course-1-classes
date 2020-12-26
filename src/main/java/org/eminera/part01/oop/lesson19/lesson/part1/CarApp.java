package org.eminera.part01.oop.lesson19.lesson.part1;

public class CarApp {
  public static void main1(String[] args) {

    BMW bmw1 = new BMW("bmw", 1995, "white");
    Opel opel = new Opel("opel", 1999, "red");
    Car bmw2 = new BMW("bmw", 2016, "black");

    new Car("car", 2000).start();

    bmw1.start();
    bmw2.start();
    opel.start();

    bmw1.start();

  }

  public static void main(String[] args) {
    BMW bmw1 = new BMW("bmw", 1995, "white");
    int hashCode = bmw1.hashCode();
    System.out.println(hashCode);

    String name = "Elvin";
    int hashCode1 = name.hashCode();
    System.out.println(hashCode1);
  }
}