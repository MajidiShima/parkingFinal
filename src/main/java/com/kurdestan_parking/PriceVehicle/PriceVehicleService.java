package com.kurdestan_parking.PriceVehicle;

import com.kurdestan_parking.priceRate.IPriceService;
import com.kurdestan_parking.priceRate.Price;
import com.kurdestan_parking.vehicle.IVehickeService;
import com.kurdestan_parking.vehicle.Vehicle;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.webjars.NotFoundException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor



public class PriceVehicleService implements IPriceVehicleService {

    private  final PriceVehicleRepository repository;

    private final IPriceService PriceService;
    private final  IVehickeService VehickeService;


    @Override
    public PriceVehicle save(PriceVehicle priceVehicle) {
        Long vehId=priceVehicle.getVehicle().getId();
        Long pricId=priceVehicle.getPrice().getId();

        Vehicle vehicle=VehickeService.getById(vehId);
        Price price= PriceService.getById(pricId);

        priceVehicle.setVehicle(vehicle);
        priceVehicle.setPrice(price);

        return repository.save(priceVehicle);
    }

    @Override

    public List<PriceVehicle> getAll() {
        return (List<PriceVehicle>) repository.findAll();
    }

    @Override
    public PriceVehicle getById(Long id) {

        Optional<PriceVehicle> optionalPriceVehicle=repository.findById(id);

           if(!optionalPriceVehicle.isPresent()){
               throw new NotFoundException("Not found");
           }
        return optionalPriceVehicle.get();
    }

    public List<PriceVehicle> getAllByVehicle(PriceVehicle priceVehicle) {
        PriceVehicle priceVehicle = VehickeService.getAll();

        List<PriceVehicle> priceVehicleList=repository.findAllByVehicle(priceVehicle);

        return priceVehicleList;
    }

    @Override
    public Long findDistinctByExitTimeAndRate(Date from, Date to) {
        return null;
    }

    @Override
    public List<PriceVehicle> getAllByPrice(Long priceId) {
        Price price=PriceService.getById(priceId);
        List<PriceVehicle> priceVehicleList=repository.findAllByPrice(price);
        return priceVehicleList;
    }
}
