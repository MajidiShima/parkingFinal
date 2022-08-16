package com.kurdestan_parking.parking;

import com.kurdestan_parking.Parking;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/parking/")//ino baraye khanaii bishtar mizarim
@AllArgsConstructor


public class ParkingController {

    private final IParkingService parkingService;

    private final ParkingMapper mapper;

    @PostMapping("/par")

    public ResponseEntity save(@RequestBody ParkingDTO parkingDTO) {
        Parking parking1 = mapper.toParking(parkingDTO);


        parkingService.save(parking1);
        return ResponseEntity.status(HttpStatus.CREATED).build();// وقتی سیو شد ..
    }


    @GetMapping("/ve")
    public ResponseEntity<List<Parking>> getAll() {

        List<Parking> parkingList = parkingService.getAll();
        return ResponseEntity.ok(parkingList);

    }
}

