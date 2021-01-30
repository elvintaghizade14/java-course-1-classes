package org.eminera.part04.lesson34.lesson;

public class Student {
  private final String name;
  private final String surname;
  private final int age;
  private final String group;

  public Student(String name, String surname, int age, String group) {
    this.name = name;
    this.surname = surname;
    this.age = age;
    this.group = group;
  }

  public String getName() {
    return name;
  }

  public String getSurname() {
    return surname;
  }

  public int getAge() {
    return age;
  }

  public String getGroup() {
    return group;
  }

  @Override
  public String toString() {
    return String.format("Student[name='%s', surname='%s', age=%d, group='%s']",
            name, surname, age, group);
  }
}
