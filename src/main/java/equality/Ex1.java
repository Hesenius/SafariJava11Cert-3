package equality;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Ex1 {
  public static void main(String[] args) {

    String s1 = new String("Hello");
    String s2 = new String("Hello");
    System.out.println("Strings == ? " + (s1 == s2));
//  /*A) */String s = "Hello";
//  String t = "He";
//  t += "llo";
//    System.out.println(s == t);

//  /*B)*/ String s = "Hello";
//  String t = "He";
//  t += "llo";
//  System.out.println(s.equals(t));

//  /*C)*/ StringBuilder s = new StringBuilder("Hello");
//  StringBuilder t = new StringBuilder("He");
//      t.append("llo");
//    System.out.println(s.equals(t));

//  /*D)*/ List<String> ls = List.of("Fred", "Jim");
//  List<String> ls2 = new ArrayList<>(ls);
//    System.out.println(ls.equals(ls2));

//  /*E)*/ LocalDate ld = LocalDate.of(2021, 3, 29);
//  LocalDate ld2 = LocalDate.of(2021, 3, 29);
//    System.out.println(ld.equals(ld2));
//    System.out.println(ld == ld2);


  }
}
