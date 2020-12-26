package org.eminera.part01.oop.lesson19.lesson.part1;

public class Opel extends Car {
  private String color;

  public Opel(String model, int year, String color) {
    super(model, year);
    this.color = color;
  }

  @Override
  public void start() {
    System.out.println("Opel started with keys!");
  }
}
