package com.sparta.eng87.babypushchairwebsite.repositories;

import com.sparta.eng87.babypushchairwebsite.entities.VendorstableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendorsRepository extends JpaRepository<VendorstableEntity,Integer> {
    @Query(value="select * from vendorstable Where vendor_id=?", nativeQuery = true)
    List<VendorstableEntity> getVendorsByVendorID(int vendorID);
}
