package cls_p;

public class obj1 {
    int x = 20;

    public static void main(String[] args) {
        obj1 t = new obj1();    
        obj1 s = new obj1();    
        obj1 y = new obj1();

        t.x = t.x + 5;       // modifies t's x
        t.x = s.x + 5;       // now sets t.x based on s's x

        System.out.println(t.x);
    }
}
