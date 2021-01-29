package org.eminera.part04.lesson33.lesson;

import java.util.function.BiFunction;

public class Calculator {

  public String doOp(String xs, String ys, String op) {
    String result;

    try {
      int x = toInt(xs);
      int y = toInt(ys);
      int r = doParse(x, y, op);
      result = String.valueOf(r);

    } catch (NumberFormatException nfe) {
      result = "You entered wrong number!";
    } catch (IllegalArgumentException iae) {
      result = iae.getMessage();
    } catch (ArithmeticException ae) {
      result = "Divide by zero not allowed!";
    } catch (Exception ge) {
      result = "Internal server error!";
    }

    return result;
  }

  private int toInt(final String original) throws NumberFormatException {
    return Integer.parseInt(original);
  }

  private int doParse(final int x, final int y, final String op) throws IllegalArgumentException {
    switch (op.toLowerCase()) {
      case "sum": return doCore(x, y, (a, b) -> (a + b));
      case "sub": return doCore(x, y, (a, b) -> (a - b));
      case "mul": return doCore(x, y, (a, b) -> (a * b));
      case "div": return doCore(x, y, (a, b) -> (a / b));
      case "mod": return doCore(x, y, (a, b) -> (a % b));
      default:    throw new IllegalArgumentException("No operation type found!");
    }
  }

  private int doCore(final int x, final int y, final BiFunction<Integer, Integer, Integer> f) throws ArithmeticException {
    return f.apply(x, y);
  }

}
