package com.kurdestan_parking.PriceVehicle;




import java.util.Date;
import java.util.List;

public interface IPriceVehicleService {


    PriceVehicle save(PriceVehicle priceVehicle);

    List<PriceVehicle> getAll();

    PriceVehicle getById(Long id);

    List<PriceVehicle> getAllByVehicle(PriceVehicle priceVehicle);

    Long findDistinctByExitTimeAndRate(Date from, Date to);

    List<PriceVehicle> getAllByPrice(Long priceId);

}
