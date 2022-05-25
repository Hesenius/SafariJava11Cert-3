package liskov;

public class Access {
  class Base {
    void doBaseStuff() { System.out.println("doBaseStuff"); }
  }
  class Sub extends Base {
//    @Override
    void doBaseStuff() { System.out.println("doSubStuff"); }
    void doOtherStuff() { System.out.println("doOtherStuff"); }
  }
}

/*
public -- Java 8, anywhere in the running JVM -- modules...
protected -- anywhere in the same package PLUS in subtypes IFF you are using
             a reference of the sub-type type
<default> -- anywhere in the same package (modules...)
private -- anywhere inside the enclosing TOP-LEVEL curlies surrounding
 */