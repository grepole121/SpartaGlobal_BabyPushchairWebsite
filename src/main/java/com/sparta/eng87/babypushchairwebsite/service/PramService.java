package com.sparta.eng87.babypushchairwebsite.service;

import com.sparta.eng87.babypushchairwebsite.entities.PramstableEntity;
import com.sparta.eng87.babypushchairwebsite.repositories.PramRepository;
import org.springframework.stereotype.Service;

@Service
public class PramService {

    private PramRepository pramRepository;

    public PramService(PramRepository pramRepository) {
        this.pramRepository = pramRepository;
    }

    public Iterable<PramstableEntity> getAllPrams() {
        return pramRepository.findAll();
    }
}
