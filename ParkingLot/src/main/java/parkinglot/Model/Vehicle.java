package parkinglot.model;

public class Vehicle extends BaseModel {
    private String vehicleNumber;
    private String ownername;
    private VehicleType vehicleType;

    
    public String getVehicleNumber() {
        return vehicleNumber;
    }
    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }
    public String getOwnername() {
        return ownername;
    }
    public void setOwnername(String ownername) {
        this.ownername = ownername;
    }
    public VehicleType getVehicleType() {
        return vehicleType;
    }
    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

}
