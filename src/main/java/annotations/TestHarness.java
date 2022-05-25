package annotations;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class TestHarness {
  public static void main(String[] args) throws Throwable {
    String nameOfClassToTest = "annotations.UnitUnderTest";
    Class<?> classToTest = Class.forName(nameOfClassToTest);
    System.out.println(classToTest);

    // find the zero arg constructor
    Constructor cons = classToTest.getConstructor();
    Object obj = cons.newInstance();
    System.out.println(obj);

    Method[] methods = classToTest.getMethods();
    for (var m : methods) {
      System.out.println(m);
      RunMe theAnnotation = m.getAnnotation(RunMe.class);
      if (theAnnotation != null) {
        System.out.println("**** RunMe annotation found!!! name="
            + theAnnotation.name());
        m.invoke(obj);
      }
    }
  }
}
