package com.valueit.systemegestioncommande.repository;

import com.valueit.systemegestioncommande.entity.LignePrestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LignePrestationRepo extends JpaRepository<LignePrestation,Long> {
}
