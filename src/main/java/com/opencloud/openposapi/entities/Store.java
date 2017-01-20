package com.opencloud.openposapi.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

/**
 * Created by ivanchan on 20/1/2017.
 */

@Entity
@Table(name = "pos_store")
public class Store implements Serializable{
    @Id
    @Column(name = "store_key")
    private UUID storeKey;

    @Column(name = "store_name", nullable = false, length = 100)
    private String storeName;

    @Column(name = "store_status", nullable = false, length = 10)
    private String status;

    @ManyToOne
    @JoinColumn(name = "member_key")
    private Member member;

    @Version
    @JsonIgnore
    @Column(name = "last_updated_time")
    private Date updatedTime;

    public UUID getStoreKey() {
        return storeKey;
    }

    public void setStoreKey(UUID storeKey) {
        this.storeKey = storeKey;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Date updatedTime) {
        this.updatedTime = updatedTime;
    }
}
