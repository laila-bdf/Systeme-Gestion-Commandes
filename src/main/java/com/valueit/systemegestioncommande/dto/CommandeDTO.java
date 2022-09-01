package com.valueit.systemegestioncommande.dto;

import lombok.Data;

@Data
public class CommandeDTO {

    private Long id;
    private String numeroCmd;
    private String codeCpa;
    private String codeClient;
    private String nomclient;
    private double numeroEscale;
    private String codeNaturePrestation ;
    private double shipLength;

}
