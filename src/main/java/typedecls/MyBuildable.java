package typedecls;

public class MyBuildable {
  private String name;
  private String address;

  public static class MyBuilder {
    MyBuildable self = new MyBuildable();
    public MyBuilder name(String n) {
      self.name = n;
      return this;
    }
    public MyBuilder address(String a) {
      self.address = a;
      return this;
    }
    public MyBuildable build() {
      // validate!!!!
      MyBuildable rv = self;
      self = null;
      return rv;
    }
  }

  public static MyBuilder builder() {
    return new MyBuilder();
  }
}

class UseMyBuildable {
  public static void main(String[] args) {
    MyBuildable mb = MyBuildable.builder()
        .name("Fred")
        .address("Over here")
        .build();
  }
}
