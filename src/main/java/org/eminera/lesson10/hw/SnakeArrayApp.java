package org.eminera.lesson10.hw;

import java.util.Scanner;

public class SnakeArrayApp {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int counter = 1;
    int[][] arr = new int[n][n];
    for (int i = 0; i < n; i++) {
      if (i % 2 == 0) {
        for (int j = 0; j < n; j++) arr[i][j] = counter++;
      } else {
        for (int j = n - 1; j >= 0; j--) arr[i][j] = counter++;
      }
    }
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) System.out.print(arr[i][j] + " ");
      System.out.println();
    }
  }
}
