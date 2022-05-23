package usingvar;

public class Ex2 {
  // var works with arrays of EXPLICIT TYPE!
//  void doStuff() { var x = new int[]{ 1, 2, 3 }; }
  // when using var, it must take place of the "entire" type
//  void doStuff() { var [] x = new int[]{ 1, 2, 3 }; }
//  void doStuff() {
//    var x = 99; // this is unambigously *int* type
//    x = "Hello"; // NOPE, Java is still stronly, statically, typed
//  }
//  void doStuff() {
//    int x = 1, y[] = {2}; // valid??
////    var x = 1, y = 2; // NOPE, only declare a SINGLE variable
//  }
//  void doStuff() {
//    try {
//      // stuff happens
//    } catch (var ex) { // NOPE, what type should it be?
//    }
//  }
}
