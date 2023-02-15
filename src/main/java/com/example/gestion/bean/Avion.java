package com.example.gestion.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Avion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAvion;
    private String codeAvion;
    private String typeAvion;
    private String modeleAvion;
    private int nbPassagers;

    public Long getIdAvion() {
        return idAvion;
    }

    public void setIdAvion(Long idAvion) {
        this.idAvion = idAvion;
    }

    public String getCodeAvion() {
        return codeAvion;
    }

    public void setCodeAvion(String codeAvion) {
        this.codeAvion = codeAvion;
    }

    public String getTypeAvion() {
        return typeAvion;
    }

    public void setTypeAvion(String typeAvion) {
        this.typeAvion = typeAvion;
    }

    public String getModeleAvion() {
        return modeleAvion;
    }

    public void setModeleAvion(String modeleAvion) {
        this.modeleAvion = modeleAvion;
    }

    public int getNbPassagers() {
        return nbPassagers;
    }

    public void setNbPassagers(int nbPassagers) {
        this.nbPassagers = nbPassagers;
    }
}
