package org.eminera.part04.lesson33.lesson;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) {
        try (OutputStream os = resp.getOutputStream()) {
            Path path = Paths.get("src/main/java/org/eminera/part04/lesson33/resourse/template/login.html");
            Files.copy(path, os);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) {
        String email = req.getParameter("email");
        String pass = req.getParameter("pass");

        String result;

        if (email.equalsIgnoreCase("elvintaghiyev184@gmail.com")
                && pass.equals("123")) result = "Logged in successfully";
        else result = "Email or password is incorrect!";

        try (OutputStream os = resp.getOutputStream()) {
            os.write(result.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}