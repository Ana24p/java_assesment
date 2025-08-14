package cls_p;

public class cls_q71 {
    int x = 20;

    public static void main(String[] args) {
        cls_q71 t = new cls_q71();    
        cls_q71 s = new cls_q71();    
        cls_q71 y = new cls_q71();    

        s.x = t.x + 5; // modifies s's x based on t's x
        System.out.println(s.x);
    }
}
