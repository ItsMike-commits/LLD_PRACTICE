/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package parkinglot;

import parkinglot.controller.TicketController;
import parkinglot.dtos.TicketRequestdto;
import parkinglot.dtos.TicketResponseDto;
import parkinglot.model.Ticket;
import parkinglot.model.VehicleType;
import parkinglot.repository.GateRepository;
import parkinglot.repository.TicketRepository;
import parkinglot.repository.VehicleRepository;
import parkinglot.service.TicketService;

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

        GateRepository gateRepository = new GateRepository();
        TicketRepository ticketRepository = new TicketRepository();
        VehicleRepository vehicleRepository = new VehicleRepository();
        
        TicketService ticketService = new TicketService(gateRepository,ticketRepository,vehicleRepository);
        TicketController ticketController = new TicketController(ticketService);
        Ticket responseDto = ticketController.generateTicket(ticketRequestdto);
        System.out.println("Output Gate id "+ responseDto.getGate().getId() + " vehicle no "+ responseDto.getVehicle().getVehicleNumber());
    }
}
