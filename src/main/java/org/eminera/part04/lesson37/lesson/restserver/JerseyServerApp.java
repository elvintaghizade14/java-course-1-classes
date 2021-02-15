package org.eminera.part04.lesson37.lesson.restserver;

import org.eminera.part04.lesson37.lesson.restserver.resources.BookService;
import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;

import java.io.IOException;
import java.net.URI;

public class JerseyServerApp {
  public static void main(String[] args) throws IOException {
    ResourceConfig config = new ResourceConfig()
            .packages("lesson37.lesson.restserver.resources");
    config.register(BookService.class);
    HttpServer server = GrizzlyHttpServerFactory.createHttpServer(
            URI.create("http://127.0.0.1:8081/shop"),
            config
    );
    server.start();
  }
}
