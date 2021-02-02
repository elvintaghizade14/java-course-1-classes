package org.eminera.part04.lesson35.lesson.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;

public class GetCookieServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    Cookie[] cookies = req.getCookies();
    Arrays.stream(cookies)
            .forEach(cookie -> System.out.printf("Cookie[name='%s', value='%s']", cookie.getName(), cookie.getValue()));
  }
}
