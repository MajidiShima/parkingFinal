package com.kurdestan_parking.PriceVehicle;


import com.kurdestan_parking.Parking;
import com.kurdestan_parking.priceRate.Price;
import com.kurdestan_parking.vehicle.Vehicle;
import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="tbl_priceVehicle",uniqueConstraints = {@UniqueConstraint(columnNames = {"Price_id","vehicle_id"})})
@Data

public class PriceVehicle {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "Price_id")
    private Price price;



    @ManyToOne
    @JoinColumn(name = "vehicle_id")
    private Vehicle vehicle;


}
