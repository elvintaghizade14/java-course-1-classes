package org.eminera.oop.lesson17.lesson.inh;

public class Student extends Person {
  private double grade;
  private double scholarship;

  public Student(String name, int age, double grade, double scholarship) {
    super(name, age);
    this.grade = grade;
    this.scholarship = scholarship;
  }

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }

  public double getScholarship() {
    return scholarship;
  }

  public void setScholarship(double scholarship) {
    this.scholarship = scholarship;
  }

  @Override
  public String toString() {
    return String.format("Student{name=%s, age=%d, grade=%s, scholarship=%s}",
            getName(), getAge(), getGrade(), getScholarship());
  }
}
