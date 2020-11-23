package org.eminera.oop.lesson17.lesson.enc;

public class Student {
  private String pin;
  private int age;
  private String name;
  private String surname;
  private double grade;

  public Student() {
  }

  public Student(String pin, int age, String name, String surname, double grade) {
    this.pin = pin;
    this.age = age;
    this.name = name;
    this.surname = surname;
    this.grade = grade;
  }

  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    if (this.pin == null) this.pin = pin;
    else throw new IllegalArgumentException("PIN deyishdirile bilmez!");
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    if (age < 0 || age < this.age) throw new IllegalArgumentException("Yashinizi duzgun daxil etmemisiniz!");
    else this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public double getGrade() {
    return grade;
  }

  public void setGrade(double grade) {
    this.grade = grade;
  }
}
