package controlstructs;

public class BreakContinue {
  public static void main(String[] args) {
    int x = 3;
    outer:
    while(x > 0) {
      System.out.println("x is " + x);
      int y = x;
      inner: while (y > 0) {
        System.out.println(".");
        // can I replace this with a different statement
        if (y == x) continue outer;
        if (y == x) break;
        if (y == x) break inner;
      }
      // NOTE, there's no code here
    }

    strange: {
      System.out.println("In strange");
      // only break, not continue, can be used in a non-loop situation
      if (true) break strange;
      System.out.println("end of strange");
    }
  }
}
