package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Entity
@Table(name = "pramstable", schema = "prams", catalog = "")
public class PramstableEntity {
    private Integer pramId;
    private String productName;
    private String brandName;
    private String image;
    private String productDescription;
    private Integer childCapacity;
    private BigDecimal weight;
    private BigDecimal length;
    private BigDecimal width;
    private BigDecimal height;
    private Integer ageFromMonths;
    private Integer ageToMonths;
    private BigDecimal expertScore;
    private Boolean raincoverFlag;
    private Boolean changebagFlag;
    private Boolean parasolFlag;
    private Boolean mosquitonetFlag;
    private Boolean carAdapterFlag;
    private Boolean easeOfSetup;
    private Boolean reversableSeatFlag;
    private Boolean sturdyFlag;
    private Boolean compactFlag;
    private Boolean comfortFlag;
    private Boolean multiTerrainFlag;
    private Boolean adjustableHandleFlag;
    private Boolean largePramBasketFlag;
    private Boolean discontinuedFlag;
    private BigDecimal cheapestPrice;

    @Id
    @Column(name = "PramID")
    public Integer getPramId() {
        return pramId;
    }

    public void setPramId(Integer pramId) {
        this.pramId = pramId;
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
    @Column(name = "ChildCapacity")
    public Integer getChildCapacity() {
        return childCapacity;
    }

    public void setChildCapacity(Integer childCapacity) {
        this.childCapacity = childCapacity;
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
    @Column(name = "RaincoverFlag")
    public Boolean getRaincoverFlag() {
        return raincoverFlag;
    }

    public void setRaincoverFlag(Boolean raincoverFlag) {
        this.raincoverFlag = raincoverFlag;
    }

    @Basic
    @Column(name = "ChangebagFlag")
    public Boolean getChangebagFlag() {
        return changebagFlag;
    }

    public void setChangebagFlag(Boolean changebagFlag) {
        this.changebagFlag = changebagFlag;
    }

    @Basic
    @Column(name = "ParasolFlag")
    public Boolean getParasolFlag() {
        return parasolFlag;
    }

    public void setParasolFlag(Boolean parasolFlag) {
        this.parasolFlag = parasolFlag;
    }

    @Basic
    @Column(name = "MosquitonetFlag")
    public Boolean getMosquitonetFlag() {
        return mosquitonetFlag;
    }

    public void setMosquitonetFlag(Boolean mosquitonetFlag) {
        this.mosquitonetFlag = mosquitonetFlag;
    }

    @Basic
    @Column(name = "CarAdapterFlag")
    public Boolean getCarAdapterFlag() {
        return carAdapterFlag;
    }

    public void setCarAdapterFlag(Boolean carAdapterFlag) {
        this.carAdapterFlag = carAdapterFlag;
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
    @Column(name = "ReversableSeatFlag")
    public Boolean getReversableSeatFlag() {
        return reversableSeatFlag;
    }

    public void setReversableSeatFlag(Boolean reversableSeatFlag) {
        this.reversableSeatFlag = reversableSeatFlag;
    }

    @Basic
    @Column(name = "SturdyFlag")
    public Boolean getSturdyFlag() {
        return sturdyFlag;
    }

    public void setSturdyFlag(Boolean sturdyFlag) {
        this.sturdyFlag = sturdyFlag;
    }

    @Basic
    @Column(name = "CompactFlag")
    public Boolean getCompactFlag() {
        return compactFlag;
    }

    public void setCompactFlag(Boolean compactFlag) {
        this.compactFlag = compactFlag;
    }

    @Basic
    @Column(name = "ComfortFlag")
    public Boolean getComfortFlag() {
        return comfortFlag;
    }

    public void setComfortFlag(Boolean comfortFlag) {
        this.comfortFlag = comfortFlag;
    }

    @Basic
    @Column(name = "MultiTerrainFlag")
    public Boolean getMultiTerrainFlag() {
        return multiTerrainFlag;
    }

    public void setMultiTerrainFlag(Boolean multiTerrainFlag) {
        this.multiTerrainFlag = multiTerrainFlag;
    }

    @Basic
    @Column(name = "AdjustableHandleFlag")
    public Boolean getAdjustableHandleFlag() {
        return adjustableHandleFlag;
    }

    public void setAdjustableHandleFlag(Boolean adjustableHandleFlag) {
        this.adjustableHandleFlag = adjustableHandleFlag;
    }

    @Basic
    @Column(name = "LargePramBasketFlag")
    public Boolean getLargePramBasketFlag() {
        return largePramBasketFlag;
    }

    public void setLargePramBasketFlag(Boolean largePramBasketFlag) {
        this.largePramBasketFlag = largePramBasketFlag;
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
        PramstableEntity that = (PramstableEntity) o;
        return Objects.equals(pramId, that.pramId) && Objects.equals(productName, that.productName) && Objects.equals(brandName, that.brandName) && Objects.equals(image, that.image) && Objects.equals(productDescription, that.productDescription) && Objects.equals(childCapacity, that.childCapacity) && Objects.equals(weight, that.weight) && Objects.equals(length, that.length) && Objects.equals(width, that.width) && Objects.equals(height, that.height) && Objects.equals(ageFromMonths, that.ageFromMonths) && Objects.equals(ageToMonths, that.ageToMonths) && Objects.equals(expertScore, that.expertScore) && Objects.equals(raincoverFlag, that.raincoverFlag) && Objects.equals(changebagFlag, that.changebagFlag) && Objects.equals(parasolFlag, that.parasolFlag) && Objects.equals(mosquitonetFlag, that.mosquitonetFlag) && Objects.equals(carAdapterFlag, that.carAdapterFlag) && Objects.equals(easeOfSetup, that.easeOfSetup) && Objects.equals(reversableSeatFlag, that.reversableSeatFlag) && Objects.equals(sturdyFlag, that.sturdyFlag) && Objects.equals(compactFlag, that.compactFlag) && Objects.equals(comfortFlag, that.comfortFlag) && Objects.equals(multiTerrainFlag, that.multiTerrainFlag) && Objects.equals(adjustableHandleFlag, that.adjustableHandleFlag) && Objects.equals(largePramBasketFlag, that.largePramBasketFlag) && Objects.equals(discontinuedFlag, that.discontinuedFlag) && Objects.equals(cheapestPrice, that.cheapestPrice);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pramId, productName, brandName, image, productDescription, childCapacity, weight, length, width, height, ageFromMonths, ageToMonths, expertScore, raincoverFlag, changebagFlag, parasolFlag, mosquitonetFlag, carAdapterFlag, easeOfSetup, reversableSeatFlag, sturdyFlag, compactFlag, comfortFlag, multiTerrainFlag, adjustableHandleFlag, largePramBasketFlag, discontinuedFlag, cheapestPrice);
    }
}
