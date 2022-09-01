package com.valueit.systemegestioncommande.repository;

import com.valueit.systemegestioncommande.entity.Commande;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommandesRepo extends JpaRepository<Commande, Long> {
}
