package com.valueit.systemegestioncommande.dto;

import lombok.Data;

@Data
public class BulletinPrestationDTO {

    private Long id;
    private String numeroBulletinPrestation;
    private String codeCpa;
    private String codeClient;
    private String nomclient;
    private double numeroEscale;
    private String codeNaturePrestation ;
}
