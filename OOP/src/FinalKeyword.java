class SocialMedia {
    String name;

    // final method
    final void printName() {
        System.out.println(name);
    }
}
// final class
final class Facebook extends SocialMedia {
    public void show() {
        System.out.println("Facebook: " + name);
    }

    // void printName() { // error
       // System.out.println("Facebook: " + name);
   // }
}

// class FakeFacebook extends Facebook { // error
//    public void show() {
//        System.out.println("FakeFacebook: " + name);
//    }
//}

public class FinalKeyword {
    public static void main(String[] args) {
        Facebook facebook = new Facebook();
        facebook.name = "Facebook";

        facebook.show();
        facebook.printName();
    }
}
