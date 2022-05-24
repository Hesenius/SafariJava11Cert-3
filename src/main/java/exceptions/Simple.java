package exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

public class Simple {
  //  void doStuff() throws FileNotFoundException {
//  void doStuff() throws IOException {
//  void doStuff() throws Exception {
  void doStuff() {
    try {
      FileInputStream fis = new FileInputStream("Hello.txt");
      if (Math.random() > 0.5) throw new SQLException();
    } catch (/*FileNotFound*/RuntimeException fnfe) {
      // multi-catch must not catch parent/child related
      // exceptions
    } catch (/*IOException | */FileNotFoundException | SQLException e) {
      // doStuff
//    } catch (FileNotFoundException fnfe) {
//      // doStuff
//    } catch (SQLException fnfe) {
//      // doStuff
    } catch (IOException fnfe) {
      // would fail here, as IOException catches all of FNFE
//    } catch (FileNotFoundException fnfe) {
    } finally {
    }

  }
}
