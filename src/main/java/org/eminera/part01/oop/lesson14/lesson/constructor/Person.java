package org.eminera.part01.oop.lesson14.lesson.constructor;

public class Person {
//  final String PIN;
  String name;
  String surname;
  int age;

  // overloading on Constructors
  public Person() {
    name = null;
    surname = null;
    age = 0;
  }

  public Person(String ad, int yash) {
    name = ad;
    age = yash;
  }

  public Person(String ad, String soyad, int yash) {
    name = ad;
    surname = soyad;
    age = yash;
  }

  void sleep() {
    System.out.println(name + " sleeping");
  }

  void eat() {
    System.out.println(name + " eating");
  }

  void code() {
    System.out.println(name + " coding :)");
  }
}