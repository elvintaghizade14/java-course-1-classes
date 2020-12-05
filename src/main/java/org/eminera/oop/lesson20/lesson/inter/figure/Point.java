package org.eminera.oop.lesson20.lesson.inter.figure;

public class Point extends D1FigureAbs implements D1Figure {
  @Override
  public void draw() {
    System.out.println(".");
  }
}
