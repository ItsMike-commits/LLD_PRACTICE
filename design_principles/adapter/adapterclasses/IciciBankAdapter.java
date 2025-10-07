package design_principles.adapter.adapterclasses;

import design_principles.adapter.IBankApi;
import design_principles.adapter.thirdpartyapis.IciciBank;

public class IciciBankAdapter implements IBankApi {

    IciciBank iciciBank = new IciciBank();
    @Override
    public void transferAmount(String destination, String source , int x)
    {
        iciciBank.transferAmount(x, source, destination);
    }
    @Override
    public void checkBalance(String a, String b) {
        iciciBank.checkBalance(a);
    }

}
