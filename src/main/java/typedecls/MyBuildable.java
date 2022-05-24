package typedecls;

public class MyBuildable {
  public static class MyBuilder {
    public ??? name(String n) {}
    public ??? address(String a) {}
    public MyBuildable build() {}
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
