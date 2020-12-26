package org.eminera.part01.oop.lesson19.lesson.part2;

public class Teacher extends Person{
  double salary;

  public Teacher(String name, double salary) {
    super(name);
    this.salary = salary;
  }

  @Override
  public String toString() {
    return String.format("Teacher{salary=%s, name='%s'}", salary, name);
  }
}