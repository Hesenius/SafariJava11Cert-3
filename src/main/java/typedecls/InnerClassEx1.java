package typedecls;

public abstract class InnerClassEx1 {
  static class MyInner extends InnerClassEx1 {
    static InnerClassEx1 makeOne() {
      return new MyInner();
    }
    MyInner() {
      super(); // accessible :)
    }
  }

  private InnerClassEx1() {

  }
}
