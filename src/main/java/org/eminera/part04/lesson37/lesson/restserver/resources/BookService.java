package org.eminera.part04.lesson37.lesson.restserver.resources;
// KISS - Keep It Super Simple

import org.eminera.part04.lesson37.lesson.restserver.Book;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Path("/books")
public class BookService {

  private static final Map<Integer, Book> BOOKS = new HashMap<Integer, Book>() {{
    put(1, new Book(1, "Java", "Boyarsky", Arrays.asList("a", "b")));
    put(2, new Book(2, "Scala", "John", Collections.singletonList("c")));
    put(3, new Book(3, "Kotlin", "Jim", Arrays.asList("d", "e", "f")));
  }};

  /**
   * http://localhost:8081/shop/books
   */
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Response findAll() {
    return Response
            .status(Response.Status.OK)
            .entity(BOOKS.values())
            .build();
  }


}