package org.eminera.basic.lesson13.exam;

public class IsmayilExamApp {
  public static void main(String[] args) {
    System.out.println(numLetters2("salam"));
    System.out.println(numLetters("sAlam"));
  }

  public static String numLetters2(String text) {
    StringBuilder end = new StringBuilder();
    int counter = 0;
    char c, d;
    aa:
    for (int i = 0; i < text.length(); i++) {
      c = text.charAt(i);
      for (int j = 0; j < text.length(); j++) {
        d = text.charAt(j);
        counter = c == d ? counter + 1 : counter;
      }
      for (int k = 0; k < end.length(); k++) {
        if (end.length() <= 1) break;
        if (end.charAt(k) == c) {
          counter = 0;
          continue aa;
        }
      }
      end.append(counter).append(c);
      counter = 0;
    }
    return end.toString();
  }

  public static String numLetters(String text) {
    int[] count = new int[26];
    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      // c = 'd' -> ascii -> 100; 'a' -> 97
      // 100 - 97 = 3
      // a b c d e ... z
      // 0 1 2 3 4 ... 25
      count[c - 'a']++;
    }
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < 26; i++) {
      if (count[i] != 0) result.append(String.format("%s - %d\n", (char) (i + 'a'), count[i]));
    }
    return result.toString();
  }
}
