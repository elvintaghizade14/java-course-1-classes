package org.eminera.part04.lesson33.lesson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

public class CalcServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        // 1. input
        // path variables:
        String x = req.getParameter("x");
        String y = req.getParameter("y");
        String op = req.getParameter("op");

        // 2. process
        Calculator calculator = new Calculator();
        String result = calculator.doOp(x, y, op);

        // 3. output
        try (OutputStream os = resp.getOutputStream()) {
            os.write(result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}