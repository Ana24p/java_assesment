package cls_p;

public class cls_q70 {
    int x = 20;

    public static void main(String[] args) {
        cls_q70 t = new cls_q70();    
        cls_q70 s = new cls_q70();    
        cls_q70 y = new cls_q70();

        t.x = t.x + 5;       // modifies t's x
        t.x = s.x + 5;       // now sets t.x based on s's x

        System.out.println(t.x);
    }
}