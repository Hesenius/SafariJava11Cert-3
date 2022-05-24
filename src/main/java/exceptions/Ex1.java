package exceptions;

class AC implements AutoCloseable {
  private String name;

  public AC(String name) {
    this.name = name;
  }

  @Override
  public void close() {
    System.out.println("Closing " + name);
  }
}

public class Ex1 {
  public static void main(String[] args) {
    var ac0 = new AC("zero");
    try (
        var ac1 = new AC("one");
        var ac2 = new AC("two");
        ac0;) {
    }
  }
}
