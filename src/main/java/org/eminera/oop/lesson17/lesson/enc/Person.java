package org.eminera.oop.lesson17.lesson.enc;

public class Person {
  static String livesOnTheEarth;  // global / class / static

  // attributes / fields - instance fields

  private String pin;
  protected String name;
  protected int age;

  public Person(String pin, String name, int age) {
    this.pin = pin;
    this.name = name;
    this.age = age;
  }

  // methods / functions / procedures /

  int ageTimes10() {
    return this.age * 10;
  }
}