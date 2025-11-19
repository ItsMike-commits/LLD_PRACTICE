package parkinglot.Model;

public class ParkingSpot {

    private int spotNumber;
    private ParkingSpotStatus parkingSpotStatus;
    private ParkingSpotType parkingSpotType;

    
    public int getSpotNumber() {
        return spotNumber;
    }
    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }
    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }
    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }
    public ParkingSpotType getParkingSpotType() {
        return parkingSpotType;
    }
    public void setParkingSpotType(ParkingSpotType parkingSpotType) {
        this.parkingSpotType = parkingSpotType;
    }


}
