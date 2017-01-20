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
@Table(name = "pos_invoice")
public class Invoice implements Serializable{
    @Id
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
    @ManyToOne
    @JoinColumn(name = "member_key")
    private Member member;
    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public UUID getInvoiceKey() {
        return invoiceKey;
    }

    public void setInvoiceKey(UUID invoiceKey) {
        this.invoiceKey = invoiceKey;
    }

    public String getInvoiceNo() {
        return invoiceNo;
    }

    public void setInvoiceNo(String invoiceNo) {
        this.invoiceNo = invoiceNo;
    }

    public UUID getCustomerKey() {
        return customerKey;
    }

    public void setCustomerKey(UUID customerKey) {
        this.customerKey = customerKey;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public double getInvoiceTotal() {
        return invoiceTotal;
    }

    public void setInvoiceTotal(double invoiceTotal) {
        this.invoiceTotal = invoiceTotal;
    }

    public float getInvoiceDiscount() {
        return invoiceDiscount;
    }

    public void setInvoiceDiscount(float invoiceDiscount) {
        this.invoiceDiscount = invoiceDiscount;
    }

    public double getInvoiceTotalValue() {
        return invoiceTotalValue;
    }

    public void setInvoiceTotalValue(double invoiceTotalValue) {
        this.invoiceTotalValue = invoiceTotalValue;
    }

    public String getHeaderText() {
        return headerText;
    }

    public void setHeaderText(String headerText) {
        this.headerText = headerText;
    }

    public String getFootNote() {
        return footNote;
    }

    public void setFootNote(String footNote) {
        this.footNote = footNote;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public UUID getCreateBy() {
        return createBy;
    }

    public void setCreateBy(UUID createBy) {
        this.createBy = createBy;
    }

    public Date getLastModifyDate() {
        return lastModifyDate;
    }

    public void setLastModifyDate(Date lastModifyDate) {
        this.lastModifyDate = lastModifyDate;
    }

    public UUID getLastModifyBy() {
        return lastModifyBy;
    }

    public void setLastModifyBy(UUID lastModifyBy) {
        this.lastModifyBy = lastModifyBy;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public UUID getCancelBy() {
        return cancelBy;
    }

    public void setCancelBy(UUID cancelBy) {
        this.cancelBy = cancelBy;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
