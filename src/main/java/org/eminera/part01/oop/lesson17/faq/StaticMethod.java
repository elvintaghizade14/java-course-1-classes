package org.eminera.part01.oop.lesson17.faq;

public class StaticMethod {
  private static String name;
  private String surname;

  public double getRandomDouble() {
    return Math.random();
  }
  public static int getRandomInt() {
    return (int) (Math.random() * 100);
  }

  public static void main(String[] args) {
    System.out.println(name);
    System.out.println(getRandomInt());

    StaticMethod app = new StaticMethod();
    System.out.println(app.surname);
    System.out.println(app.getRandomDouble());
  }

  public int getRandomNumMult5() {
    return getRandomInt() * 5;
  }

  // static metod yalniz static-leri gore biler
  // static olmayan hem static-leri, hem de digerlerini gore biler
}
