package org.eminera.lesson06.hw_solution;

public class DiagramApp {
  public static void main1(String[] args) {
//    first solution:
    System.out.println("#####");
    System.out.println("####");
    System.out.println("###");
    System.out.println("##");
    System.out.println("#");
  }

  public static void main21(String[] args) {
    for (int i = 1; i <= 5; i++) {        // row      - setir
      for (int j = 0; j < i; j++) {       // column   - sutun
        System.out.print("#");            // print    - the same line
      }                                   // println  - new line
      System.out.println();
    }
  }

  /**
   * #####
   * ####
   * ###
   * ##
   * #
   */
  public static void main(String[] args) {
    for (int i = 5; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        System.out.print("*");
      }
      if (i != 1) {
        System.out.println();
      }
    }
  }
}