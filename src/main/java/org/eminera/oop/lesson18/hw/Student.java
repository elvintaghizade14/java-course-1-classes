package org.eminera.oop.lesson18.hw;

public class Student extends Human {
  double grade;

  public Student(String name, double grade) {
    super(name);
    this.grade = grade;
  }

  // ALT + insert -> auto generating


  @Override
  public String toString() {
    return String.format("Student[grade=%s, name='%s']", grade, name);
  }
}