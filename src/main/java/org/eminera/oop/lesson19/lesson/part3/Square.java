package org.eminera.oop.lesson19.lesson.part3;

public class Square extends Figure {
  double side;

  public Square(double side) {
    super("Square");
    this.side = side;
  }

  @Override
  public double calcArea() {
    this.area = Math.pow(side, 2);
    return area;
  }

  @Override
  public double calcPerimeter() {
    this.perimeter = 4 * side;
    return perimeter;
  }
}