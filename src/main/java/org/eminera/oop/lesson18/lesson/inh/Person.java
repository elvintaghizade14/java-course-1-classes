package org.eminera.oop.lesson18.lesson.inh;

public class Person {
  String name;

  public Person(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Person[name='%s']", name);
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
}