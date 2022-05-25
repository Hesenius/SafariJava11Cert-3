package annotations;

//@RunMe
public class UnitUnderTest {
//  @RunMe
  String name;

  @RunMe(name="Albert", value=10)
  public void itShouldSayHello() {
    System.out.println("Hello");
  }

  @RunMe(11)
  public void itShouldSayGoodbye() {
    System.out.println("Goodbye");
  }

  public void notATest() {
    System.out.println("Shouldn't see this!");
  }

  @Override
  public String toString() {
    return "I'm a UnitUnderTest!!!";
  }
}
