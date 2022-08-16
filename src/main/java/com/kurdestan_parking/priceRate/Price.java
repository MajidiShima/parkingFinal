package com.kurdestan_parking.priceRate;
import com.kurdestan_parking.PriceVehicle.PriceVehicle;
import lombok.Data;
import org.hibernate.envers.Audited;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;


@Entity
@Audited
@Table(name="tbl_priceRate")
@Data


public class Price {
    @Id
    private Long id;


    @NotNull
    @Column(name="rate")
    private Long rate;


    @OneToMany(fetch = FetchType.LAZY,mappedBy = "price",cascade = CascadeType.ALL)
    private List<PriceVehicle> priceVehicleList;



}
