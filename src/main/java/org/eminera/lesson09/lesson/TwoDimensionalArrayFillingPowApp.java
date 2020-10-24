package org.eminera.lesson09.lesson;

public class TwoDimensionalArrayFillingPowApp {
  public static void main(String[] args) {
    int[][] arr = new int[5][5];

    for (int row = 0; row < 5; row++) {
      for (int col = 0; col < 5; col++) {
        if (row == 0 || col == 0) arr[row][col] = 1;
        else arr[row][col] = (row) * (col);
      }
    }

    for (int row = 0; row < 5; row++) {
      for (int col = 0; col < 5; col++) {
        System.out.print(arr[row][col] + "\t");
      }
      System.out.println();
    }
  }
}
