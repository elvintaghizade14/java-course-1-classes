package org.eminera.oop.lesson23.hw.binary_file;

import java.io.*;
import java.nio.charset.StandardCharsets;

public class BinaryFileApp {
  public static void main1v1(String[] args) throws IOException {
    Student elvin = new Student("Elvin", 21);
    System.out.println(elvin);

    // write to file traditional:
    final File file = new File("src/main/java/org/eminera/oop/lesson23/hw/data/std_str.txt");
    FileWriter fw = null;
    BufferedWriter bw = null;
    try {
      fw = new FileWriter(file);
      bw = new BufferedWriter(fw);
      bw.write(elvin.toString());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    } finally {
      if (bw != null) bw.close();
      if (fw != null) fw.close();
    }
  }

  public static void main1v2(String[] args) {
    Student elvin = new Student("Ismayil", 20);
    System.out.println(elvin);

    // write to file traditional:
    final File file = new File("src/main/java/org/eminera/oop/lesson23/hw/data/std_str2.txt");
    try (FileWriter fw = new FileWriter(file);
         BufferedWriter bw = new BufferedWriter(fw)) {
      bw.write(elvin.toString());
    } catch (IOException e) {
      System.out.println(e.getMessage());
    }
  }

  public static void main(String[] args) {
    final Student elvin = new Student("Elvin", 21);
    final File file = new File("src/main/java/org/eminera/oop/lesson23/hw/data/str.bin");
    final File file2 = new File("src/main/java/org/eminera/oop/lesson23/hw/data/std_bin.ser");

    try (FileOutputStream fos = new FileOutputStream(file);
         BufferedOutputStream bos = new BufferedOutputStream(fos)) {
      bos.write("Hello, World!".getBytes(StandardCharsets.UTF_8));
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (FileOutputStream fos = new FileOutputStream(file2);
         ObjectOutputStream oos = new ObjectOutputStream(fos)) {
      oos.writeObject(elvin);
    } catch (IOException e) {
      e.printStackTrace();
    }

    try (FileInputStream fis = new FileInputStream(file2);
         ObjectInputStream ois = new ObjectInputStream(fis)) {
      Object readElvin = ois.readObject();
      System.out.println("READ -> " + readElvin);
      System.out.println(readElvin.getClass().getName());
    } catch (IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }


  }
}