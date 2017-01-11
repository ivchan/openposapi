package com.opencloud.openposapi.entities;

import javax.persistence.*;
import java.util.UUID;

/**
 * Created by ivanchan on 8/1/2017.
 */

@Entity
@Table(name = "pos_sales_person")
public class SalesPerson {
    @Id
    @Column(name = "sales_person_key")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private UUID salesPersonKey;
}
