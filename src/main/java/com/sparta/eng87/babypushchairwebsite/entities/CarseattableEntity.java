package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "carseattable", schema = "Prams", catalog = "")
public class CarseattableEntity {
    private Integer seatId;
    private String productName;
    private String brandName;
    private String image;
    private String productDescription;
    private BigDecimal weight;
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    private Integer ageFromMonths;
    private Integer ageToMonths;
    private BigDecimal expertScore;
    private Boolean easeOfSetup;
    private Boolean discontinuedFlag;
    private BigDecimal cheapestPrice;

    @Id
    @Column(name = "SeatID")
    public Integer getSeatId() {
        return seatId;
    }

    public void setSeatId(Integer seatId) {
        this.seatId = seatId;
    }

    @Basic
    @Column(name = "ProductName")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "BrandName")
    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Basic
    @Column(name = "Image")
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Basic
    @Column(name = "ProductDescription")
    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    @Basic
    @Column(name = "Weight")
    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    @Basic
    @Column(name = "Length")
    public BigDecimal getLength() {
        return length;
    }

    public void setLength(BigDecimal length) {
        this.length = length;
    }

    @Basic
    @Column(name = "Width")
    public BigDecimal getWidth() {
        return width;
    }

    public void setWidth(BigDecimal width) {
        this.width = width;
    }

    @Basic
    @Column(name = "Height")
    public BigDecimal getHeight() {
        return height;
    }

    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    @Basic
    @Column(name = "AgeFromMonths")
    public Integer getAgeFromMonths() {
        return ageFromMonths;
    }

    public void setAgeFromMonths(Integer ageFromMonths) {
        this.ageFromMonths = ageFromMonths;
    }

    @Basic
    @Column(name = "AgeToMonths")
    public Integer getAgeToMonths() {
        return ageToMonths;
    }

    public void setAgeToMonths(Integer ageToMonths) {
        this.ageToMonths = ageToMonths;
    }

    @Basic
    @Column(name = "ExpertScore")
    public BigDecimal getExpertScore() {
        return expertScore;
    }

    public void setExpertScore(BigDecimal expertScore) {
        this.expertScore = expertScore;
    }

    @Basic
    @Column(name = "EaseOfSetup")
    public Boolean getEaseOfSetup() {
        return easeOfSetup;
    }

    public void setEaseOfSetup(Boolean easeOfSetup) {
        this.easeOfSetup = easeOfSetup;
    }

    @Basic
    @Column(name = "DiscontinuedFlag")
    public Boolean getDiscontinuedFlag() {
        return discontinuedFlag;
    }

    public void setDiscontinuedFlag(Boolean discontinuedFlag) {
        this.discontinuedFlag = discontinuedFlag;
    }

    @Basic
    @Column(name = "CheapestPrice")
    public BigDecimal getCheapestPrice() {
        return cheapestPrice;
    }

    public void setCheapestPrice(BigDecimal cheapestPrice) {
        this.cheapestPrice = cheapestPrice;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarseattableEntity that = (CarseattableEntity) o;
        return Objects.equals(seatId, that.seatId) && Objects.equals(productName, that.productName) && Objects.equals(brandName, that.brandName) && Objects.equals(image, that.image) && Objects.equals(productDescription, that.productDescription) && Objects.equals(weight, that.weight) && Objects.equals(length, that.length) && Objects.equals(width, that.width) && Objects.equals(height, that.height) && Objects.equals(ageFromMonths, that.ageFromMonths) && Objects.equals(ageToMonths, that.ageToMonths) && Objects.equals(expertScore, that.expertScore) && Objects.equals(easeOfSetup, that.easeOfSetup) && Objects.equals(discontinuedFlag, that.discontinuedFlag) && Objects.equals(cheapestPrice, that.cheapestPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(seatId, productName, brandName, image, productDescription, weight, length, width, height, ageFromMonths, ageToMonths, expertScore, easeOfSetup, discontinuedFlag, cheapestPrice);
    }
}
