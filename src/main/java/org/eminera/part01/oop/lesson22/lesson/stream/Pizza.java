package org.eminera.part01.oop.lesson22.lesson.stream;

public class Pizza {
  String name;
  int price;

  public Pizza(String name, int price) {
    this.name = name;
    this.price = price;
  }

  @Override
  public String toString() {
    return String.format("Pizza[name='%s', price=%d]", name, price);
  }
}
