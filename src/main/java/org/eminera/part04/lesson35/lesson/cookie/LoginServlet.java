package org.eminera.part04.lesson35.lesson.cookie;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
    Cookie cookie = new Cookie("uid", "123456789");
    cookie.setMaxAge(60*60*24*7);
    cookie.setPath("/*");
    resp.addCookie(cookie);
  }
}
