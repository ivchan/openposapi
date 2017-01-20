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
@Table(name = "pos_product_sku")
public class ProductStyleSKU implements Serializable{
    @Id
    @Column(name = "sku_key")
    private UUID skuKey;

    @ManyToOne
    @JoinColumn(name = "product_style_key")
    private ProductStyle productStyle;

    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public UUID getSkuKey() {
        return skuKey;
    }

    public void setSkuKey(UUID skuKey) {
        this.skuKey = skuKey;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public ProductStyle getProductStyle() {
        return productStyle;
    }

    public void setProductStyle(ProductStyle productStyle) {
        this.productStyle = productStyle;
    }
}
