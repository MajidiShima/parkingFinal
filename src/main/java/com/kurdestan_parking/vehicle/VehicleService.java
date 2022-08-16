package com.kurdestan_parking.vehicle;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service

@AllArgsConstructor


public class VehicleService implements IVehickeService{

    private  final VehicleRepasitory repository;



    @Override
    public Vehicle save(Vehicle vehicle) {
        return repository.save(vehicle);

    }

    @Override
    public Vehicle update(Vehicle vehicle) {
        return null;
    }

    @Override
    public void delete(Long id) {

        repository.deleteById(id);
    }

    @Override
    public Vehicle getById(Long id) {
        Optional<Vehicle> optionalVehicle=repository.findById(id);

        if (!optionalVehicle.isPresent()){

            throw new RuntimeException("Not Found");
        }

        return optionalVehicle.get();
    }

    @Override
    public List<Vehicle> getAll() {
        return (List<Vehicle>) repository.findAll();
    }

    @Override
    public List<Vehicle> filterByTaradod(String pelak) {
        return repository.findAllByTaradod(pelak);

    }
}
