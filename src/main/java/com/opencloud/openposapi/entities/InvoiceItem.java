package com.opencloud.openposapi.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

/**
 * Created by ivanchan on 16/1/2017.
 */
@Entity
@Table(name = "pos_invoice_item")
public class InvoiceItem {
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

}
