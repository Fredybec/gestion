package com.example.gestion.bean;

import org.hibernate.annotations.Cascade;

import javax.persistence.*;
import java.util.Date;
@Entity
public class Passager {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPassager;
    private String nom;
    private String prenom;
    private Date dateDeNaissance;
    private String gsm;

    @OneToOne
    private Billet billet;

    public Long getIdPassager() {
        return idPassager;
    }

    public void setIdPassager(Long idPassager) {
        this.idPassager = idPassager;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(Date dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public String getGsm() {
        return gsm;
    }

    public void setGsm(String gsm) {
        this.gsm = gsm;
    }

    public Billet getBillet() {
        return billet;
    }

    public void setBillet(Billet billet) {
        this.billet = billet;
    }
}
