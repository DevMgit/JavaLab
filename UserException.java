class MyException extends Exception {
    public MyException(String str) {
        super(str);
    }
}

class Test {
    public void ratio(int a, int b) {
        try {
            if (a == b) {
                throw new MyException("a and b should not be equal");
            }
            int result = a / (a - b);
            System.out.println("Result: " + result); // Added this line for completeness
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            System.out.println(e);
        }
    }
}

public class UserException {
    public static void main(String[] args) {
        Test t = new Test();
        t.ratio(4, 4); // This will throw MyException
        t.ratio(10, 5); // Example of a valid call
    }
}