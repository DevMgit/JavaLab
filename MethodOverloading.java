class MethodOverloading {

    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("One parameter: " + a);
    }

    void test(int a, int b) {
        System.out.println("Two parameters: " + a + ", " + b);
    }

    double test(double a) {
        System.out.println("One double parameter: " + a);
        return a * a;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        obj.test();
        obj.test(10);
        obj.test(10, 20);
        double result = obj.test(5.5);
        System.out.println("Result of double test: " + result);
    }
}
