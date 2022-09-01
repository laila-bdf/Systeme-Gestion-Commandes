package com.valueit.systemegestioncommande.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Commande {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroCmd;
    private String numeroBulletinPrestation;
    private String codeCpa;
    private String codeOperation;
    private String codeClient;
    private String nomclient;
    private double numeroEscale;
    private String codeOperation1;
    private String codeOperation2;
    private String codeOperation3;
    private String codeNaturePrestation ;
    private String bulltinAnnule ;
    private String codeCauseAnnulation ;
    private String numeroFacture;
    private double dateLimiteFacture;
    private String status;
    private double shipLength;

    private boolean isValidateApproved ;
    private boolean  isCancelApproved;
    private boolean isDeleted;
    private boolean isGenerated;
    private boolean  send;

    @OneToMany(mappedBy = "commande")
    private List<LigneCommande> mesLignecommandes = new ArrayList<LigneCommande>();

    @ManyToOne
    private BulletinPrestation bulletinPrestation;

}
