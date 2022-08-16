package com.kurdestan_parking.parking;

import com.kurdestan_parking.Parking;
import com.kurdestan_parking.vehicle.IVehickeService;
import com.kurdestan_parking.vehicle.Vehicle;
import com.kurdestan_parking.vehicle.VehicleRepasitory;
import com.kurdestan_parking.vehicle.VehicleService;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Transient;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ParkingService implements IParkingService{

    private  final ParkingRepository repository;
    private final IVehickeService vehicleService;


    @Override
    public Parking save(Parking parking) {
        var vehicle= vehicleService.getById(parking.getVehicle().getId());

        parking.setVehicle(vehicle);

        return repository.save(parking);
    }


    @Override
    public List<Parking> getAll() {



        return (List<Parking>) repository.findAll();
    }

    @Override
    public List<Parking> findAllByVehicle(Vehicle vehicle) {


        return null;
    }

    @Override
    public Long findDistinctByExitTimeAndRate(Date from, Date to) {
        return null;

    }

}
