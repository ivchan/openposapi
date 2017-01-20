package com.opencloud.openposapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by 29jan on 1/14/2017.
 */
@Entity
@Table(name = "pos_product_style")
public class ProductStyle implements Serializable{
    @Id
    @Column(name = "product_style_key")
    private UUID productStyleKey;

    @ManyToOne
    @JoinColumn(name = "product_key")
    private Product product;

    @Column(name = "product_color_key")
    private UUID colourKey;

    @Column(name = "product_size_key")
    private UUID sizeKey;

    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public UUID getProductStyleKey() {
        return productStyleKey;
    }

    public void setProductStyleKey(UUID productStyleKey) {
        this.productStyleKey = productStyleKey;
    }

    public UUID getColourKey() {
        return colourKey;
    }

    public void setColourKey(UUID colourKey) {
        this.colourKey = colourKey;
    }

    public UUID getSizeKey() {
        return sizeKey;
    }

    public void setSizeKey(UUID sizeKey) {
        this.sizeKey = sizeKey;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
