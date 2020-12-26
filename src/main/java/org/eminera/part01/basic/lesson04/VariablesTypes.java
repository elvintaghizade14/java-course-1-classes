package org.eminera.part01.basic.lesson04;

import java.util.Scanner;

public class VariablesTypes {
  private static final int id = 10;


  public static void main(String[] args) {
    int b = 50;
    // instance variable
    Scanner input = new Scanner(System.in);

    // local variable (scope var)
    if (true) {
      System.out.println("Variable creation");
      int a = 6;
      int hasil = a * 8;
      System.out.println("a  = " + a);
      System.out.println("Variable deletion");
    }
    int a = 125;
    System.out.println("a  = " + a);

    // static variable (class var)
    System.out.println("id is " + id);
  }
}
