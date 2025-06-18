public class MultithreadingExample {
    public static void main(String[] args) {
        // Thread 1: prints numbers 1 to 5 with some delay
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Thread 1: " + i);
                try {
                    Thread.sleep(500); // Sleep 500ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Thread 2: prints letters A to E with some delay
        Thread thread2 = new Thread(() -> {
            for (char c = 'A'; c <= 'E'; c++) {
                System.out.println("Thread 2: " + c);
                try {
                    Thread.sleep(700); // Sleep 700ms
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        // Start both threads
        thread1.start();
        thread2.start();

        // Main thread message
        System.out.println("Main thread started both threads.");
    }
}
