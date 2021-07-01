package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class VendorpramtableEntityPK implements Serializable {
    private Integer vendorId;
    private Integer pramId;

    @Column(name = "vendorID")
    @Id
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    @Column(name = "pramID")
    @Id
    public Integer getPramId() {
        return pramId;
    }

    public void setPramId(Integer pramId) {
        this.pramId = pramId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendorpramtableEntityPK that = (VendorpramtableEntityPK) o;
        return Objects.equals(vendorId, that.vendorId) && Objects.equals(pramId, that.pramId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, pramId);
    }
}
