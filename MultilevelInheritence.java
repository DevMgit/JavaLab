class A {
    int a;

    void showA() {
        System.out.println("a = " + a);
    }
}

class B extends A {
    int b;

    void showB() {
        System.out.println("b = " + b);
    }
}

class C extends B {
    int c;

    void showC() {
        System.out.println("c = " + c);
    }
}

class MultilevelInheritence {
    public static void main(String args[]) {
        A objA = new A();
        objA.a = 10;
        objA.showA();
        B objB = new B();
        objB.a = 20;
        objB.b = 30;
        objB.showA();
        objB.showB();
        C objC = new C();
        objC.a = 40;
        objC.b = 50;
        objC.c = 60;
        objC.showA();
        objC.showB();
        objC.showC();
    }
}
