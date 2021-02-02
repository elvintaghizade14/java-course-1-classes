package org.eminera.part04.lesson35.lesson.transaction;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TransactionSQLApp {
  private static final String URL = "";
  private static final String USERNAME = "postgres";
  private static final String PASSWORD = "secret";

  public static void main(String[] args) throws SQLException {
    Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

    try {
      conn.setAutoCommit(false);

      // ...
      // ...
      // ...

      conn.commit();
    } catch (Exception e) {
      conn.rollback();
      System.out.println(e.getMessage());
    }

  }
}
