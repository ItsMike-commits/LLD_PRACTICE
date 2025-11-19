package parkinglot.Model;

import java.util.List;

public class ParkingLot extends BaseModel{

    private int parkingLotNumber;
    private String parkingLotName;
    private List<ParkingFloor> parkingfloors;
    private List<Gate> gates;
    private List<Operator> operators;
    private Status parkingLotStatus;


    public int getParkingLotNumber() {
        return parkingLotNumber;
    }
    public void setParkingLotNumber(int parkingLotNumber) {
        this.parkingLotNumber = parkingLotNumber;
    }
    public String getParkingLotName() {
        return parkingLotName;
    }
    public void setParkingLotName(String parkingLotName) {
        this.parkingLotName = parkingLotName;
    }
    public List<ParkingFloor> getParkingfloors() {
        return parkingfloors;
    }
    public void setParkingfloors(List<ParkingFloor> parkingfloors) {
        this.parkingfloors = parkingfloors;
    }
    public List<Gate> getGates() {
        return gates;
    }
    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
    public List<Operator> getOperators() {
        return operators;
    }
    public void setOperators(List<Operator> operators) {
        this.operators = operators;
    }
    public Status getParkingLotStatus() {
        return parkingLotStatus;
    }
    public void setParkingLotStatus(Status parkingLotStatus) {
        this.parkingLotStatus = parkingLotStatus;
    }



    

}
