package org.eminera.oop.lesson17.lesson.inh;

public class Teacher extends Person {
  private double salary;
  private String course;

  public Teacher(String name, int age, double salary, String course) {
    super(name, age);
    this.salary = salary;
    this.course = course;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public String getCourse() {
    return course;
  }

  public void setCourse(String course) {
    this.course = course;
  }

  @Override
  public String toString() {
    return String.format("Teacher{name=%s, age=%d, salary=%s, course='%s'}",
            getName(), getAge(), getSalary(), course);
  }
}
