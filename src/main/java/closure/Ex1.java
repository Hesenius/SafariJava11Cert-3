package closure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ex1 {
  public static Predicate<String> getOne(int x) {
    int [] value = { x };
    return new Predicate<String>() {
      @Override public boolean test(String s) {
//        return s.length() >= /*++*/x;
        return s.length() >= ++value[0];
      }};}

  public static void main(String[] args) {
    List<String> l = new ArrayList(List.of("Fred", "Jim", "Sheila"));
    System.out.println(
//        List.of("Fred", "Jim", "Sheila")
//        new ArrayList(List.of("Fred", "Jim", "Sheila"))
            l.removeIf(getOne(4)));
    System.out.println(l);
  }
}
