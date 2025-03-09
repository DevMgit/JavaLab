class MultiCatch {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = a / 0;
            System.out.println(b);
            System.out.println("Exception handled");
        } catch (ArithmeticException | NullPointerException e) {
            System.out.println("Arithmetic Exception handled." + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array Index Out Of Bounds Exception handled." + e);
        }
        System.out.println("try/catch ended.");
    }
}
