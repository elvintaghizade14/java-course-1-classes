package org.eminera.part01.oop.lesson18.hw;

public class Human {
  String name;

  public Human(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Human[name='%s']", name);
  }
}
