package cls_p;

public class cls_q19 {
    // no argument constructor
    public cls_q19() {
        System.out.println("I am in constructor");
    }

    // parameterized constructor
    public cls_q19(int a) {
        System.out.println("Value of a " + a);
    }

    public static void main(String[] args) {
        cls_q19 x = new cls_q19();      // calls no-arg constructor
        cls_q19 a = new cls_q19(56);    // calls parameterized constructor
    }
}
