package com.opencloud.openposapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 16/1/2017.
 */
@Entity
@Table(name = "pos_invoice_item")
public class InvoiceItem implements Serializable{
    @Id
    @Column(name = "invoice_item_key")
    private UUID invoiceItemKey;
    @Column(name = "member_key")
    private UUID memberKey;
    @Column(name = "invoice_key")
    private UUID invoiceKey;
    @Column(name = "seq_no")
    private int itemSeqNo;
    @Column(name = "item_sku_key")
    private UUID itemSKU;
    @Column(name = "item_description")
    private String description;
    @Column(name = "item_remark")
    private String remark;
    @Column(name = "item_quantity")
    private float quantity;
    @Column(name = "item_price")
    private Double price;
    @Column(name = "item_discount")
    private float discount;
    @Column(name = "item_value")
    private Double value;
    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public UUID getInvoiceItemKey() {
        return invoiceItemKey;
    }

    public void setInvoiceItemKey(UUID invoiceItemKey) {
        this.invoiceItemKey = invoiceItemKey;
    }

    public UUID getMemberKey() {
        return memberKey;
    }

    public void setMemberKey(UUID memberKey) {
        this.memberKey = memberKey;
    }

    public UUID getInvoiceKey() {
        return invoiceKey;
    }

    public void setInvoiceKey(UUID invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    public int getItemSeqNo() {
        return itemSeqNo;
    }

    public void setItemSeqNo(int itemSeqNo) {
        this.itemSeqNo = itemSeqNo;
    }

    public UUID getItemSKU() {
        return itemSKU;
    }

    public void setItemSKU(UUID itemSKU) {
        this.itemSKU = itemSKU;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public float getQuantity() {
        return quantity;
    }

    public void setQuantity(float quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public float getDiscount() {
        return discount;
    }

    public void setDiscount(float discount) {
        this.discount = discount;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
