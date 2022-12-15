package org.eminera.part04.lesson33.lesson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RedirectServlet extends HttpServlet {
    private final String redirectTo;

    public RedirectServlet(String redirectTo) {
        this.redirectTo = redirectTo;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        resp.sendRedirect(redirectTo);
    }
}