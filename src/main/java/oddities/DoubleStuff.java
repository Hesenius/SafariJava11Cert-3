package oddities;

public class DoubleStuff {
  public static void main(String[] args) {
    double d = Double.NaN;
    double d2 = Math.sqrt(-1);
    System.out.println(d);
    System.out.println(d2);
    System.out.println(d == d2);
  }
}
