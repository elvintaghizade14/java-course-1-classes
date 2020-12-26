package org.eminera.part01.oop.lesson19.lesson.part2;

public class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Person{name='%s'}", name);
  }
}