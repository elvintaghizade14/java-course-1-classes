package org.eminera.part04.lesson33.lesson;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eminera.part04.lesson32.lesson.InfoServlet;

public class ServerApp {
  //standalone - Apache Tomcat
  //embedded   - Jetty
  public static void main(String[] args) throws Exception {
    // server
    Server server = new Server(8080);
    // controller
    ServletContextHandler handler = new ServletContextHandler();
    // service
    handler.addServlet(new ServletHolder(new InfoServlet()), "/info");
    handler.addServlet(new ServletHolder(new CalcServlet()), "/calc");
    handler.addServlet(new ServletHolder(new LoginServlet()),"/login");
    handler.addServlet(new ServletHolder(new StaticServlet("image")), "/image/*");
    handler.addServlet(new ServletHolder(new StaticServlet("js")), "/js/*");
    handler.addServlet(new ServletHolder(new StaticServlet("css")), "/css/*");
    handler.addServlet(new ServletHolder(new RedirectServlet("/login")),"/*");
    server.setHandler(handler);

    server.start();
    server.join();
  }
}
