package org.eminera.oop.lesson23.lesson;

import org.eminera.oop.lesson23.hw.binary_file.Person;
import org.eminera.oop.lesson23.hw.binary_file.Potato;
import org.eminera.oop.lesson23.hw.binary_file.Student;
import org.eminera.oop.lesson23.hw.binary_file.Teacher;

import java.util.ArrayList;

public class GenericListApp {
  public static void main1(String[] args) {

    ArrayList students = new ArrayList();

    students.add(new Student("A", 1));
    students.add(new Student("B", 2));
    students.add(new Student("B", 2));
    students.add(new Potato("P1", "v1"));

    System.out.println(students.toString());

  }

  public static void main2(String[] args) {

    ArrayList<Student> students = new ArrayList<>();

    students.add(new Student("A", 1));
    students.add(new Student("B", 2));
    students.add(new Student("B", 2));
//    students.add(new Potato("P1", "v1"));

    System.out.println(students.toString());
  }

  public static void main(String[] args) {

    ArrayList<Person> people = new ArrayList<>();

    people.add(new Student("A", 1));
    people.add(new Student("B", 2));
    people.add(new Student("B", 2));
    people.add(new Teacher());
//    people.add(new Potato("P1", "v1"));

    System.out.println(people.toString());
  }
}