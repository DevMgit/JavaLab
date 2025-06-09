class Q { // 
    int n; // 
    boolean turn = false; // Changed turn to boolean for clarity as flag 

    synchronized int get() { // 
        while (!turn) { //  // Changed turn == 1 to !turn
            try { // 
                wait(); // 
            } catch (InterruptedException e) { // 
                System.out.println("Interrupted exception Caught"); // 
            } // 
        } // 
        System.out.println("Got: " + n); // 
        turn = false; //  // Changed turn = 1 to turn = false
        notify(); // 
        return n; // 
    } // 

    synchronized void put(int n) { // 
        while (turn) { //  // Changed turn == 0 to turn
            try { // 
                wait(); // 
            } catch (InterruptedException e) { // 
                System.out.println("Interrupted Exception"); // 
            } // 
        } // 
        this.n = n; // 
        turn = true; //  // Changed turn = 0 to turn = true
        System.out.println("Put: " + n); // 
        notify(); // 
    } // 
} // 

// From page 12, assuming standard Producer/Consumer setup
class Producer implements Runnable {
    Q q;
    Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }
    public void run() {
        int i = 0;
        while(true) {
            q.put(i++);
            try {
                Thread.sleep(500); // Adding a small delay for better observation
            } catch (InterruptedException e) {
                System.out.println("Producer Interrupted");
            }
        }
    }
}

class Consumer implements Runnable {
    Q q;
    Consumer(Q q) {
        this.q = q;
        new Thread(this, "Consumer").start();
    }
    public void run() {
        while(true) {
            q.get();
            try {
                Thread.sleep(500); // Adding a small delay for better observation
            } catch (InterruptedException e) {
                System.out.println("Consumer Interrupted");
            }
        }
    }
}

class PCFixed { // Assuming this is the main class based on page 12
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
        System.out.println("Press Control-C to stop."); // 
    }
}