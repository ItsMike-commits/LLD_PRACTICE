package design_principles.strategy;
import design_principles.strategy.mode_of_transport.Bike;
import design_principles.strategy.mode_of_transport.Car;
import design_principles.strategy.mode_of_transport.Train;



public class TransportHelper {

    // Implement Factory-Design Pattern to remove multiple if-else from main code and send objects according to input.
       public static PathCalculator findMode(String mode) {
        if ("Car".equalsIgnoreCase(mode)) {
            return new Car();
        } else if ("Bike".equalsIgnoreCase(mode)) {
            return new Bike();
        } else if ("Train".equalsIgnoreCase(mode)) {
            return new Train();
        } else {
            throw new IllegalArgumentException("Unknown mode: " + mode);
        }
    }
}
