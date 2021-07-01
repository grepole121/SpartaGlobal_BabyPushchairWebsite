package com.sparta.eng87.babypushchairwebsite.services;

import com.sparta.eng87.babypushchairwebsite.entities.PramEntity;
import com.sparta.eng87.babypushchairwebsite.repositories.PramRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PramService {

    private PramRepository pramRepository;

    public PramService(PramRepository pramRepository) {
        this.pramRepository = pramRepository;
    }

    public void savePram(PramEntity pramEntity) {
        pramRepository.save(pramEntity);
    }

    public PramEntity findPramById(Integer id) {
        return pramRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("Invalid Product ID " + id)
        );
    }

    public List<PramEntity> findPramsThatMeetCriteria(String location, String storage, String travel, String budget, String infants, String[] accessories, String[] focalPoints, String intTravel, String activity) {
        int MultiTerrainFlag = getMultiTerrainFlag(location, activity); //Where do you live? & Activity BIT
        int CompactFlag = getCompactFlag(storage); // Where stored? & focal point BIT
        int CarAdapterFlag = getCarAdapterFlag(travel); // Mostly travel? & accessory BIT
        double[] budgets = getBudget(budget);
        int[] infantRange = getInfants(infants); // How many infants? INT

        int WeightMax = getMaxWeight(intTravel); // International travel?

        int RaincoverFlag = 0; // Accessory BIT
        int MosquitonetFlag = 0; // Accessory BIT
        int ParasolFlag = 0; // Accessory BIT
        int ChangebagFlag = 0; // Accessory BIT

        for (String accessory : accessories) {
            switch (accessory) {
                case "Rain cover":
                    RaincoverFlag = 1;
                case "Mosquito net":
                    MosquitonetFlag = 1;
                case "Parasol":
                    ParasolFlag = 1;
                case "Car Adapter":
                    CarAdapterFlag = 1;
                case "Changing Bag":
                    ChangebagFlag = 1;
            }
        }

        int EaseOfSetup = 0; // Where stored? & Focal Points BIT

        if (storage.equals("Folded up inside the home")) {
            EaseOfSetup = 1;
        }

        int AgeFromMonths = 1000000; // Focal Points BIT
        int AgeToMonths = 36; // Focal Points BIT
        int ComfortFlag = 0; // Focal Points BIT
        int SturdyFlag = 0; // Focal Points BIT
        int LargePramBasketFlag = 0; // Focal Points BIT

        for (String focalPoint : focalPoints) {
            switch (focalPoint) {
                case "Use from birth":
                    AgeFromMonths = 0;
                case "Adaptable over child's growth":
                    AgeToMonths = 1000000;
                case "Comfort":
                    ComfortFlag = 1;
                case "Sturdiness / Durability":
                    SturdyFlag = 1;
                case "Ease of setup":
                    EaseOfSetup = 1;
                case "Compact":
                    CompactFlag = 1;
                case "Capacity":
                    LargePramBasketFlag = 1;
            }
        }



        return pramRepository.findPramsThatMeetCriteria(MultiTerrainFlag, CompactFlag, CarAdapterFlag,
                budgets[0], budgets[1], infantRange[0], infantRange[1], RaincoverFlag, MosquitonetFlag, ParasolFlag, ChangebagFlag,
                AgeFromMonths, AgeToMonths, ComfortFlag, SturdyFlag, EaseOfSetup, LargePramBasketFlag, WeightMax);
    }

    private int[] getInfants(String infants) {
        int infantsLow = 0;
        int infantsHigh = 1;

        switch (infants) {
            case "1":
                infantsLow = 1;
                infantsHigh = 1;
                break;
            case "2":
                infantsLow = 2;
                infantsHigh = 2;
                break;
            case "more than 2":
                infantsLow = 3;
                infantsHigh = 1500;
                break;
        }
        int[] infantRange = new int[]{infantsLow, infantsHigh};
        return infantRange;
    }


    private double[] getBudget(String budget) {
        double budgetLow = 0;
        double budgetHigh = 500;

        switch (budget) {
            case "0-500":
                budgetLow = 0;
                budgetHigh = 500;
                break;
            case "500-1000":
                budgetLow = 500;
                budgetHigh = 1000;
                break;
            case "1000-1500":
                budgetLow = 1000;
                budgetHigh = 1500;
                break;
            case "1500+":
                budgetLow = 1500;
                budgetHigh = 1000000000;
                break;
        }
        double[] budgets = new double[]{budgetLow, budgetHigh};
        return budgets;
    }

    private int getCarAdapterFlag(String travel) {
        int CarAdapterFlag;
        if (travel.equals("Rental Car")) {
            CarAdapterFlag = 1;
        } else {
            CarAdapterFlag = 0;
        }
        return CarAdapterFlag;
    }

    private int getCompactFlag(String storage) {
        int CompactFlag;
        if ((storage.equals("In the boot of the car")) || (storage.equals("Folded up inside the home"))) {
            CompactFlag = 1;
        } else {
            CompactFlag = 0;
        }
        return CompactFlag;
    }

    private int getMultiTerrainFlag(String location, String activity) {
        int MultiTerrainFlag;
        if ((location.equals("Countryside")) || (activity.equals("Trail walking and exploring")) || (activity.equals("Running with my stroller"))) {
            MultiTerrainFlag = 1;
        } else {
            MultiTerrainFlag = 0;
        }
        return MultiTerrainFlag;
    }

    private int getMaxWeight(String intTravel) {
        int weightMax;
        if (intTravel.equals("Cabin (<7kg)")) {
            weightMax = 7;
        } else {
            weightMax = 1000000;
        }
        return weightMax;
    }
}
