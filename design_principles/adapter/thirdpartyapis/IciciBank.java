package design_principles.adapter.thirdpartyapis;

public class IciciBank {

     public IciciBank()
     {

     }
    // Transferring amount x from source A to destination B.
    public void transferAmount( int x , String a , String b)
    {
      System.out.println("Transferred amount " + x + " from source " + a + " to destination "+ b + " through ICICI");
    }
    // Defining Check balance method;
    public void checkBalance( String accountNumber)
    {
      System.out.println("Checking balance from ICICIBank");
    }
    
}
