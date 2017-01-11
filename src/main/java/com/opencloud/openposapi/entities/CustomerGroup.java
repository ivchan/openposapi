package com.opencloud.openposapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

/**
 * Created by ivanchan on 11/1/2017.
 */
@Entity
@Table(name = "pos_customer_group")
public class CustomerGroup {
    @Id
    private UUID customerGroupKey;
    @Column(name = "group_name", length = 100, nullable = false)
    private String customerGroupName;

    public UUID getCustomerGroupKey() {
        return customerGroupKey;
    }

    public void setCustomerGroupKey(UUID customerGroupKey) {
        this.customerGroupKey = customerGroupKey;
    }

    public String getCustomerGroupName() {
        return customerGroupName;
    }

    public void setCustomerGroupName(String customerGroupName) {
        this.customerGroupName = customerGroupName;
    }
}
