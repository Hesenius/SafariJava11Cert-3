package exceptions;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TWR {
  void doStuff() /* throws unhandled exception */
  throws IOException {
//    try {
//      FileReader fr = new FileReader("");
//      FileWriter fw = new FileWriter("");
//      // throw unhandled excpetion
//    } catch (IOException ioe) {
//
//    } finally {
//      fr.close();
//    }
    // "resources" must implement AutoCloseable
    // closed in reverse order of opening
    // must be final, or effectively final
    // but can be a final, or effectively final
    // local reference
    FileReader fr2 = new FileReader("");
    try (fr2;
        FileReader fr = new FileReader("");
         FileWriter fw = new FileWriter("");) {
      // throw unhandled exception
//      fr = null;
    } catch (IOException ioe) {

    } // auto-generated finally closes everything
    // without losing any "unhandled exception"
  }
}
