package com.kurdestan_parking.priceRate;

import com.kurdestan_parking.vehicle.IVehickeService;
import com.kurdestan_parking.vehicle.VehicleRepasitory;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PriceService implements IPriceService {

    private final PriceRepository repository;


    @Override
    public Price save(Price price) {
        return repository.save(price);
    }

    @Override
    public List<Price> getAll() {

        return (List<Price>) repository.findAll();
    }

    @Override
    public Price getById(Long id) {
        Optional<Price> optionalPrice = repository.findById(id);
        if (!optionalPrice.isPresent()) {
            throw new NotFoundException("Not found");
        }

        return optionalPrice.get();
    }
}