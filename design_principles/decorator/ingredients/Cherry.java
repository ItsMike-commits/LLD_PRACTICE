package design_principles.decorator.ingredients;

import design_principles.decorator.IceCream;

public class Cherry implements IceCream {
    private final IceCream ic;

    public Cherry(IceCream ic)
    {
        this.ic = ic;
    }
    
    @Override
    public int getPrice()
    {
        System.out.println("Inside Cherry class");
        if(ic == null)
        return 10;
        else
        return ic.getPrice()+10;
    }

    @Override
    public String getDescription()
    {
        if(ic == null)
        return " Cherry ";
        else
        return ic.getDescription() + "Cherry";
    }
}
