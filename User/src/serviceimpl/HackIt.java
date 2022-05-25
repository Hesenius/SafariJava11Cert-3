// "split package", provides a way to "hack"
// the default (and also protected) access.

// module system insists that the first module to declare
// anything in a package *owns* that package.
// other modules might be able to use the stuff in that package
// but they will fail to load if they attempt to define
// anything as belonging to that package
//package serviceimpl;
//
//import serviceclient.UseTheService;
//
//public class HackIt {
////  public static String getTheMessage() {
////    return MyProvider.message;
////  }
//}
