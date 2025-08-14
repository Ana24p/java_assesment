package cls_p;

class YZ {
    int x = 20;
}

public class cls_q91 {
    public static void main(String[] args) {
        YZ t = new YZ();    
        YZ s = new YZ();    
        YZ y = new YZ();
        
        s.x = t.x + 5;
        System.out.println(t.x); // prints 20
    }
}

