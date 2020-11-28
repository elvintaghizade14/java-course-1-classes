package org.eminera.oop.lesson18.lesson.overriding;

import java.util.Objects;

public class Person extends Object{
  int age;
  String name;

  public Person(int age, String name) {
    this.age = age;
    this.name = name;
  }

  @Override
  public String toString() {
    return String.format("Person[age=%d, name='%s']", age, name);
  }

  public boolean yoxla(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Person person = (Person) o;
    return age == person.age &&
            name.equals(person.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(age, name);
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
}
