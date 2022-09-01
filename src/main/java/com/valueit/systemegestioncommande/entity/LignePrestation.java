package com.valueit.systemegestioncommande.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class LignePrestation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroDossier;
    private String codeCpa;
    private String numeroBonCommande;
    private double numeroOrdrePrestation ;
    private double codePrestation ;
    private double dateDebut;
    private double heureDebut ;
    private double dateFin ;
    private double heureFin;
    private double poids;
    private double quantite1;
    private double quantite2;
    private String importExport;
    private String numeroDeclaration;

    @ManyToOne
    private BulletinPrestation bulletinPrestation;

}
