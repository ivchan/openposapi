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
@Table(name = "pos_product_style")
public class ProductStyle {
    @Id
    @Column(name = "product_style_key")
    private UUID productStyleKey;
    @Column(name = "product_key")
    private UUID productKey;
    @Column(name = "product_color_key")
    private UUID colourKey;
    @Column(name = "product_size_key")
    private UUID sizeKey;

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
}
