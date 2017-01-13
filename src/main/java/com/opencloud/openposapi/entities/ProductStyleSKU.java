package com.opencloud.openposapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

/**
 * Created by 29jan on 1/14/2017.
 */
@Entity
@Table(name = "pos_product_sku")
public class ProductStyleSKU {
    @Id
    @Column(name = "sku_key")
    private UUID skuKey;
    @Column(name = "product_style_key")
    private UUID productStyleKey;
    @Column(name = "product_key")
    private UUID productKey;

    public UUID getSkuKey() {
        return skuKey;
    }

    public void setSkuKey(UUID skuKey) {
        this.skuKey = skuKey;
    }

    public UUID getProductStyleKey() {
        return productStyleKey;
    }

    public void setProductStyleKey(UUID productStyleKey) {
        this.productStyleKey = productStyleKey;
    }

    public UUID getProductKey() {
        return productKey;
    }

    public void setProductKey(UUID productKey) {
        this.productKey = productKey;
    }
}
