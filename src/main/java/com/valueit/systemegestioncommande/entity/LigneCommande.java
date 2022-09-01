package com.valueit.systemegestioncommande.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class LigneCommande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codeCpa;
    private String numeroDossier;
    private String numeroBonCommande;
    private double numeroOrdrePrestation ;

    private double codePrestation ;
    private String libellePrestation;

    private double dateDebut;
    private double heureDebut ;
    private double dateFin ;
    private double heureFin;
    private double poids;
    private double quantite1;
    private double quantite2;
    private String importExport;
    private String numeroDeclaration;

    private boolean isGenerated;
    private boolean isDeleted;
    private boolean isSelected;

    @ManyToOne
    private Commande commande;

    @ManyToOne
    private MouvementPrestation mouvementPrestation;

}
