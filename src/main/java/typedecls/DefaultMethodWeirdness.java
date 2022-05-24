package typedecls;

interface IfA {
  default void sayHello() {
    System.out.println("IfA.sayHello");
  }
}

interface IfB extends IfA {
  default void sayHello() {
    System.out.println("IfB.sayHello");
  }
}

interface IfC {
  void sayHello();
//  default void sayHello() {
//    System.out.println("IfC.sayHello");
//  }
}

class IsAnA implements IfB, IfC {
  @Override
  public void sayHello() {
    System.out.println("IsAnA.sayHello");
//    super.sayHello();
    IfB.super.sayHello();
//    IfC.super.sayHello();
  }
}

public class DefaultMethodWeirdness {
  public static void main(String[] args) {
    IfA theA = new IsAnA();
    theA.sayHello();
  }
}
