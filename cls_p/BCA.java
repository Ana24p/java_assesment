package cls_p;

class BCA {
    public void count() {
        System.out.println("Count in BCA");
    }

    public static void main(String[] args) {
        BCA c1 = new BCA();
        TYBCA c11 = new TYBCA();
        SYBCA c12 = new SYBCA();
        FYBCA c13 = new FYBCA();

        c1.count();
        c11.count();
        c12.count();
        c13.count();
    }
}

class TYBCA {
    public void count() {
        System.out.println("Count in TYBCA");
    }
}

class SYBCA {
    public void count() {
        System.out.println("Count in SYBCA");
    }
}

class FYBCA {
    public void count() {
        System.out.println("Count in FYBCA");
    }
}
