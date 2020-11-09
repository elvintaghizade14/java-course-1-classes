package org.eminera.basic.lesson05;

public class CastingApp {
  public static void main(String[] args) {

    // narrowing & widening
    // casting

//    byte b;     // -128 -> 127
//    short s;    // -326xx -> 326xx
//    int i;      // -2 bln -> 2 bln
//    long l;     // -10^39 -> 10^39

//    byte -> int
    byte myByte = 120;
    int  byteToInt = myByte;

//    long -> short
    long boyuk = 2_000L;
    short kichik = (short) boyuk;

    System.out.println("myByte is: " + myByte + " -> byteToInt: " + byteToInt);
    System.out.println("myBoyuk is: " + boyuk + " -> kichik: " + kichik);

    int myInteger = 1000;
    long myLong = myInteger;
    System.out.println("myinteger is: " + myLong + " mylong is: " + myInteger);

    int sdfjksbjdf = 100;
    byte abc = (byte) sdfjksbjdf;

  }
}