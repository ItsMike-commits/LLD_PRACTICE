package design_principles.strategy.mode_of_transport;

import design_principles.strategy.PathCalculator;

public class Bike implements PathCalculator {

    public void findPath(String src , String dest)
    {
        System.err.println("Travelling from " + src + " to " + dest + " through  bike");
    }

    
}
