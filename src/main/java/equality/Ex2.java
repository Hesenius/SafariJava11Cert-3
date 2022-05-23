package equality;

//class X {
//  static String h = "Hello";
//}

public class Ex2 {
  public static void main(String[] args) {

//  Which are true?
    String s1 = "Hello";
    String sxxx = "Hello"; // shares the object of s1
    String s2 = new StringBuilder("Hello").toString();
    String s3 = s2.intern();

    String s4 = new String("Hello");
    System.out.println(s3 == s4);
    s3 = s3.intern();
    System.out.println(s3 == s4);
    s4 = s4.intern();
    System.out.println(s3 == s4);

//    System.out.println(s1 == sxxx);
////  A)
//    System.out.println(s1 == s2);
////  B)
//    System.out.println(s2 == s3);
////  C)
//    System.out.println(s1 == s3);
////  D)
//    System.out.println(X.h == s1);
////  E) none of these
  }
}
