class T27 {
    public static void main(String[] args) {
        Mix m = new Mix(18, 30);
        m.f_plus();
        m.f_sub();
    }
}

class Sub {
    protected int a, b;

    public void f_sub() {
        System.out.println("Show class F_sub: " + (a - b));
    }
}

class Mix extends Sub {
    Mix(int x, int y) {
        a = x;
        b = y;
    }

    public void f_plus() {
        System.out.println("Show F_plus: " + (a + b));
    }
}
