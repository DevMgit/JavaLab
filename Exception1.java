class Exception1 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = a / 0;
            System.out.println(b);
            System.out.println("Exception handled");
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception handled." + e);
        }
        System.out.println("try/catch ended.");
    }
}
