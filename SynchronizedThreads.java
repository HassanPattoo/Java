class Counter {
    private int count = 0;

    // Synchronized method to increment the counter
    public synchronized void increment() {
        count++;
        System.out.println(Thread.currentThread().getName() + " incremented count to: " + count);
    }

    // Method to get the current counter value
    public int getCount() {
        return count;
    }
}

class Worker implements Runnable {
    private Counter counter;

    public Worker(Counter counter) {
        this.counter = counter;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) { // Each thread will increment 5 times
            counter.increment();
            try {
                Thread.sleep(100); // Sleep to simulate some work and allow context switching
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class SynchronizedThreads {
    public static void main(String[] args) {
        Counter counter = new Counter();

        // Creating three threads that share the same Counter object
        Thread thread1 = new Thread(new Worker(counter), "Thread-1");
        Thread thread2 = new Thread(new Worker(counter), "Thread-2");
        Thread thread3 = new Thread(new Worker(counter), "Thread-3");

        // Start the threads
        thread1.start();
        thread2.start();
        thread3.start();

        // Wait for all threads to finish
        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Print the final counter value
        System.out.println("Final counter value: " + counter.getCount());
    }
}

