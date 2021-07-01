package com.sparta.eng87.babypushchairwebsite.repositories;

import com.sparta.eng87.babypushchairwebsite.entities.PramstableEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PramRepository extends JpaRepository<PramstableEntity, Integer> {
}
