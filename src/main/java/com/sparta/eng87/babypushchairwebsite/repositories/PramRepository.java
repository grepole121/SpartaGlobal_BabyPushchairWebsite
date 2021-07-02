package com.sparta.eng87.babypushchairwebsite.repositories;

import com.sparta.eng87.babypushchairwebsite.entities.PramEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PramRepository extends JpaRepository<PramEntity, Integer>{

    String variable = "SELECT p.* FROM pramstable p";
//    ReversableSeatFlag, , ,, AdjustableHandleFlag  --------- Not asked in questionnaire?

    @Query(value = "SELECT p.* FROM pramstable p WHERE p.discontinued_flag!=1 " +
            "AND (p.multi_terrain_flag OR NOT ?1) " +
            "AND (p.compact_flag OR NOT ?2) " +
            "AND (p.Car_Adapter_Flag OR NOT ?3) " +
            "AND (p.Cheapest_Price BETWEEN ?4 AND ?5) " +
            "AND (p.Child_Capacity BETWEEN ?6 AND ?7) " +
            "AND (p.Raincover_Flag OR NOT ?8) " +
            "AND (p.Mosquitonet_Flag OR NOT ?9) " +
            "AND (p.Parasol_Flag OR NOT ?10) " +
            "AND (p.Changebag_Flag OR NOT ?11) " +
            "AND (p.Age_From_Months<=?12) " +
            "AND (p.Age_To_Months>=?13) " +
            "AND (p.Comfort_Flag OR NOT ?14) " +
            "AND (p.Sturdy_Flag OR NOT ?15) " +
            "AND (p.Ease_Of_Setup OR NOT ?16) " +
            "AND (p.Large_Pram_Basket_Flag OR NOT ?17) " +
            "AND p.Weight < ?18"
            , nativeQuery = true)
    List<PramEntity> findPramsThatMeetCriteria(int MultiTerrainFlag,//Where do you live? & Activity BIT
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
