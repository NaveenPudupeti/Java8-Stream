package java8StreamMiscellaneousProgram;

import java.util.LinkedList;
import java.util.Queue;

public class ProducerConsumer {

    private static final int BUFFER_CAPACITY = 5;
    private final Queue<Integer> buffer = new LinkedList<>();

    // Producer class
    class Producer implements Runnable {
        @Override
        public void run() {
            int value = 0;
            while (true) {
                synchronized (buffer) {
                    while (buffer.size() == BUFFER_CAPACITY) {
                        try {
                            System.out.println("Buffer full. Producer waiting...");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }

                    buffer.add(value);
                    System.out.println("Produced: " + value);
                    value++;

                    // Notify the consumer that buffer is no longer empty
                    buffer.notifyAll();
                }

                // Simulate production time
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    // Consumer class
    class Consumer implements Runnable {
        @Override
        public void run() {
            while (true) {
                synchronized (buffer) {
                    while (buffer.isEmpty()) {
                        try {
                            System.out.println("Buffer empty. Consumer waiting...");
                            buffer.wait();
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                            break;
                        }
                    }

                    int value = buffer.poll();
                    System.out.println("Consumed: " + value);

                    // Notify the producer that buffer is no longer full
                    buffer.notifyAll();
                }

                // Simulate consumption time
                try {
                    Thread.sleep(700);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();

        // Create and start producer and consumer threads
        Thread producerThread = new Thread(pc.new Producer());
        Thread consumerThread = new Thread(pc.new Consumer());

        producerThread.start();
        consumerThread.start();
    }
}
