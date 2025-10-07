package design_principles.adapter;

import design_principles.adapter.adapterclasses.IciciBankAdapter;
import design_principles.adapter.adapterclasses.SbiBankAdapter;

public class Client {

    public static void main(String[] args) {
        IciciBankAdapter iciciAdapter = new IciciBankAdapter();
        iciciAdapter.transferAmount("Mukesh", "raj", 10000);
        SbiBankAdapter sbiBankAdapter = new SbiBankAdapter();
        sbiBankAdapter.transferAmount("raj", "Mike", 567);
    }
    
}
