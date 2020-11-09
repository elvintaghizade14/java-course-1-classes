package org.eminera.basic.lesson09.lesson;

public class TwoDimensionalArrayApp {
  public static void main(String[] args) {
    int[] oneDimen = {5, 6, 7};
    int[][] twoDimen = {
            {5, 6, 7},
            {1, 2, 3},
            {8, 6, 9},
    };
    int el_1_2 = twoDimen[1][2];
    int[] row_1 = twoDimen[1];
    System.out.println(el_1_2);
  }
}