package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vendorseatstable", schema = "prams", catalog = "")
@IdClass(VendorseatstableEntityPK.class)
public class VendorseatstableEntity {
    private Integer vendorId;
    private Integer seatId;
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
    @Column(name = "seatID")
    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
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
        VendorseatstableEntity that = (VendorseatstableEntity) o;
        return Objects.equals(vendorId, that.vendorId) && Objects.equals(seatId, that.seatId) && Objects.equals(price, that.price) && Objects.equals(websiteUrl, that.websiteUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, seatId, price, websiteUrl);
    }
}
