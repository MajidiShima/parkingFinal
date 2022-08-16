package com.kurdestan_parking;


import com.kurdestan_parking.vehicle.Vehicle;
import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="tbl_parking")
@Data
public class Parking {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @NotNull
        @Column(name = "Enter-time")
        @Temporal(TemporalType.TIMESTAMP)
        private Date time;


        @NotNull
        @Column(name="rate")
        private Long rate;


        @ManyToOne()
        @JoinColumn(name = "vehicle_id" , referencedColumnName = "id")
        private Vehicle vehicle;




    }

