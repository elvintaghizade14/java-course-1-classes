package org.eminera.part01.oop.lesson22.lesson.file.read;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class FileNIOApp {
  public static void main(String[] args) throws IOException {

    Path path = Paths.get("src/main/java/org/eminera/oop/lesson22/lesson/file/data", "write_file.txt");
    byte[] bytes = Files.readAllBytes(path);
    Files.write(path, Arrays.asList("Hello, World!", "Salam, Dunya!"));

  }
}