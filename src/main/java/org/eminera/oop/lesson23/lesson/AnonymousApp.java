package org.eminera.oop.lesson23.lesson;

public class AnonymousApp {
  public static void main(String[] args) {

    Figure square = new Square(5);
    Figure figure = new Figure() {
      @Override
      public double calcArea() {
        return -50;
      }

      @Override
      public String toString() {
        return this.getClass().getName();
      }
    };
    Figure figure2 = new Figure() {
      @Override
      public double calcArea() {
        return 100;
      }

      @Override
      public String toString() {
        return this.getClass().getName();
      }
    };

    System.out.println(square);
    System.out.println(figure);
    System.out.println(figure.calcArea());
    System.out.println(figure2);
    System.out.println(figure2.calcArea());

  }
}