package com.valueit.systemegestioncommande.dto;

import lombok.Data;

@Data
public class LigneCommandeDTO {

    private Long id;
    private double dateDebut;
    private double heureDebut ;
    private double dateFin ;
    private double heureFin;
}
