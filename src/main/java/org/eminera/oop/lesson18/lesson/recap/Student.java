package org.eminera.oop.lesson18.lesson.recap;

public class Student {
  private int age;
  private String name;
  private double salary;
  private Gender gender; //MALE, FEMALE, ...

  // boilerplate codes
  public Student(int age, String name, double salary, Gender gender) {
    this.age = age;
    this.name = name;
    this.salary = salary;
    this.gender = gender;
  }

  @Override
  public String toString() {
    return String.format("Student[age=%d, name='%s', salary=%s, gender='%s']", age, name, salary, gender);
  }

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public Gender getGender() {
    return gender;
  }

  public void setGender(Gender gender) {
    this.gender = gender;
  }

//  public static void main(String[] args) {
//    for (int i = 0; i < 10; i++) System.out.print(i);
//    System.out.println("\n---");
//    IntStream.range(0, 10).forEach(System.out::print);
//  }


}