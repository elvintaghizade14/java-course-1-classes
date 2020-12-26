package org.eminera.part01.oop.lesson18.lesson.inh;

public class Teacher extends Person implements Student {
  double salary;

  public Teacher(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("Teacher[salary=%s, name='%s']", salary, name);
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }
}