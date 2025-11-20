package parkinglot.controller;

import parkinglot.dtos.TicketRequestdto;
import parkinglot.dtos.TicketResponseDto;
import parkinglot.model.Ticket;
import parkinglot.model.VehicleType;

import parkinglot.service.TicketService;
public class TicketController {
    private TicketService ticketService;
    public TicketController(TicketService ticketService)
    {
        this.ticketService = ticketService;
    }
    public Ticket generateTicket(TicketRequestdto ticketRequestdto)
    {
         // Controller does some validation check on input object.

         
         // After successful validation, Controller sends object to TicketService to process all business logic.
         //After processing, it gets back the responseModel and it sends it back to the client.

         Ticket response = ticketService.generateTicketService(ticketRequestdto);
         System.out.println("Inside Controller class");
         System.out.println("Vehicle no "+ response.getVehicle().getVehicleNumber() + " Gate no "+ response.getGate().getId());
         return response;
    }

}
