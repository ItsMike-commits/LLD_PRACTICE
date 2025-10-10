package design_principles.decorator.ingredients;

import design_principles.decorator.IceCream;




public class OrangeCone implements IceCream {

    private IceCream ic;

    public OrangeCone()
    {

    }
    public OrangeCone(IceCream ic)
    {
        this.ic = ic;
    }

    @Override
    public int getPrice()
    {
        System.out.println("Inside OrangeCone class");
        if(ic == null) return 20;
        else
        return ic.getPrice() + 20;
    }

    @Override
    public String getDescription()
    {
        if(ic == null)
        return " Orange Cone ";
        else 
        return ic.getDescription() + " Orange Cone";
    }
    
}
