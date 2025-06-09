class ThrowDemo {
    void demoproc() {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException e) {
            System.out.println("Caught inside demoproc: " + e);
            throw e; // rethrow the exception
        }
    }

    public static void main(String[] args) {
        ThrowDemo td = new ThrowDemo(); // Assuming ThrowDemo is not static
        try {
            td.demoproc();
        } catch (NullPointerException e) {
            System.out.println("Recaught: " + e);
        }
    }
}