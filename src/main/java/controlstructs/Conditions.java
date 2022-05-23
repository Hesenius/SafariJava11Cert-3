package controlstructs;

public class Conditions {
  public static void main(String[] args) {
    final boolean b = false;
//    while (b || false) { // "while" complains, unreachable below
    if (b || false) { // if is OK, "conditional compilation"
      System.out.println("Hello");
    }

    final int x = 99;
    switch (x) {
      case 100:
        System.out.println("never gonna happen");
    }

    // switch on int and smaller numeric types
    // enum, and String
    String s = null;
    switch (s) {  // null pointer exception (in Java 11)
//      case null:
//        System.out.println("oops");
      default:
      System.out.println("got here");
    }

//    int fiveOh = 50;
//    final int fifty = fiveOh;
    final int fifty = 50;
    int a = 100;
    switch (a) {
      case fifty + 50: // case values must be compile time constant expressions
        System.out.println("Nope");
    }

    // don't forget the use of break in Java 11 version of switch

    DayOfWeek dow = DayOfWeek.MONDAY;
    switch (dow) {
      case MONDAY:
        System.out.println("Yup");
//      case DayOfWeek.SUNDAY:
//        System.out.println("NOPE!!!");
    }
  }
  enum DayOfWeek {
    SUNDAY, MONDAY;
  }
}
