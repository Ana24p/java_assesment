package cls_p;

public class cls_q18 {
    public cls_q18() {
        System.out.println("I am in constructor");
    }

    // parameterized constructor
    public cls_q18(int a) {
        System.out.println("Value of a " + a);
    }

    public static void main(String[] args) {
        cls_q18 x = new cls_q18();     // calls no-arg constructor
        cls_q18 y = new cls_q18(42);   // example of calling parameterized constructor
    }
}
