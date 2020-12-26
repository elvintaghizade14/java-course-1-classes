package org.eminera.part01.oop.lesson19.lesson.part1;

public class Car {
  private String model;
  private int year;

  public Car(String model, int year) {
    this.model = model;
    this.year = year;
  }

  protected void start() {
    System.out.println("Car started!");
  }
}
