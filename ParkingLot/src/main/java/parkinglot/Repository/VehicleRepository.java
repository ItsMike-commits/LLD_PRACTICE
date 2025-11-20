package parkinglot.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import parkinglot.model.Vehicle;

public class VehicleRepository {
    private Map<Long,Vehicle> vehicleMap = new HashMap<>();
    private Long vehicleId = 0L;


    public Optional<Vehicle> findByVehicleNumber(String vehicleNumber)
    {
        for(Vehicle vehicle : vehicleMap.values()){
          if(vehicle.getVehicleNumber().equals(vehicleNumber))
            {
                return Optional.of(vehicle);
            }
        }
        return Optional.empty();
    }
    
    public Vehicle save(Vehicle vehicle)
    {
        if(vehicle.getId() == null)
        {
            vehicleId++;
            vehicle.setId(vehicleId);
            vehicleMap.put(vehicleId , vehicle);
        }
        else{
            vehicleMap.put(vehicleId, vehicle);
        }

        return vehicle;
    }

    public Optional<Vehicle> findById(Long vehicleId)
    {
      if(vehicleMap.containsKey(vehicleId))
      {
        return Optional.of(vehicleMap.get(vehicleId));
      }
      return Optional.empty();
    }
    


}
