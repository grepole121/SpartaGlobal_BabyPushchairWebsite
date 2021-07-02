package com.sparta.eng87.babypushchairwebsite.repositories;

import com.sparta.eng87.babypushchairwebsite.entities.VoucherstableEntity;
import com.sparta.eng87.babypushchairwebsite.entities.VoucherstableEntityPK;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VouchersRepository extends JpaRepository<VoucherstableEntity, VoucherstableEntityPK> {

    @Query ( value = "select * from Voucherstable where vendorId=?",nativeQuery = true)
    List<VoucherstableEntity> getVouchersByVendorID(int vendorId);

}
