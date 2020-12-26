package org.eminera.part01.oop.lesson14.lesson;

public class MainApp {
  public static void main(String[] args) {
    // new data type
    Person elvin = new Person();
//    String strin = new String();
    Person ismayil = new Person();
    Car bmw = new Car();
    Car opel = new Car();

    elvin.name = "Elvin";
    elvin.surname = "Taghziade";
    elvin.age = 21;

    System.out.println(elvin.name);
    System.out.println(ismayil.name); //
    System.out.println(elvin.surname);
    System.out.println(elvin.age);

    elvin.sleep();
    ismayil.code();

    bmw.start();
    opel.stop();
  }
}
