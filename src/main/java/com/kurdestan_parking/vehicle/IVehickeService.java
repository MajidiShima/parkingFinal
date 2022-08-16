package com.kurdestan_parking.vehicle;

import java.util.List;

public interface IVehickeService {


    Vehicle save(Vehicle vehicle);
    Vehicle update(Vehicle vehicle);
    void delete(Long id);
    Vehicle getById(Long id);
    List<Vehicle> getAll();
    List<Vehicle> filterByTaradod(String pelak );

  // List<Vehicle>TejaSavari(String TejaSavari);

}
