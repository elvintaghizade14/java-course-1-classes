package org.eminera.part04.lesson34.lesson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

public class FileUploadServlet extends HttpServlet {
  private static final String BASE_PATH = "src/main/java/org/eminera/part04/lesson34/";

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    try (OutputStream os = resp.getOutputStream()) {
      Path path = Paths.get(BASE_PATH, "content", "file_upload.html");
      Files.copy(path, os);
    }
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    for (Part part : req.getParts()) {
      String fieldName = part.getName();
      InputStream part_is = part.getInputStream();
      long size = part.getSize();
      String fileName = part.getSubmittedFileName();
      Path uploaded = Paths.get(BASE_PATH, "_uploaded", String.format("_%s%s", LocalDateTime.now(), fileName));
      Files.copy(part_is, uploaded);
    }

    try(PrintWriter w = resp.getWriter()) {
      w.write("DONE!");
    }
  }
}
