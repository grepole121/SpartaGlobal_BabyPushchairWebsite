package com.sparta.eng87.babypushchairwebsite.entities;

import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "voucherstable", schema = "babyitemswebsite", catalog = "")
@IdClass(VoucherstableEntityPK.class)
public class VoucherstableEntity {

    private Integer vendorId;
    private String voucherCode;
    private String voucherDescription;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinColumn(name = "VOUCHERSTABLE_VENDORID")
    private Set<VendorstableEntity> vendor;

    @Id
    @Column(name = "VendorID")
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    @Id
    @Column(name = "VoucherCode")
    public String getVoucherCode() {
        return voucherCode;
    }

    public void setVoucherCode(String voucherCode) {
        this.voucherCode = voucherCode;
    }

    @Basic
    @Column(name = "VoucherDescription")
    public String getVoucherDescription() {
        return voucherDescription;
    }

    public void setVoucherDescription(String voucherDescription) {
        this.voucherDescription = voucherDescription;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VoucherstableEntity that = (VoucherstableEntity) o;
        return Objects.equals(vendorId, that.vendorId) && Objects.equals(voucherCode, that.voucherCode) && Objects.equals(voucherDescription, that.voucherDescription);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, voucherCode, voucherDescription);
    }
}
