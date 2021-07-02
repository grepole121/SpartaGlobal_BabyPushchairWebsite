package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "vendorstable", schema = "prams", catalog = "")
public class VendorstableEntity {
    private Integer vendorId;
    private String websiteUrl;
    private BigDecimal affiliatePercentage;

    @Id
    @Column(name = "vendorId")
    public Integer getVendorId() {
        return vendorId;
    }

    public void setVendorId(Integer vendorId) {
        this.vendorId = vendorId;
    }

    @Basic
    @Column(name = "websiteURL")
    public String getWebsiteUrl() {
        return websiteUrl;
    }

    public void setWebsiteUrl(String websiteUrl) {
        this.websiteUrl = websiteUrl;
    }

    @Basic
    @Column(name = "affiliatePercentage")
    public BigDecimal getAffiliatePercentage() {
        return affiliatePercentage;
    }

    public void setAffiliatePercentage(BigDecimal affiliatePercentage) {
        this.affiliatePercentage = affiliatePercentage;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VendorstableEntity that = (VendorstableEntity) o;
        return Objects.equals(vendorId, that.vendorId) && Objects.equals(websiteUrl, that.websiteUrl) && Objects.equals(affiliatePercentage, that.affiliatePercentage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vendorId, websiteUrl, affiliatePercentage);
    }
}
