package org.eminera.part04.lesson32.lesson;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class InfoServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    try (PrintWriter pw = resp.getWriter()) {
      System.out.println("GET method called ->" + LocalDateTime.now());
      pw.write("Hello, Java EE!");
      pw.println("Hello, Java EE!");
    } catch (Exception e) {
      System.out.println(e);
    }
  }
}
