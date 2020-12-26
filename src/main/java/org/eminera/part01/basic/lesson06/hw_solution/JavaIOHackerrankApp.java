package org.eminera.part01.basic.lesson06.hw_solution;

import java.util.Scanner;

public class JavaIOHackerrankApp {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int myInt = sc.nextInt();
    double myDouble = sc.nextDouble();      // enter \n
    sc.nextLine();
    String myString = sc.nextLine();

//    System.out.println("My \nname \nis \nElvin!");


    System.out.println(myString);
    System.out.println(myDouble);
    System.out.println(myInt);
  }
}
