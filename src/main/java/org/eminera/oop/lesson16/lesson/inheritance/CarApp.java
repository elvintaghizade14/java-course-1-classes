package org.eminera.oop.lesson16.lesson.inheritance;

public class CarApp {
  public static void main(String[] args) {

    // OOP:
    // 1. Inheritance
    // 2. Encapsulation
    // 3. Polymorphism
    // 4. Abstraction


    // Bmw  IS-A Car
    // Oka  IS-A car
    // Opel IS-A Car

    Car  bmw = new Bmw("F35", "black", 2018);
    Car  oka = new Oka("OKA-1", "white", 2000);
    Car  opel = new Opel("Astra", "metalic", 1995);

    System.out.println(bmw);
    System.out.println(oka);
    System.out.println(opel);

    bmw.startCar();
    oka.representCar();
    opel.representCar();
    opel.startCar();
  }
}
