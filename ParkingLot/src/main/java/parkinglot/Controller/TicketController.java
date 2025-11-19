package parkinglot.Controller;

import parkinglot.Model.Ticket;
import parkinglot.Model.VehicleType;
import parkinglot.Service.TicketService;
import parkinglot.dtos.TicketRequestdto;

public class TicketController {
    
    private TicketService ticketService;
    public TicketController(TicketService ticketService)
    {
        this.ticketService = ticketService;
    }
    public Ticket generateTicket(TicketRequestdto ticketRequestdto)
    {
         // Controller does some validation check on input object.
         String vehicleNumber = ticketRequestdto.getVehicleNumber();
         String vehicleOwner = ticketRequestdto.getVehichleOwner();
         long gateId = ticketRequestdto.getGateId();
         VehicleType vehicleType = ticketRequestdto.getVehicleType();
         
         // After successful validation, Controller sends object to TicketService to process all business logic.
        Ticket newTicket = ticketService.generateTicketService(ticketRequestdto);
        
        return newTicket;
    }

}
