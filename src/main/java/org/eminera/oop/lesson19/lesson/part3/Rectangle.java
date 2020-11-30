package org.eminera.oop.lesson19.lesson.part3;

public class Rectangle extends Figure {
  double width;
  double height;

  public Rectangle(double width, double height) {
    super("Rectangle");
    this.width = width;
    this.height = height;
  }

  @Override
  public double calcArea() {
    this.area =  width * height;
    return area;
  }

  @Override
  public double calcPerimeter() {
    this.perimeter = 2 * (width + height);
    return perimeter;
  }
}