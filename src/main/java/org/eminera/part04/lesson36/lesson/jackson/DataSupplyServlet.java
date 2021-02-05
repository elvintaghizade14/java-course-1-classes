package org.eminera.part04.lesson36.lesson.jackson;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.jetty.http.HttpStatus;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public class DataSupplyServlet extends HttpServlet {
  private static final ObjectMapper MAPPER
//          = new XmlMapper();
          = new ObjectMapper();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    List<Student> students = Arrays.asList(
            new Student("Elvin", 21, "CS"),
            new Student("Ismayil", 20, "IT"),
            new Student("Veli", 50, "Fizika")
    );

    Student alan = new Student("Alan Turing", 40, "ICT");
    alan.setCourses(Arrays.asList("A", "B", "C"));
    // serialize: Java object -> binary data (JSON)

    MyData myData = new MyData(alan, students);

    String representation
//            = "User not found!";
            = MAPPER.writeValueAsString(myData);
//    resp.setStatus(HttpStatus.NOT_FOUND_404);
    resp.setStatus(HttpStatus.FOUND_302);

    try (PrintWriter pw = resp.getWriter()) {
      pw.write(representation);
    }

  }

  static class MyData {
    private final Student student;
    private final List<Student> students;

    public MyData(Student student, List<Student> students) {
      this.student = student;
      this.students = students;
    }

    public Student getStudent() {
      return student;
    }

    public List<Student> getStudents() {
      return students;
    }
  }

}