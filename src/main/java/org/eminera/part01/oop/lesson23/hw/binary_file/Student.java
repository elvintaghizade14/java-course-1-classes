package org.eminera.part01.oop.lesson23.hw.binary_file;

import java.io.Serializable;

public class Student extends Person implements Serializable {
  final String name;
  final int age;

  public Student(String name, int age) {
    super();
    this.name = name;
    this.age = age;
  }

  @Override
  public String toString() {
    return String.format("Student[name='%s', age=%d]", name, age);
  }
}