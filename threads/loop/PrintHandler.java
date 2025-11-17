package threads.loop;

public class PrintHandler implements Runnable {

    private final int i;

    public PrintHandler(int i) {
      this.i = i;
    }

    @Override
    public void run()
    {
       //for(int i = 1; i<=50; i++){
       //System.out.println("i : " + i + " Thread: " + Thread.currentThread().getName());
       //}   
       try {
        Thread.sleep(1000);
       System.out.println("i : " + i + " Thread: " + Thread.currentThread().getName());
           
       }
        catch (Exception e) {
        e.printStackTrace();
       }
       
    }
 
}
