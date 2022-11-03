package com.inkombizz.utils;

public class Globalize {

  public static double getPercentAmount(double percent, double amount) {
    return amount * (percent / 100);
  }

  public static double getCOGS(double price, double discPercent, double discPercentHeader) {

    double subTotal = price - getPercentAmount(discPercent, price);

    return subTotal - getPercentAmount(discPercentHeader, subTotal);
  }

  public static double getSubTotal(double quantity, double price, double discountPercent) {
    double total = quantity * price;
    return total - (total * (discountPercent / 100));
  }

  public static short getCell(String cellPosition) {
    short rValue = 0;

    cellPosition = cellPosition.toUpperCase();

    if (cellPosition.equals("A")) {
      rValue = 0;
    } else if (cellPosition.equals("B")) {
      rValue = 1;
    } else if (cellPosition.equals("C")) {
      rValue = 2;
    } else if (cellPosition.equals("D")) {
      rValue = 3;
    } else if (cellPosition.equals("E")) {
      rValue = 4;
    } else if (cellPosition.equals("F")) {
      rValue = 5;
    } else if (cellPosition.equals("G")) {
      rValue = 6;
    } else if (cellPosition.equals("H")) {
      rValue = 7;
    } else if (cellPosition.equals("I")) {
      rValue = 8;
    } else if (cellPosition.equals("J")) {
      rValue = 9;
    } else if (cellPosition.equals("K")) {
      rValue = 10;
    } else if (cellPosition.equals("L")) {
      rValue = 11;
    } else if (cellPosition.equals("M")) {
      rValue = 12;
    } else if (cellPosition.equals("N")) {
      rValue = 13;
    } else if (cellPosition.equals("O")) {
      rValue = 14;
    } else if (cellPosition.equals("P")) {
      rValue = 15;
    } else if (cellPosition.equals("Q")) {
      rValue = 16;
    } else if (cellPosition.equals("R")) {
      rValue = 17;
    } else if (cellPosition.equals("S")) {
      rValue = 18;
    } else if (cellPosition.equals("T")) {
      rValue = 19;
    } else if (cellPosition.equals("U")) {
      rValue = 20;
    } else if (cellPosition.equals("V")) {
      rValue = 21;
    } else if (cellPosition.equals("W")) {
      rValue = 22;
    } else if (cellPosition.equals("X")) {
      rValue = 23;
    } else if (cellPosition.equals("Y")) {
      rValue = 24;
    } else if (cellPosition.equals("Z")) {
      rValue = 25;
    } else if (cellPosition.equals("AA")) {
      rValue = 26;
    } else if (cellPosition.equals("AB")) {
      rValue = 27;
    } else if (cellPosition.equals("AC")) {
      rValue = 28;
    } else if (cellPosition.equals("AD")) {
      rValue = 29;
    } else if (cellPosition.equals("AE")) {
      rValue = 30;
    } else if (cellPosition.equals("AF")) {
      rValue = 31;
    } else if (cellPosition.equals("AG")) {
      rValue = 32;
    } else if (cellPosition.equals("AH")) {
      rValue = 33;
    } else if (cellPosition.equals("AI")) {
      rValue = 34;
    } else if (cellPosition.equals("AJ")) {
      rValue = 35;
    } else if (cellPosition.equals("AK")) {
      rValue = 36;
    } else if (cellPosition.equals("AL")) {
      rValue = 37;
    } else if (cellPosition.equals("AM")) {
      rValue = 38;
    } else if (cellPosition.equals("AN")) {
      rValue = 39;
    } else if (cellPosition.equals("AO")) {
      rValue = 40;
    } else if (cellPosition.equals("AP")) {
      rValue = 41;
    } else if (cellPosition.equals("AQ")) {
      rValue = 42;
    } else if (cellPosition.equals("AR")) {
      rValue = 43;
    } else if (cellPosition.equals("AS")) {
      rValue = 44;
    } else if (cellPosition.equals("AT")) {
      rValue = 45;
    } else if (cellPosition.equals("AU")) {
      rValue = 46;
    } else if (cellPosition.equals("AV")) {
      rValue = 47;
    } else if (cellPosition.equals("AW")) {
      rValue = 48;
    } else if (cellPosition.equals("AX")) {
      rValue = 49;
    } else if (cellPosition.equals("AY")) {
      rValue = 50;
    }

    return rValue;
  }

  public static String IntegerToRomanNumeral(int input) {

    if (input < 1 || input > 3999) {
      return "Invalid Roman Number Value";
    }

    String s = "";

    while (input >= 1000) {
      s += "M";
      input -= 1000;
    }
    while (input >= 900) {
      s += "CM";
      input -= 900;
    }
    while (input >= 500) {
      s += "D";
      input -= 500;
    }
    while (input >= 400) {
      s += "CD";
      input -= 400;
    }
    while (input >= 100) {
      s += "C";
      input -= 100;
    }
    while (input >= 90) {
      s += "XC";
      input -= 90;
    }
    while (input >= 50) {
      s += "L";
      input -= 50;
    }
    while (input >= 40) {
      s += "XL";
      input -= 40;
    }
    while (input >= 10) {
      s += "X";
      input -= 10;
    }
    while (input >= 9) {
      s += "IX";
      input -= 9;
    }
    while (input >= 5) {
      s += "V";
      input -= 5;
    }
    while (input >= 4) {
      s += "IV";
      input -= 4;
    }
    while (input >= 1) {
      s += "I";
      input -= 1;
    }
    return s;
  }
}
