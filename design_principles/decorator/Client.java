package design_principles.decorator;


import design_principles.decorator.ingredients.OrangeCone;
import design_principles.decorator.ingredients.ChocolateCone;
import design_principles.decorator.ingredients.Cherry;

public class Client {

    public static void main(String[] args) {
        //IceCream ic = new OrangeCone();
        //ic = new ChocolateCone(ic);
        //ic = new Cherry(ic);

        //Chaining method
        IceCream ic = new Cherry(new ChocolateCone(new OrangeCone()));

        System.out.println(ic.getDescription());
        //System.out.println("price is " + ic.getPrice());
    }
    
    
}
