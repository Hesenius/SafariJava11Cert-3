package exceptions;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class Ex2 {
  void doStuff() throws SQLException {};
  void doStuff2() throws FileNotFoundException {};
  void tryStuff() throws SQLException, FileNotFoundException {
    try {
      doStuff();
      doStuff2();
//    } catch (SQLException | FileNotFoundException e) {
    } catch (Exception e) {
//      Exception f = e;
//      throw f;
//      e = new SQLException();
      throw e;
    }
  }
}
