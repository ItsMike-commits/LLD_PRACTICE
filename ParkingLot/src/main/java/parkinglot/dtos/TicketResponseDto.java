package parkinglot.dtos;

import parkinglot.model.Ticket;
import parkinglot.model.VehicleType;

public class TicketResponseDto {

    private TicketRequestdto responseTicket;
    private String vehicleNumber;
    private String vehichleOwner;
    private long gateId;
    private VehicleType vehicleType;

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public String getVehichleOwner() {
        return vehichleOwner;
    }

    public void setVehichleOwner(String vehichleOwner) {
        this.vehichleOwner = vehichleOwner;
    }

    public long getGateId() {
        return gateId;
    }

    public void setGateId(long gateId) {
        this.gateId = gateId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

   // public TicketResponseDto getTicketResponse() {
    //    return responseTicket;
    //}

    //public void setTicket(TicketRequestdto ticket) {
    //    this.responseTicket = ticket;
    //}

}
