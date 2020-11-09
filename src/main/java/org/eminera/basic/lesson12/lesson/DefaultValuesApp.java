package org.eminera.basic.lesson12.lesson;

/*
- Class/global   - declare olundusa, ancaq initialize olunmayibsa, o zaman "default" deyer alir!
- Local          - declare olundusa, mutleq istifade etmek uvhun initialize olunmalidir
- Instance       - object variables
 */

public class DefaultValuesApp {
  static int globalVariableInt;           // class/global/static variable
  static double globalVariableDouble;     // class/global/static variable
  static char globalVariableChar;         // class/global/static variable
  static boolean globalVariableBoolean;   // class/global/static variable
  static String globalVariableString;     // class/global/static variable

  public static void main(String[] args) {
    int a = 1;                      // -> local var.
    String b = "2";                 // -> local var.
//    System.out.println(a); // 1
//    System.out.println(b); // 2
    System.out.println(globalVariableInt);       // 0
    System.out.println(globalVariableDouble);    // 0.0
    System.out.println(globalVariableChar);      // space - \u0000 - 32
    System.out.println(globalVariableBoolean);   // false
    System.out.println(globalVariableString);    // null

    String abc = null;
    System.out.println(abc.toUpperCase());
  }
}
/*
byte                     0
short                    0
int                      0
long                     0

float                    0.0f
double                   0.0d

char                     '\u0000'
boolean                  false

Reference types          null
 */