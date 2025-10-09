package design_principles.strategy;

import design_principles.strategy.GoogleMap;

public class Client {
    public static void main(String[] args) {
        GoogleMap googleMap = new GoogleMap();
              googleMap.findPathCalculator("Patna", "Delhi" , "Car");
              googleMap.findPathCalculator("Purnea", "Bengal" , "Bike");
              googleMap.findPathCalculator("Kashmir", "Kanyakumari" , "Train");
    }
    
}
