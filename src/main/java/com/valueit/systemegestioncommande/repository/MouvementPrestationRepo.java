package com.valueit.systemegestioncommande.repository;

import com.valueit.systemegestioncommande.entity.MouvementPrestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MouvementPrestationRepo extends JpaRepository<MouvementPrestation,Long> {
}
