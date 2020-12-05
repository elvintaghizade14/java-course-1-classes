package org.eminera.oop.lesson20.lesson.inter.example;

import java.io.*;

public class ExceptionApp {
  public static void main(String[] args) throws IOException {

    System.out.println("processig...");

    int[] arr = {1, 3, 5};
    System.out.println(arr[0]);

    write();
  }

  private static void write() throws IOException {
    File file = new File("lesson20.txt");
    FileWriter fw = new FileWriter(file);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write("Hello, World!");
    bw.close();
  }
}