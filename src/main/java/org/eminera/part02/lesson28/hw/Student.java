package org.eminera.part02.lesson28.hw;

public class Student implements Comparable<Student>{
  private final int id;
  private final String fname;
  private final double cgpa;

  public Student(int id, String fname, double cgpa) {
    super();
    this.id = id;
    this.fname = fname;
    this.cgpa = cgpa;
  }

  public int getId() {
    return id;
  }

  public String getFname() {
    return fname;
  }

  public double getCgpa() {
    return cgpa;
  }

  @Override
  public String toString() {
    return "Student{" +
            "id=" + id +
            ", fname='" + fname + '\'' +
            ", cgpa=" + cgpa +
            '}';
  }

  @Override
  public int compareTo(Student that) {
    if (this.getCgpa() != that.getCgpa()) return Double.compare(that.getCgpa(), this.getCgpa());
    else if (!this.getFname().equalsIgnoreCase(that.getFname())) return this.getFname().compareTo(this.getFname());
    else return Integer.compare(this.getId(), that.getId());
  }
}