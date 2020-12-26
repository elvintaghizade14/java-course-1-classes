package org.eminera.part01.oop.lesson16.lesson.inheritance.inh2;

public class Teacher extends Human {
  // Teacher IS-A Human

  double salary;

  public Teacher(String name, String pin, double salary) {
    super(name, pin);
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("Teacher{salary=%s, name='%s', pin='%s'}", salary, name, pin);
  }
}
