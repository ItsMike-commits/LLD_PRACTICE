package parkinglot.service;

import java.sql.Date;
import java.util.Optional;

import parkinglot.dtos.TicketRequestdto;
import parkinglot.dtos.TicketResponseDto;
import parkinglot.model.Gate;
import parkinglot.model.Ticket;
import parkinglot.model.Vehicle;
import parkinglot.model.VehicleType;
import parkinglot.repository.GateRepository;
import parkinglot.repository.TicketRepository;
import parkinglot.repository.VehicleRepository;

public class TicketService {
    private GateRepository gateRepository;
    private TicketRepository ticketRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository,TicketRepository ticketRepository, VehicleRepository vehicleRepository)
    {
        this.gateRepository = gateRepository;
        this.ticketRepository = ticketRepository;
        this.vehicleRepository = vehicleRepository;
    }

    
    public Ticket generateTicketService(TicketRequestdto request)
    {
        // Get the gate object from the DB.
         Optional<Gate> currentGate = gateRepository.findbyId(request.getGateId());
         Gate gate = new Gate();
         if(currentGate.isEmpty())
         {
            // Invalid gateId
            System.err.println("Invalid Gate");
         }
         else{
            gate = currentGate.get();
         }
         
         Optional<Vehicle> currentVehicle = vehicleRepository.findByVehicleNumber(request.getVehicleNumber());
         Vehicle vehicle = null;
         if(currentVehicle.isEmpty())
         {
            // Create a new vehicle object and store it in db.
            vehicle = new Vehicle();
            vehicle.setVehicleNumber(request.getVehicleNumber());
            vehicle.setOwnername(request.getVehichleOwner());
            vehicle.setVehicleType(request.getVehicleType());

            vehicle = vehicleRepository.save(vehicle);
         }
         else
         {
            vehicle = currentVehicle.get();
         }


         Ticket ticket = new Ticket();
         ticket.setVehicle(vehicle);
         ticket.setGate(gate);

         return ticket;
    }

}
