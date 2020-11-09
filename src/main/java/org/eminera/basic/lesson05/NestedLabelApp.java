package org.eminera.basic.lesson05;

public class NestedLabelApp {
  /*
1, 2, 3, 4, 5
1, 2, 3, 4, 5
1, 2, 3, 4, 5
1, 2, 3, 4, 5
1, 2, 3, 4, 5
*/

  // First Solution:
  /*
  public static void main(String[] args) {


    System.out.println("1, 2, 3, 4, 5");
    System.out.println("1, 2, 3, 4, 5");
    System.out.println("1, 2, 3, 4, 5");
    System.out.println("1, 2, 3, 4, 5");
    System.out.println("1, 2, 3, 4, 5");


  }
  */

  // Second Solution:
  /*
  public static void main(String[] args) {
    for (int i = 0; i < 5; i++) {
      System.out.println("1, 2, 3, 4, 5");
    }
  }
  */

  // Third Solution:
  public static void main(String[] args) {
    int alma = 5;

    row:
    for (int i = 1; i <= 5; i++) { // setir - row
      column:
      for (int j = 1; j <= 5; j++) { // sutun - column
        System.out.print(j + " ");
        alma:
        for (int k = 0; k < 10; k++) {
          if (alma == 5) break row;
        }
      }
      System.out.println();
    }
    System.out.println();
  }
}