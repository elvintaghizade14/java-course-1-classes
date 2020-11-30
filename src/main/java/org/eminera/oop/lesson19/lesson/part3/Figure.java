package org.eminera.oop.lesson19.lesson.part3;

public abstract class Figure {
  // instance variables:
  String name;
  double area;
  double perimeter;

  public Figure(String name) {
    this.name = name;
  }

  public abstract double calcArea();

  public abstract double calcPerimeter();
}