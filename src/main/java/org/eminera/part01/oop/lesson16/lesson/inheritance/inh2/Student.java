package org.eminera.part01.oop.lesson16.lesson.inheritance.inh2;

public class Student extends Human{
  // Student IS-A Human

  double grade;

  public Student(String name, String pin, double grade) {
    super(name, pin);
    this.grade = grade;
  }

  @Override
  public String toString() {
    return String.format("Student{grade=%s, name='%s', pin='%s'}", grade, name, pin);
  }
}
