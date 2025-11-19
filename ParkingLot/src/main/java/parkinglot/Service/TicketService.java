package parkinglot.Service;

import parkinglot.Model.Ticket;
import parkinglot.Model.VehicleType;
import parkinglot.dtos.TicketRequestdto;

public class TicketService {
    
    
    public Ticket generateTicketService(TicketRequestdto request)
    {
        System.out.println("Inside Ticketservice-generateTicket Method");
        System.out.println("GateId " + request.getGateId() +" Owner " + request.getVehichleOwner());
        return new Ticket();
    }

}
