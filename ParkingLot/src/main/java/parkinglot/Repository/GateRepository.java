package parkinglot.repository;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import parkinglot.model.Gate;

public class GateRepository {
    private Map<Long, Gate> gateMap = new HashMap<>();
    private Long gateId = 0L;

    public Gate save(Gate gate)
    {
        //Check if the gate already exists or not.
        if(gate.getId() == null) // gateId doesn't exist. Create+Update
        {
            gateId++;
            gate.setId(gateId);
            gateMap.put(gateId , gate);

        }
        else{ // Update
            gateMap.put(gateId, gate);
        }

        return gate;
    }

    public Optional<Gate> findbyId(Long gateId)
    {
        if(gateMap.containsKey(gateId))
            return Optional.of(gateMap.get(gateId));
        else
           return Optional.empty(); 

    }
}
