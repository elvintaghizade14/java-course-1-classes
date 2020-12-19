package org.eminera.oop.lesson23.lesson;

public class Square implements Figure {
  double side;

  public Square(double side) {
    this.side = side;
  }

  @Override
  public double calcArea() {
    return Math.pow(this.side, 2);
  }

  @Override
  public String toString() {
    return new StringBuilder().append("Square{").append("side=").append(side).append('}').toString();
  }
}
