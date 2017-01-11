package com.opencloud.openposapi.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 9/1/2017.
 */
@Entity
@Table(name = "pos_product_type")
public class ProductType {
    @Id
    @Column(name = "product_type_key")
    //@GeneratedValue(strategy = GenerationType.AUTO)
    private UUID productTypeKey;
    @Column(name = "product_type_name", nullable = false)
    private String productTypeName;
    @Column(name = "description", nullable = false)
    private String description;
    @Version
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public ProductType() {
        this.productTypeKey = null;
        this.productTypeName = "";
        this.description = "";
        this.updatedTime = null;
    }

    public UUID getProductTypeKey() {
        return productTypeKey;
    }

    public void setProductTypeKey(UUID productTypeKey) {
        this.productTypeKey = productTypeKey;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
