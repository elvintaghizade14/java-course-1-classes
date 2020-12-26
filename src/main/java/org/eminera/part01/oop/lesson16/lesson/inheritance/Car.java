package org.eminera.part01.oop.lesson16.lesson.inheritance;

public class Car {
  String model;
  String color;
  int year;

  public Car(String model, String color, int year) {
    this.model = model;
    this.color = color;
    this.year = year;
  }

  public void startCar() {
    System.out.println("Car Started");
  }

  public void representCar() {
    System.out.println(String.format("Car{model='%s', color='%s', year=%d}", model, color, year));
  }

}
