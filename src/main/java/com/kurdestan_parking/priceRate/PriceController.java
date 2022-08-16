package com.kurdestan_parking.priceRate;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(value = "/price/")
@AllArgsConstructor
public class PriceController {

    private final IPriceService parkingService;

    private final PriceMapper mapper;

    @PostMapping
    public ResponseEntity save(@RequestBody PriceDTO priceDTO) {
        Price price = mapper.toPrice(priceDTO);
        parkingService.save(price);
        return ResponseEntity.status(HttpStatus.CREATED).build();// وقتی سیو شد ..
    }


    @GetMapping
    public ResponseEntity<List<PriceDTO>> getAll() {
        List<Price> parkingList = parkingService.getAll();
        List<PriceDTO> priceDTOS = mapper.toPriceDTOs(parkingList);
        return ResponseEntity.ok(priceDTOS);
    }


}

