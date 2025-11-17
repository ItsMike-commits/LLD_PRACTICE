package threads.loop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Demonstrates evolution from single-threaded execution
 * to multi-threaded execution using Thread and ExecutorService.
 *
 * Learning Goals:
 * 1. Understand how threads are created and executed in Java.
 * 2. Measure performance difference between single and multi-threaded runs.
 * 3. Understand how thread pools work and how awaitTermination behaves.
 */
public class Client {

    public static void main(String[] args) {

        // ------------------------------------------------------------------------------------
        // STEP 1: Sequential Execution on Main Thread
        // ------------------------------------------------------------------------------------
        /*
        for (int i = 1; i <= 5; i++) {
            System.out.println("i: " + i + " | Thread: " + Thread.currentThread().getName());
        }
        */

        // Output:
        // i: 1 | Thread: main
        // i: 2 | Thread: main
        // i: 3 | Thread: main
        // ...
        // Everything runs sequentially on the main thread.


        // ------------------------------------------------------------------------------------
        // STEP 2: Running Runnable directly (still single-threaded)
        // ------------------------------------------------------------------------------------
        /*
        PrintHandler p = new PrintHandler();
        p.run();  // Runs in main thread, not a new thread
        */

        // Output:
        // j: 1 | Thread: main
        // j: 2 | Thread: main
        // ...
        // ✅ Even though PrintHandler implements Runnable, calling run() directly
        // doesn’t spawn a new thread. It’s just a normal method call.


        // ------------------------------------------------------------------------------------
        // STEP 3: Run Runnable inside a Thread (multi-threaded)
        // ------------------------------------------------------------------------------------
        /*
        Thread t = new Thread(new PrintHandler(5));
        t.start();
        */

        // Output:
        // j: 1 | Thread: Thread-0
        // j: 2 | Thread: Thread-0
        // ...
        // ✅ Now a new thread executes the code concurrently with main.


        // ------------------------------------------------------------------------------------
        // TASK 1: Print 1–50 using one thread and measure time
        // ------------------------------------------------------------------------------------
        /*
        long start = System.currentTimeMillis();

        Thread t = new Thread(new PrintHandler(50));
        t.start();

        try {
            t.join(); // Wait until thread finishes
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken (single thread): " + (end - start) + " ms");
        */

        // Observations:
        // ✅ Output is sequential.
        // ✅ Time ~1ms because it’s very lightweight printing.


        // ------------------------------------------------------------------------------------
        // TASK 2: Print 1–50 using multiple threads via ExecutorService
        // ------------------------------------------------------------------------------------

        ExecutorService executor = Executors.newFixedThreadPool(10);
        long start = System.currentTimeMillis();

        for (int i = 1; i <= 50; i++) {
            executor.execute(new PrintHandler(i)); // Each task prints one number
        }

        executor.shutdown();

        try {
            boolean finished = executor.awaitTermination(1, TimeUnit.SECONDS);
            if (!finished) {
                System.err.println("Timeout exceeded — not all tasks finished.");
                // executor.shutdownNow(); // Uncomment to forcefully terminate
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long end = System.currentTimeMillis();
        System.out.println("Time taken (multi-threaded): " + (end - start) + " ms");

        // ------------------------------------------------------------------------------------
        // BEHAVIOR SUMMARY:
        //
        // Time (ms) | Event
        // ----------|---------------------------------------------------------
        // 0         | 10 threads start, each running PrintHandler tasks
        // ~1000     | awaitTermination(1s) timeout reached if tasks still running
        // ~1000–1100| Threads complete their prints concurrently
        // 1100+     | Main thread resumes, prints timing result
        //
        // ✅ Key Takeaways:
        // - awaitTermination() controls only how long the main thread waits.
        // - Worker threads continue execution until done (unless shutdownNow()).
        // - Thread pool reuses threads, reducing overhead.
        //
        // ------------------------------------------------------------------------------------
    }
}

