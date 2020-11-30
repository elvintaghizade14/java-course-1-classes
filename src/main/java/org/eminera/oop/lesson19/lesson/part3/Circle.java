package org.eminera.oop.lesson19.lesson.part3;

public class Circle extends Figure {
  double radius;

  public Circle(double radius) {
    super("Circle");
    this.radius = radius;
  }

  @Override
  public double calcArea() {
    this.area = Math.PI * Math.pow(radius, 2);
    return area;
  }

  @Override
  public double calcPerimeter() {
    this.perimeter = 2 * radius * Math.PI;
    return perimeter;
  }
}