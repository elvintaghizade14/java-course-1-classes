package org.eminera.part01.oop.lesson22.lesson.file.write;

import java.io.*;

public class FileWriteApp {
  private static final String MY_PATH = "src/main/java/org/eminera/oop/lesson22/lesson/file/data";

  public static void main(String[] args) throws IOException {


    File file = new File(MY_PATH, "write_file.txt");

    FileWriter fw = new FileWriter(file, false);
    BufferedWriter bw = new BufferedWriter(fw);
    bw.write("Line 1");
    bw.write("\nLine 2");
    bw.write("\nLine 3");
    bw.close();
    fw.close();

    BufferedWriter bw2 = new BufferedWriter(new FileWriter(new File(MY_PATH, "new_file_2")));
    bw2.write("Hello, World!");
    bw2.close();

    FileReader fr = new FileReader(file);
    BufferedReader br = new BufferedReader(fr);
    while (br.readLine() != null) {
      System.out.println(br.readLine());
    }
    br.close();
    fr.close();
  }
}