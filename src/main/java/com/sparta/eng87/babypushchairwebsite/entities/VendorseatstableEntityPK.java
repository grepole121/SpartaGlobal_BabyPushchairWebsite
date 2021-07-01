package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class VendorseatstableEntityPK implements Serializable {
    private Integer vendorId;
    private Integer seatId;

    @Column(name = "vendorID")
    @Id
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    @Column(name = "seatID")
    @Id
    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendorseatstableEntityPK that = (VendorseatstableEntityPK) o;
        return Objects.equals(vendorId, that.vendorId) && Objects.equals(seatId, that.seatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, seatId);
    }
}
