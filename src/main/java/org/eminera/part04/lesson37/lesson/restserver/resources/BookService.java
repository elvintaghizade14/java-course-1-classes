package org.eminera.part04.lesson37.lesson.restserver.resources;

import org.eminera.part04.lesson37.lesson.restserver.Book;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.*;

@Path("/books")
public class BookService {
    // KISS - Keep It Super Simple
    // DRY - Do not Repeat Yourself
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

    /**
     * http://localhost:8081/shop/books/1
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Response findById(@PathParam("id") int bookId) {
        return Optional.of(BOOKS.get(bookId))
                .map(book -> Response.status(Response.Status.OK).entity(book))
                .orElse(Response.status(Response.Status.NOT_FOUND))
                .build();
    }

    /**
     * http://localhost:8081/shop/books
     */
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response saveBook(Book book) {
        Integer max = BOOKS.keySet().stream().max(Comparator.comparingInt(i -> i)).orElse(0);
        BOOKS.put(max + 1, book);
        return Response.status(Response.Status.OK).build();
    }

}