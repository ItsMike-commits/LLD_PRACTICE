package parkinglot.Model;

import java.sql.Date;

public class Ticket extends BaseModel {
    private int ticketNumber;
    private Vehicle vehicle;
    private Gate gate;
    private Date entryTime;


    public int getTicketNumber() {
        return ticketNumber;
    }
    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
    public Vehicle getVehicle() {
        return vehicle;
    }
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
    public Gate getGate() {
        return gate;
    }
    public void setGate(Gate gate) {
        this.gate = gate;
    }
    public Date getEntryTime() {
        return entryTime;
    }
    public void setEntryTime(Date entryTime) {
        this.entryTime = entryTime;
    }
    

}
