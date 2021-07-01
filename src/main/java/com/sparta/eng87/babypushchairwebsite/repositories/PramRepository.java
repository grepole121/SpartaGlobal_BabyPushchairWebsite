package com.sparta.eng87.babypushchairwebsite.repositories;

import com.sparta.eng87.babypushchairwebsite.entities.PramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PramRepository extends JpaRepository<PramEntity, Integer>{

//    ReversableSeatFlag, , ,, AdjustableHandleFlag  --------- Not asked in questionnaire?

    @Query(value = "SELECT p.* FROM pramstable p WHERE p.DiscontinuedFlag!=1 " +
            "AND p.MultiTerrainFlag=?1 " +
            "AND p.CompactFlag=?1 " +
            "AND p.CarAdapterFlag=?1" +
            "AND p.CheapestPrice BETWEEN ? AND ?" +
            "AND p.ChildCapacity BETWEEN ? AND ?" +
            "AND p.RaincoverFlag=?1" +
            "AND p.MosquitonetFlag=?1" +
            "AND p.ParasolFlag=?1" +
            "AND p.ChangebagFlag=?1" +
            "AND p.AgeFromMonths<=?1" +
            "AND p.AgeToMonths>=?1" +
            "AND p.ComfortFlag=?1" +
            "AND p.SturdyFlag=?1" +
            "AND p.EaseOfSetup=?1" +
            "AND p.LargePramBasketFlag=?1" +
            "AND p.Weight < ?"
            , nativeQuery = true)
    List<PramEntity> findPramsThatMeetCriteria(int MultiTerrainFlag, //Where do you live? & Activity BIT
                                        int CompactFlag, // Where stored? & focal point BIT
                                        int CarAdapterFlag, // Mostly travel? & accessory BIT
                                        double budgetLow, // Budget? DEC
                                        double budgetHigh, // Budget? DEC
                                        int infantsLow, // How many infants? INT
                                        int infantsHigh, // How many infants? INT
                                        int RaincoverFlag, // Accessory BIT
                                        int MosquitonetFlag, // Accessory BIT
                                        int ParasolFlag, // Accessory BIT
                                        int ChangebagFlag, // Accessory BIT
                                        int AgeFromMonths, // Focal Points BIT
                                        int AgeToMonths, // Focal Points BIT
                                        int ComfortFlag, // Focal Points BIT
                                        int SturdyFlag, // Focal Points BIT
                                        int EaseOfSetup, // Focal Points BIT
                                        int LargePramBasketFlag, // Focal Points BIT
                                        int WeightMax); // International travel?
}
