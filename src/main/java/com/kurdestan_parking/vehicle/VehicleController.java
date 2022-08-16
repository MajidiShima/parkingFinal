package com.kurdestan_parking.vehicle;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(value = "/vehicle/")//ino baraye khanaii bishtar mizarim
@AllArgsConstructor


public class VehicleController {
    private final IVehickeService service;

    private final VehicleMapper mapper;

    @PostMapping("/veh1")

    public ResponseEntity save(@RequestBody Vehicle vehicle) {

        service.save(vehicle);
        return ResponseEntity.status(HttpStatus.CREATED).build();// وقتی سیو شد ..
    }

    @PutMapping("/ve")
    public ResponseEntity update(@RequestBody Vehicle vehicle) {

        service.save(vehicle);
        return ResponseEntity.ok().build();

    }


    @GetMapping("/ve/{id}")
    public ResponseEntity<Vehicle> getById(@PathVariable Long id) {

        Vehicle vehicle = service.getById(id);
        return ResponseEntity.ok(vehicle);

    }

    @GetMapping("/ve")
    public ResponseEntity<List<Vehicle>> getAll() {

        List<Vehicle> vehicleList = service.getAll();
        return ResponseEntity.ok(vehicleList);

    }

    @GetMapping("/ve/filter-pelak/{pelak}")
    public ResponseEntity<List<Vehicle>> filterByTaradod(@PathVariable String pelak) {

        List<Vehicle> vehicleList = service.filterByTaradod(pelak);
        return ResponseEntity.ok(vehicleList);

    }

    @DeleteMapping("/ve/{id}")

    public ResponseEntity Delete(@PathVariable Long id) {

        Vehicle vehicle = service.getById(id);
        return ResponseEntity.ok().build();
    }
   // @GetMapping("/ve/filter-tejari-savari/{TejaSavar}")
   // public ResponseEntity<List<Vehicle>>TejaSavari(@PathVariable String TejaSavar ) {

       // List<Vehicle> vehicleList = service.filterByTaradod();
      // return ResponseEntity.ok(vehicleList);

   // }

}