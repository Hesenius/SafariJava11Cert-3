package serviceclient;

//import serviceimpl.HackIt;
import serviceimpl.MyProvider;

public class UseTheService {
  public static void main(String[] args) {
    // before modules "public" means
    // "accessible anywhere in the running JVM"
//    System.out.println(MyProvider.message);
//    System.out.println(HackIt.getTheMessage());
    System.out.println(HackAgain.getTheMessage());
  }
}
