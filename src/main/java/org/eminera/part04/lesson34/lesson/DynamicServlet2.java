package org.eminera.part04.lesson34.lesson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DynamicServlet2 extends HttpServlet {
  private final TemplateEngine templateEngine;

  public DynamicServlet2(TemplateEngine templateEngine) {
    this.templateEngine = templateEngine;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    HashMap<String, Object> data = new HashMap<>();
    data.put("name", "Elvin");
    List<Student> students = Arrays.asList(
            new Student("Elvin", "Taghizade", 21, "CS"),
            new Student("Elvin", "Taghizade", 21, "CS"),
            new Student("Elvin", "Taghizade", 21, "CS"),
            new Student("Elvin", "Taghizade", 21, "CS")
    );
    data.put("students", students);
    templateEngine.render("dynamic2.ftl", data, resp);
  }
}