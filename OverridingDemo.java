class A {
    void show() {
        System.out.println("A's show");
    }
}

class B extends A {
    void show() {
        System.out.println("B's show");
    }
}

class OverridingDemo {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        a.show();
        b.show();
    }
}
