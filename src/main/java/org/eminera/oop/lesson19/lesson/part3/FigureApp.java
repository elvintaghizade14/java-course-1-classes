package org.eminera.oop.lesson19.lesson.part3;

public class FigureApp {
  public static void main(String[] args) {

    Figure square = new Square(10);
    Figure circle = new Circle(10);
    Figure rectangle = new Rectangle(5, 10);
//    Figure figure = new Figure("figure");

    figureGreeting1(square);
    figureGreeting1(circle);
    figureGreeting1(rectangle);
//    figureGreeting1("Elvin");

    figureGreeting2(square);
    figureGreeting2(circle);
    figureGreeting2(rectangle);
//    figureGreeting2("Elvin");

  }

  private static void figureGreeting1(Figure obj) {
    // spaghetti-garbage code:
    if (obj instanceof Square) {
      System.out.println("Area is: " + obj.calcArea());
      System.out.println("Perimeter is: " + obj.calcPerimeter());
      System.out.println("Hello, Square!");
    } else if (obj instanceof Circle) {


      System.out.println("Hello, Circle!");
    } else if (obj instanceof Rectangle) {


      System.out.println("Hello, Rectangle!");
    } else {
      System.out.println("No figure like that!" + " -> " + obj.getClass().getName());
    }
  }

  public static void figureGreeting2(Figure figure) {
    System.out.printf("Hello, %s!\n", figure.name);
    System.out.printf("Area is: %s", figure.calcArea());
    System.out.printf("Perimeter is: %s", figure.calcPerimeter());
  }
}

/*

    System.out.println(square.calcArea());
    System.out.println(circle.calcArea());
    System.out.println(rectangle.calcArea());

    System.out.println(square.calcPerimeter());
    System.out.println(circle.calcPerimeter());
    System.out.println(rectangle.calcPerimeter());

 */