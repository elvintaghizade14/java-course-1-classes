package org.eminera.part04.lesson34.lesson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;

public class DynamicServlet extends HttpServlet {
  private final TemplateEngine templateEngine;

  public DynamicServlet(TemplateEngine templateEngine) {
    this.templateEngine = templateEngine;
  }

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    HashMap<String, Object> data = new HashMap<>();
    data.put("name", "Elvin");
    templateEngine.render("dynamic1.ftl", data, resp);
  }
}