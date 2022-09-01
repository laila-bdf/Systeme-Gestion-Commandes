package com.valueit.systemegestioncommande.repository;

import com.valueit.systemegestioncommande.entity.BulletinPrestation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BulletinPrestationRepo extends JpaRepository<BulletinPrestation, Long> {
}
