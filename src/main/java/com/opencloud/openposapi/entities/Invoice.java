package com.opencloud.openposapi.entities;

import javax.persistence.*;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 16/1/2017.
 */
@Entity
@Table(name = "pos_invoice")
public class Invoice {
    @Id
    @Column(name = "member_key")
    private UUID memberKey;
    @Column(name = "invoice_key")
    private UUID invoiceKey;
    @Column(name = "invoice_no", nullable = false)
    private String invoiceNo;
    @Column(name = "customer_key")
    private UUID customerKey;
    @Column(name = "customer_name", nullable = false, length = 100)
    private String customerName;
    @Column(name = "invoice_total")
    private double invoiceTotal;
    @Column(name = "invoice_discount")
    private float invoiceDiscount;
    @Column(name = "invoice_total_value")
    private double invoiceTotalValue;
    @Column(name = "header_text", length = 255)
    private String headerText;
    @Column(name = "foot_note", length = 255)
    private String footNote;
    @Column(name = "create_date")
    private Date createDate;
    @Column(name = "create_by")
    private UUID createBy;
    @Column(name = "last_modify_date")
    private Date lastModifyDate;
    @Column(name = "last_modify_by")
    private UUID lastModifyBy;
    @Column(name = "cancel_date")
    private Date cancelDate;
    @Column(name = "cancel_by")
    private UUID cancelBy;
    @Version
    @Column(name = "last_updated_time")
    private Date updatedTime;

}
