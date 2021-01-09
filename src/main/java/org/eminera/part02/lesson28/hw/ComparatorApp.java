package org.eminera.part02.lesson28.hw;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ComparatorApp {
  public static void main(String[] args) {
    /*
    1. CGPA in decreasing order
    2. If two student have the same CGPA,
       then arrange them according to their first name in alphabetical order
    3. If those two students also have the same first name,
       then order them according to their ID.
     */

    // teach   - ders demek     -> Teacher      - ders deyen
    // compare - muqayise etmek -> Compaparator - muqayise EDEN
    // compare - muqayise etmek -> Comparable   - muqayise edile bilen

    List<Student> studentList = Arrays.asList(
            new Student(33, "Rumpa", 3.68),
            new Student(85, "Ashis", 3.85),
            new Student(56, "Samiha", 3.75),
            new Student(19, "Samara", 3.75),
            new Student(22, "Fahim", 3.76),
            new Student(23, "Fahim", 3.76)
    );

//    Collections.sort(studentList, new Comparator<Student>() {
//      @Override
//      public int compare(Student s1, Student s2) {
//        if (s1.getCgpa() != s2.getCgpa()) return Double.compare(s2.getCgpa(), s1.getCgpa());
//        else if (!s1.getFname().equalsIgnoreCase(s2.getFname())) return s1.getFname().compareTo(s2.getFname());
//        else return Integer.compare(s1.getId(), s2.getId());
//      }
//    });

//    studentList.sort(new StudentComparator());

    Collections.sort(studentList);

    studentList.stream().map(Student::toString).forEach(System.out::println);

  }
}
