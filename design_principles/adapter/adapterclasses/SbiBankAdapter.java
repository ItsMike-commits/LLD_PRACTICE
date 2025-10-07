package design_principles.adapter.adapterclasses;

import design_principles.adapter.IBankApi;
import design_principles.adapter.thirdpartyapis.SbiBank;

public class SbiBankAdapter implements IBankApi {
    SbiBank sbiBank = new SbiBank();

    @Override
    public void transferAmount(String destination, String source , int x)
    {
        sbiBank.transferAmount(source, destination, x);
    }

    @Override
    public void checkBalance(String a, String b)
    {
       sbiBank.CheckBalance(a);
    }
}
