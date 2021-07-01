package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class AssociateditemstableEntityPK implements Serializable {
    private Integer pramId;
    private Integer seatId;

    @Column(name = "PramID")
    @Id
    public Integer getPramId() {
        return pramId;
    }

    public void setPramId(Integer pramId) {
        this.pramId = pramId;
    }

    @Column(name = "SeatID")
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
        AssociateditemstableEntityPK that = (AssociateditemstableEntityPK) o;
        return Objects.equals(pramId, that.pramId) && Objects.equals(seatId, that.seatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pramId, seatId);
    }
}
