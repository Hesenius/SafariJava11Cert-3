package typedecls;

// being abstract:
// prevents direct instantiation
// permits abstract method

interface Int {
  // implicitly public and abstract
  void doStuff();
  // implicitly public, may be private, but nothing in between!
  static void doStaticStuff() {}
  // implicitly, and necessarily, public
  // "fallback" method if no concrete impl provided
  // in the implementing class, instance methods!!!
  default void doDefaultStuff() {}
  private void doPrivateStuff() {}
}
// abstract class needs constructors...
// final is not permitted for abstract class...
/*final*/ abstract class AC {
  int x;
  /*private*/ AC(int x) { this.x = x; }
  abstract void doStuff();

//  public static AC makeOne() {
//    return new AC(99);
//  }
}

class SC extends AC {
  // no explicit constructors?
  // get implicit "default" constructor
//  /*<class access>*/ SC() {
//    super();
//  }

  SC() {
    super(1);
  }

  @Override
  void doStuff() {}
//  abstract void doOtherStuff();
}

public class AbstractsEtc {
  public static void main(String[] args) {
//    new AC();
//    new SC();
  }
}
