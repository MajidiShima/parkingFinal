package com.kurdestan_parking.vehicle;

import com.kurdestan_parking.Parking;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Table(name = "tbl_vehicle")
@Data

public class Vehicle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "TejaSavari")
    @Enumerated(value = EnumType.STRING)
    private TejaSavari TejaSavari;

    @NotNull
    @Column(name = "pelak", unique = true)
    private String pelak;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "vehicle", cascade = CascadeType.ALL)
    private List<Parking> parkingList;


}
