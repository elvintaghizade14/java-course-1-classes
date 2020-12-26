package org.eminera.part01.oop.lesson21.lesson.file;

import java.io.*;
import java.util.List;
import java.util.stream.Collectors;

public class FileApp {
  public static void main(String[] args) throws IOException {

    File file = new File("./src/main/java/org/eminera/oop/lesson21/lesson/file/data/myfile.txt");
    FileWriter fw = null;
    fw = new FileWriter(file);
    fw.write("Salam, Dunya!\nNe xeber ne var ne yox\nCOVID-19");
    fw.close();

    FileReader fr = null;
    try {
      fr = new FileReader(file);
      BufferedReader br = new BufferedReader(fr);
      List<String> lines = br.lines().collect(Collectors.toList());
      br.close();
      fr.close();
//      lines.forEach(); // stream
      for (String line : lines) System.out.println(line); // enhanced-for-loop not "foreach"
    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}