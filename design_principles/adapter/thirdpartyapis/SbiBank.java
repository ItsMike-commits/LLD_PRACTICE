package design_principles.adapter.thirdpartyapis;

public class SbiBank {

    public SbiBank(){

    }
    // Transferring amount x from source A to destination B.
    public void transferAmount( String a , String b, int x)
    {
      System.out.println("Transferred amount " + x + " from source " + a + " to destination "+ b + " through SBI");
    }
    // Defining Check balance method;
    public void CheckBalance( String accountNumber)
    {
      System.out.println("Checking balance from SBIBank");
    }
    
}
