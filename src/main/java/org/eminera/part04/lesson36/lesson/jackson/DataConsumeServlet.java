package org.eminera.part04.lesson36.lesson.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;

public class DataConsumeServlet extends HttpServlet {
  private static final ObjectMapper MAPPER = new ObjectMapper();


  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
    BufferedReader body = req.getReader();

    Student student = MAPPER.readValue(body, Student.class);

    System.out.println(student);
  }

}