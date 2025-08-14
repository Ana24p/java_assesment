package cls_p;

public class cls_q83 {
    static int x = 20;

    public static void main(String[] args) {
        cls_q83 t = new cls_q83();
        cls_q83 s = new cls_q83();
        cls_q83 y = new cls_q83();

        s.x = t.x + 5;   // s.x = 25
        t.x = s.x + 5;   // t.x = 30
        y.x = s.x + t.x; // y.x = 25 + 30 = 55

        System.out.println(t.x);
    }
}
