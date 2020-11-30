package org.eminera.oop.lesson19.lesson.part1;

import java.util.Objects;

public class BMW extends Car {
  private String color;

  public BMW(String model, int year, String color) {
    super(model, year);
    this.color = color;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    BMW bmw = (BMW) o;
    return Objects.equals(color, bmw.color);
  }

  @Override
  public int hashCode() {
    return 1;
  }

  @Override
  public void start() {
    super.start();
    System.out.println("BMW started with button!");
  }

  public void m() {

  }

  public void m(int a) {

  }
}