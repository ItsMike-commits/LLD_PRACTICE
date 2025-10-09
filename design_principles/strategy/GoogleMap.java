package design_principles.strategy;

import javax.lang.model.util.ElementScanner14;

import design_principles.strategy.mode_of_transport.Bike;
import design_principles.strategy.mode_of_transport.Car;
import design_principles.strategy.mode_of_transport.Train;



public class GoogleMap {
    public void findPathCalculator(String src, String dest, String mode)
    {
        /* 
                                          Normal Zindagi
        if(mode == "Car")
           System.err.println("Travelling from " + src + " to " + dest + " through " + mode);
        else if(mode == "Bike")
            System.err.println("Travelling from " + src + " to " + dest + " through " + mode);
        else 
            System.err.println("Travelling from " + src + " to " + dest + " through " + mode);

                                          PROBLEMS
            1. Violates OCP, SRP because of presence of lot of if-else condition.
            2. Code not clean neither maintainable.
         */  

        // Problem is still there because of lot of if-else condition
        // Google map class is directly coupled to mode_of_trnsport objects, which violates the SOLID principle

        /* 
         if(mode == "Car")
         {
            Car car = new Car();
            car.findPath(src, dest);
         }
         else if(mode == "Bike")
         {
            Bike bike = new Bike();
            bike.findPath(src, dest);
         }
          if(mode == "Train")
         {
            Train train = new Train();
            train.findPath(src, dest);
         }
         */
        PathCalculator pc ;
        pc = TransportHelper.findMode(mode);
        pc.findPath(src,dest);
    
    
     }
    
}
