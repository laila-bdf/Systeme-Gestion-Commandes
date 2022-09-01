package com.valueit.systemegestioncommande.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class MouvementPrestation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String codePrestation;
    private String codeMouvement;
    private String libellePrestation;
    private String libelleMouvement;

    @OneToMany(mappedBy = "mouvementPrestation")
    private List<LigneCommande> ligneCommandeList = new ArrayList<LigneCommande>();
}
