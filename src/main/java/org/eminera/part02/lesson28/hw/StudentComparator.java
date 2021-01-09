package org.eminera.part02.lesson28.hw;

import org.eminera.part02.lesson28.hw.Student;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student> {
  @Override
  public int compare(Student s1, Student s2) {
    if (s1.getCgpa() != s2.getCgpa()) return Double.compare(s2.getCgpa(), s1.getCgpa());
    else if (!s1.getFname().equalsIgnoreCase(s2.getFname())) return s1.getFname().compareTo(s2.getFname());
    else return Integer.compare(s1.getId(), s2.getId());
  }
}
