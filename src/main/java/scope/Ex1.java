package scope;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.function.Predicate;

public class Ex1 {
//  static ResultSet dbLookup() throws SQLException {
//    return null;
//  }
//  ResultSet y;
//  {
//    {
//      try {
//        y = dbLookup();
//      } catch (SQLException ex) {
//      }
//    }
//  }
//  int x = 99;

//    { int x; } // instance intializer blocks!
//    { int x; }

//  class X {
//    {
////      System.out.println(this.x); // OK!?!?
//      System.out.println(x); // NOT OK???
//    }
//    int x; // definitely initialized to zero at memory allocation
//  }

//  {
//    int x;
//    {int x;}
//  }

//  void doStuff() {
//    int x;
//    class Y { int x; }
//  }

//  class XXX{
//    int x;
//    { int x = 1;
//      System.out.println(this.x); }
//  }
//
  {
    int x;
    Predicate<String> ps = x -> true;
  }
//
//  for (int x = 0; x < 10; x++)
//  ;
//  int x;

}
