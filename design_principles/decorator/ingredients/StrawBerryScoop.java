package design_principles.decorator.ingredients;

import design_principles.decorator.IceCream;

public class StrawBerryScoop implements IceCream {

    @Override
    public int getPrice()
    {
        return 15;
    }

    @Override
    public String getDescription()
    {
        return " StrawBerryScoop ";
    }
    
}
