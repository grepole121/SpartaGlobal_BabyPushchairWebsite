package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class VoucherstableEntityPK implements Serializable {
    private Integer vendorId;
    private String voucherCode;

    @Column(name = "VendorID")
    @Id
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    @Column(name = "VoucherCode")
    @Id
    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoucherstableEntityPK that = (VoucherstableEntityPK) o;
        return Objects.equals(vendorId, that.vendorId) && Objects.equals(voucherCode, that.voucherCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, voucherCode);
    }
}
