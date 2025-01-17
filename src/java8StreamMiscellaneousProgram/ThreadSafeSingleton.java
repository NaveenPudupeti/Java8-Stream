package java8StreamMiscellaneousProgram;

public class ThreadSafeSingleton {

    // Volatile instance to ensure visibility of changes to threads
    private static volatile ThreadSafeSingleton instance;

    // Private constructor to prevent instantiation
    private ThreadSafeSingleton() {
        System.out.println("Singleton instance created");
    }

    // Method to return the singleton instance with double-checked locking
    public static ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    // Example method to demonstrate singleton usage
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }

    public static void main(String[] args) {
        // Java 8 Lambda for creating multiple threads to test thread-safety
        Runnable task = () -> {
            ThreadSafeSingleton singleton = ThreadSafeSingleton.getInstance();
            singleton.showMessage();
        };

        // Create multiple threads to access singleton
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);
        Thread thread3 = new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
