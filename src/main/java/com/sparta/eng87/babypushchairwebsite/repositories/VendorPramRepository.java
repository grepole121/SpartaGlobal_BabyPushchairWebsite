package com.sparta.eng87.babypushchairwebsite.repositories;

import com.sparta.eng87.babypushchairwebsite.entities.VendorpramtableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VendorPramRepository extends JpaRepository<VendorpramtableEntity,Integer> {

    @Query(value = "SELECT * FROM Vendorpramtable WHERE PramID=?", nativeQuery = true)
   List<VendorpramtableEntity> getAllByPramId(int PramID);
}
