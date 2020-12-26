package org.eminera.part01.oop.lesson15.lesson;

public class Person {
  int     age;
  String  name;

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  int ageMult5() {
    return age * 5;
  }

  String nameTwice() {
//    String name;                          // 1
//    String sp = " ";                        // 2
//    String concat1 = name.concat(sp);       // 3
//    String concat2 = concat1.concat(name);  // 4
//    return concat2;
    return name.concat(" ").concat(name);
  }

  public Person() {
  }

  public Person(int age) {
//    new Person  (age, "Elvin");
    this        (age, "Elvin");
  }

  public Person(String name) {
    this.name = name;
  }
}
