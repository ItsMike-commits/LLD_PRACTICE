/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package parkinglot;

import parkinglot.Controller.TicketController;
import parkinglot.Model.VehicleType;
import parkinglot.Service.TicketService;
import parkinglot.dtos.TicketRequestdto;

/**
 *
 * @author mukeshsingh
 */
public class ParkingLot {

    public static void main(String[] args) {
        
        TicketRequestdto ticketRequestdto = new TicketRequestdto();
        ticketRequestdto.setGateId(1);
        ticketRequestdto.setVehichleOwner("Mukesh");
        ticketRequestdto.setVehicleNumber("1234-ABCD");
        ticketRequestdto.setVehicleType(VehicleType.BIKE);
        
        TicketService ticketService = new TicketService();
        TicketController ticketController = new TicketController(ticketService);
        ticketController.generateTicket(ticketRequestdto);
    }
}
