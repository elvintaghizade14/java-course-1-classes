package org.eminera.lesson09.lesson;

public class Board5x5App {
  public static void main(String[] args) {
    int[][] board = new int[3][5];

//    row     - setir
//    column  - sutun

//    S.O.L.I.D.
//    Single Responsibility

    for (int setir = 0; setir < 5; setir++) {
      for (int sutun = 0; sutun < 5; sutun++) {
        board[setir][sutun] = 8;
        System.out.print(board[setir][sutun] + " ");
      }
      System.out.println();
    }

    System.out.println("=-=-=-=-=");

    for (int setir = 0; setir < 5; setir++) {
      for (int sutun = 0; sutun < 5; sutun++) {
        System.out.print(board[setir][sutun] + " ");
      }
      System.out.println();
    }

  }
}