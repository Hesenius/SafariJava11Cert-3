package overloadresolution;

public class Ex1 {
//  void doStuff(int x, int y) {}         // Method A
  void doStuff(int x, long y) {}        // Method B
  void doStuff(int x, float y) {}
//  void doStuff(long x, int y) {}        // Method C
  void doStuff(int ... x) {}            // Method D
  void doStuff(Number x, Integer y) {} // Method E
  void doStuff(Integer x, Number y) {} // Method E
  void doStuff(Integer x, Integer y) {} // Method E

  public static void main(String[] args) {
    Ex1 ex1 = null;
    ex1.doStuff(1, 2);
  }
}
