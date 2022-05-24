package enumstuff;

enum Day {
  MONDAY(1), TUESDAY;
  /*public */Day(int d) {}
  /*public */Day() {}

  // name() is final
//  @Override
//  public String name() { return "x"; };
  @Override
  public String toString() {
    return "I'm a Day, called " + name();
  }
}

public class Ex1 {
  public static void main(String[] args) {
    System.out.println(Day.MONDAY);
    System.out.println(Day.MONDAY.ordinal());
//    Day d = Day.valueOf("MONDAY");
    Day d = Enum.valueOf(Day.class, "MONDAY");
    System.out.println(d);
    System.out.println("d == MONDAY? " + (d == Day.MONDAY));

  }
}
