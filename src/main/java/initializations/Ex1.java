package initializations;

public class Ex1 {
  static int x;
  static {
    System.out.println("x is " + x);
    x = 99;
  }
  static String y;
  static {
    System.out.println("x is now " + x);
    System.out.println("y is " + y);
  }
  static Ex1 self = new Ex1();
  Ex1() {
    System.out.println("Value of static field y is " + y);
  }

  static {
    System.out.println("Initializing y");
    y = "Hello";
  }

  public static void main(String[] args) {
    Ex1 another = new Ex1();
  }
}
