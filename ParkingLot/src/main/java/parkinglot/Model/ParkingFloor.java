package parkinglot.model;

import java.util.List;

public class ParkingFloor {

    private int floorNumber;
    private List<ParkingSpot> parkingSpots;
    private Status floorStatus;
    
    public int getFloorNumber() {
        return floorNumber;
    }
    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }
    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }
    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
    public Status getFloorStatus() {
        return floorStatus;
    }
    public void setFloorStatus(Status floorStatus) {
        this.floorStatus = floorStatus;
    }
    

}
