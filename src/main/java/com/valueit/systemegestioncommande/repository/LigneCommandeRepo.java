package com.valueit.systemegestioncommande.repository;

import com.valueit.systemegestioncommande.entity.LigneCommande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LigneCommandeRepo extends JpaRepository<LigneCommande,Long> {
}
