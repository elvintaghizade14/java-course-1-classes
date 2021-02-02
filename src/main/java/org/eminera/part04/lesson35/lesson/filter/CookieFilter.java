package org.eminera.part04.lesson35.lesson.filter;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class CookieFilter implements Filter {
  @Override
  public void init(FilterConfig filterConfig) throws ServletException {

  }

  @Override
  public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
    if (isHttp(servletRequest) && isCookieOk((HttpServletRequest) servletRequest)) {
      filterChain.doFilter(servletRequest, servletResponse);
    }
  }

  private boolean isCookieOk(HttpServletRequest request) {
    Cookie[] cookies = request.getCookies();
    if (cookies == null) return false;
    for (Cookie cookie : cookies) {
      String cookieName = cookie.getName();
      System.out.println(cookieName);
      String cookieValue = cookie.getValue();
      System.out.println(cookieValue);
      if (cookieName.equals("aaa") && cookieValue.equals("bbb")) return true;
    }
    return false;
  }

  private boolean isHttp(ServletRequest request) {
    return request instanceof HttpServletRequest;
  }

  @Override
  public void destroy() {

  }
}
