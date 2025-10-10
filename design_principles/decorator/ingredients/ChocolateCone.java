package design_principles.decorator.ingredients;
import design_principles.decorator.IceCream;

public class ChocolateCone implements IceCream{

    private final IceCream ic;

    public ChocolateCone(IceCream ic)
    {
        this.ic = ic;
    }
    
    @Override
    public int getPrice()
    {
        System.out.println("Inside ChocolateCone class");
        
        if(ic == null) return 100;
        else
        return ic.getPrice() + 100;
    }

    @Override
    public String getDescription()
    {
        System.out.println("Inside ChocolateCone class");
        if(ic == null)
        return " ChocolateCone ";
        else
        return ic.getDescription() + " ChocolateCone ";
    }
    
}
