package PRActical_q;

public class Q23 {
    int num;

    // Constructor
    public Q23(int number) {
        num = number;
    }

    public void display() {
        System.out.println("Value of num is: " + num);
    }

    public static void main(String[] args) {
        // Create object using constructor
        Q23 obj = new Q23(42);
        obj.display();
    }
}
