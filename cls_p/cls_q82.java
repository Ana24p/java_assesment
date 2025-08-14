package cls_p;

public class cls_q82 {
    static int x = 20;

    public static void main(String[] args) {
        cls_q82 t = new cls_q82();
        cls_q82 s = new cls_q82();
        cls_q82 y = new cls_q82();

        s.x = t.x + 5;
        t.x = s.x + 5;

        System.out.println(s.x);
    }
}
