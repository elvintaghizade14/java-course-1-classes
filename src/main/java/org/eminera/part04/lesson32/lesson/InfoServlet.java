package org.eminera.part04.lesson32.lesson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class InfoServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
//    try (PrintWriter pw = resp.getWriter()) {
//      System.out.println("GET method called ->" + LocalDateTime.now());
//      pw.write("Hello, Java EE!");
//    } catch (Exception e) {
//      System.out.println(e);
//    }

    try (OutputStream os = resp.getOutputStream()) {
      os.write("Hello, World!".getBytes());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}
