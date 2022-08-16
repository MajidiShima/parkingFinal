package com.kurdestan_parking.PriceVehicle;



import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/PriceVehicle/")
@AllArgsConstructor


public class PriceVehicleController {
    private final IPriceVehicleService service;

    private final PriceVehicle mapper;

    @PostMapping("/priVeh")

    public ResponseEntity save(@RequestBody PriceVehicle priceVehicle) {

        service.save(priceVehicle);
        return ResponseEntity.status(HttpStatus.CREATED).build();//


    }




}