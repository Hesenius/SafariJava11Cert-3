package typedecls;

public class MyBuildable2 {
  private String name;
  private String address;

//  public static class MyBuilder2 {
  public class MyBuilder2 {
//    MyBuildable2 self;

//    private MyBuilder2(MyBuildable2 toBeBuilt) {
//    private MyBuilder2(MyBuildable2 MyBuildable2.this) {
    private MyBuilder2() {
//      self = toBeBuilt;
    }
    public MyBuilder2 name(String n) {
      /*self.*/name = n;
      return this;
    }
    public MyBuilder2 address(String a) {
      /*self.*/address = a;
      return this;
    }
    public MyBuildable2 build() {
      // validate!!!!
//      MyBuildable2 rv = self;
//      self = null;
      return MyBuildable2.this;
    }
  }

  public static MyBuilder2 builder() {
//    MyBuildable2 self = new MyBuildable2();
//    return new MyBuilder2(self);

//    return new MyBuildable2().new MyBuilder2();
    MyBuildable2 mb2 = new MyBuildable2();
    return mb2.new MyBuilder2();
  }
}

class UseMyBuildable2 {
  public static void main(String[] args) {
    MyBuildable2 mb = MyBuildable2.builder()
        .name("Fred")
        .address("Over here")
        .build();
  }
}
