import java.util.Random;

class Square extends Thread {
    int x;

    Square(int n) {
        x = n;
    }

    public void run() {
        int sqr = x * x;
        System.out.println("Square of " + x + " = " + sqr);
    }
}

class Cube extends Thread {
    int x;

    Cube(int n) {
        x = n;
    }

    public void run() {
        int cub = x * x * x;
        System.out.println("Cube of " + x + " = " + cub);
    }
}

class Number extends Thread {
    public void run() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) { // Loop for 10 random integers
            int randomInteger = random.nextInt(100); // Generates a random integer between 0 and 99
            System.out.println("Random Integer generated: " + randomInteger);
            if (randomInteger % 2 == 0) {
                Square s = new Square(randomInteger);
                s.start();
            } else {
                Cube c = new Cube(randomInteger);
                c.start();
            }
            try {
                Thread.sleep(1000); // Sleep for 1 second
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class MultipleThreads {
    public static void main(String[] args) {
        Number n = new Number();
        n.start();
    }
}