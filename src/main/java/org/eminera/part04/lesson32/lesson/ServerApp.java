package org.eminera.part04.lesson32.lesson;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class ServerApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9000);
    System.out.println("Before handler");
    ServletContextHandler handler = new ServletContextHandler();
    System.out.println("After handler");
    handler.addServlet(new ServletHolder(new InfoServlet()), "/info");
    System.out.println("After servlet");

    server.start();
    server.join();
  }
}
