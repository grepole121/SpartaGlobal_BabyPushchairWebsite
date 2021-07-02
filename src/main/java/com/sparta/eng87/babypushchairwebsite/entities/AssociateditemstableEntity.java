package com.sparta.eng87.babypushchairwebsite.entities;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "associateditemstable", schema = "Prams", catalog = "")
@IdClass(AssociateditemstableEntityPK.class)
public class AssociateditemstableEntity {
    private Integer pramId;
    private Integer seatId;

    @Id
    @Column(name = "PramID")
    public Integer getPramId() {
        return pramId;
    }

    public void setPramId(Integer pramId) {
        this.pramId = pramId;
    }

    @Id
    @Column(name = "SeatID")
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
        AssociateditemstableEntity that = (AssociateditemstableEntity) o;
        return Objects.equals(pramId, that.pramId) && Objects.equals(seatId, that.seatId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pramId, seatId);
    }
}
