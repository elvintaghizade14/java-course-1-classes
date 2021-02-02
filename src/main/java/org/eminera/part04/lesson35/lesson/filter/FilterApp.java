package org.eminera.part04.lesson35.lesson.filter;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.FilterHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.DispatcherType;
import java.util.EnumSet;

public class FilterApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9000);
    ServletContextHandler handler = new ServletContextHandler();

    // set servlets:
    handler.addServlet(new ServletHolder(new ServletA()), "/a/*");
    handler.addServlet(new ServletHolder(new ServletB()), "/b/*");
    handler.addServlet(RegServlet.class, "/set/*");
    handler.addServlet(LogoutServlet.class, "/del/*");
    
    // set filters:
    handler.addFilter(new FilterHolder(new CookieFilter()), "/a", EnumSet.of(DispatcherType.REQUEST));
    handler.addFilter(CookieFilter.class, "/b", EnumSet.of(DispatcherType.REQUEST));

    server.setHandler(handler);
    server.start();
    server.join();

  }
}
