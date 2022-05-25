package serviceclient;

import java.lang.reflect.Field;

public class HackAgain {
  public static String getTheMessage() {
    try {
      Class<?> theClass = Class.forName("serviceimpl.MyProvider");
      Field msg = theClass.getDeclaredField("message");
      msg.setAccessible(true);
      String theMessage = (String)msg.get(null);
      return theMessage;
    } catch (Throwable t) {
      throw new RuntimeException(t);
    }
  }
}
