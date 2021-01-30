package org.eminera.part04.lesson34.lesson;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

import javax.servlet.MultipartConfigElement;

public class DynamicServerApp {
  public static void main(String[] args) throws Exception {
    Server server = new Server(9000);
    ServletContextHandler handler = new ServletContextHandler();

    // template engine configuration
    TemplateEngine templateEngine = TemplateEngine.folder("content");

    // servlets
    handler.addServlet(new ServletHolder(new DynamicServlet(templateEngine)), "/dynamic1");
    handler.addServlet(new ServletHolder(new DynamicServlet2(templateEngine)), "/dynamic2");

    // file upload
    handler.addServlet(FileUploadServlet.class, "/upload").getRegistration().setMultipartConfig(
            new MultipartConfigElement("./uploaded", 10_000_000L, 10_000_000L, 10_000_000)
    );

    server.setHandler(handler);
    server.start();
    server.join();
  }
}