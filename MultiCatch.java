class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = Integer.parseInt(args[0]);
            int b = 10 / a;
            int[] arr = new int[5];
            arr[a] = 10;
            System.out.println("Result: " + b);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught in multi-catch: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
        System.out.println("Program execution continues...");
    }
}
