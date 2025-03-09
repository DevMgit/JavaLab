class A {
    int i, j;

    A(int a, int b) {
        i = a;
        j = b;
    }

    void showij() {
        System.out.println("i and j: " + i + " " + j);
    }
}

class B extends A {
    int k;

    B(int a, int b, int c) {
        super(a, b);
        k = c;
    }

    void show1() {
        System.out.println("i,j and k are: " + i + ", " + j + " and " + k);
    }

}

class SuperCon {
    public static void main(String args[]) {
        B obj = new B(1, 2, 3);
        obj.showij();
        obj.show1();
    }

}