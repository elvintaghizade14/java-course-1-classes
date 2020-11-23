package org.eminera.oop.lesson17.lesson.enc;

public class Person {
  private String pin;
  String name;
  int age;

  public Person(String pin, String name, int age) {
    this.pin = pin;
    this.name = name;
    this.age = age;
  }

  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }
}