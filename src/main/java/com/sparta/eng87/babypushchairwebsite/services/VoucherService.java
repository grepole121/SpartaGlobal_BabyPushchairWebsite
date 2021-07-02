package com.sparta.eng87.babypushchairwebsite.services;

import com.sparta.eng87.babypushchairwebsite.entities.VendorpramtableEntity;
import com.sparta.eng87.babypushchairwebsite.entities.VendorstableEntity;
import com.sparta.eng87.babypushchairwebsite.entities.VoucherstableEntity;
import com.sparta.eng87.babypushchairwebsite.repositories.VendorPramRepository;
import com.sparta.eng87.babypushchairwebsite.repositories.VendorsRepository;
import com.sparta.eng87.babypushchairwebsite.repositories.VouchersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VoucherService {

    private VendorPramRepository vendorPramRepository;
    private VouchersRepository vouchers;
    private VendorsRepository vendors;

    @Autowired
    public VoucherService(VendorPramRepository vendorPramRepository, VouchersRepository vouchers,VendorsRepository vendors) {
        this.vendorPramRepository = vendorPramRepository;
        this.vouchers = vouchers;
        this.vendors=vendors;
    }

    public List<VendorpramtableEntity> getAllVendorsOfAPram(int pramID){
        return vendorPramRepository.getAllByPramId(pramID);
    }

    public List<VoucherstableEntity> getAllVouchersForVendor(int vendorID){
       return vouchers.getVouchersByVendorID(vendorID);
    }

    public List<VendorstableEntity> getVendorByID(int vendorID){
        return vendors.getVendorsByVendorID(vendorID);
    }


}
