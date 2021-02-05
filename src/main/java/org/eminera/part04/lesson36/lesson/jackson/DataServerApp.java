package org.eminera.part04.lesson36.lesson.jackson;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

public class DataServerApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(8050);
    ServletContextHandler handler = new ServletContextHandler();

    handler.addServlet(new ServletHolder(new DataSupplyServlet()), "/api/v1/supply");
    handler.addServlet(new ServletHolder(new DataConsumeServlet()), "/api/v1/consume");

    server.setHandler(handler);
    server.start();
    server.join();
  }
}