package threads.loop;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Client {
    
    public static void main(String args[])
    {
      
        /*
       
       // Running all on 1 single main thread.
        for(int i = 1; i<5; i++)
        {
            System.out.println("i: " + i + " Thread: " + Thread.currentThread().getName());
              
               //i: 1 Thread: main
               //i: 2 Thread: main
               //i: 3 Thread: main
               //i: 4 Thread:  x
        }
        
        */
     
        
     
      // Create an object and simply run it.
      //  PrintHandler p = new PrintHandler();
      //  p.run();
        
        // j : 1 Thread: main
        // j : 2 Thread: main
        // j : 3 Thread: main
        
      // Created a new thread and executed the object's method on it.
      // PrintHandler p = new PrintHandler(5);
      // Thread t = new Thread(p);
       //t.start();
      // j : 1 Thread: Thread-0
       //j : 2 Thread: Thread-0
       //j : 3 Thread: Thread-0

        
      // TASK-1 : Print 1-50 using one single thread and calculate its processing time.
       //long start = System.currentTimeMillis();
      
      
        //Thread t = new Thread(p);
        //t.start();
      
      //long end = System.currentTimeMillis();
      //System.out.println("Time taken " + (end-start) + "ms");
      
      // Printed 1-50 using just 1 thread and it took 1 ms.


      //Task-2 : Print 1-50 using 5 different threads and calculate its processing time.
      ExecutorService executorService = Executors.newFixedThreadPool(10);

      long start = System.currentTimeMillis();
      for(int i = 1; i<=50; i++)
      {
        executorService.execute(new PrintHandler(i));
      }
      executorService.shutdown();

      
      try{
       Boolean isFinished =   executorService.awaitTermination(1, TimeUnit.SECONDS);
       if(!isFinished)
      System.err.println("Timeout exceeded");
      executorService.shutdownNow();
      } 
      catch(Exception e){
        e.printStackTrace();

      }
      
      long end = System.currentTimeMillis();
      System.out.println("Time taken " + (end-start) + "ms");

        
    }
}
