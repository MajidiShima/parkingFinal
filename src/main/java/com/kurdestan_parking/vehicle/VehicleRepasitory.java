package com.kurdestan_parking.vehicle;
import com.kurdestan_parking.Parking;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Date;

@Repository

public interface VehicleRepasitory extends PagingAndSortingRepository<Vehicle,Long> {


    List<Vehicle>findAllBySavariTejari(Boolean Vehicle);
    List<Vehicle>findAllByTaradod(String pelak);


}
