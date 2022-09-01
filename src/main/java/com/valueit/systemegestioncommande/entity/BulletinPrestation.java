package com.valueit.systemegestioncommande.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class BulletinPrestation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String numeroBulletinPrestation;
    private String codeCpa;
    private String codeClient;
    private String codeOperation;
    private String nomclient;
    private double numeroEscale;
    private String codeOperation1;
    private String codeOperation2;
    private String codeOperation3;
    private String codeNaturePrestation ;
    private String bulltinAnnule ;
    private String codeCauseAnnulation;
    private String numeroFacture;
    private double dateLimiteFacture;

    @OneToMany(mappedBy = "bulletinPrestation")
    private List<Commande> mesCommande=new ArrayList<Commande>();

    @OneToMany(mappedBy = "bulletinPrestation")
    private List<LignePrestation> lignePrestations=new ArrayList<LignePrestation>();

}
