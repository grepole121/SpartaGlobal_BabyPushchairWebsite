package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vendorpramtable", schema = "Prams", catalog = "")
@IdClass(VendorpramtableEntityPK.class)
public class VendorpramtableEntity {
    private Integer vendorId;
    private Integer pramId;
    private BigDecimal price;
    private String websiteUrl;

    @Id
    @Column(name = "vendorID")
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    @Id
    @Column(name = "pramID")
    public Integer getPramId() {
        return pramId;
    }

    public void setPramId(Integer pramId) {
        this.pramId = pramId;
    }

    @Basic
    @Column(name = "Price")
    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Basic
    @Column(name = "WebsiteURL")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendorpramtableEntity that = (VendorpramtableEntity) o;
        return Objects.equals(vendorId, that.vendorId) && Objects.equals(pramId, that.pramId) && Objects.equals(price, that.price) && Objects.equals(websiteUrl, that.websiteUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, pramId, price, websiteUrl);
    }
}
