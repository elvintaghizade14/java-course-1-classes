package org.eminera.basic.lesson09.lesson;

public class TwoDimensionalMethodApp {
  private static int[][] array;

  public static void main(String[] args) {
//    1. input
    char[][] board = new char[5][5];

//    2. process
//    fillArrayWith(board, '1');
    fillArrayWith(board, '#', '@');

//    3. output
    printTwoDimensionalArray(board);


  }

  private static void fillArrayWith(char[][] board, char odd, char even) {
    for (int setir = 0; setir < 5; setir++) {
      for (int sutun = 0; sutun < 5; sutun++) {
        if (setir % 2 == 0) board[setir][sutun] = even;
        else board[setir][sutun] = odd;
      }
    }
  }

  private static void printTwoDimensionalArray(char[][] board) {
    for (int row = 0; row < 5; row++) {
      for (int col = 0; col < 5; col++) {
        System.out.print(board[row][col] + " ");
      }
      System.out.println();
    }
  }

  private static void fillArrayWith(char[][] board, char c) {
    for (int setir = 0; setir < 5; setir++) {
      for (int sutun = 0; sutun < 5; sutun++) {
        board[setir][sutun] = c;
      }
    }
  }
}
