class FinallyDemo {
    public static void main(String[] args) {
        try {
            int a = 10 / 0; // This will cause an ArithmeticException
            System.out.println(a);
        } catch (ArithmeticException e) {
            System.out.println(e);
        } finally {
            System.out.println("will get executed");
        }
    }
}