package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//public @ interface RunMe {
//@Target({ElementType.METHOD})
@Target(ElementType.METHOD) // array of values with ONLY ONE value
@Retention(RetentionPolicy.RUNTIME)
public @interface RunMe {
  String name() default "Unknown";
  int value();

  // types may be:
  // primitive
  // String
  // enums
  // Class
  // Annotation
  // Arrays of the above (NOT arrays of arrays)
}
