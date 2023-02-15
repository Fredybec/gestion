package com.example.gestion.dao;

import com.example.gestion.bean.Vol;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface VolDao extends JpaRepository<Vol,Long> {
    Vol findByNumVol(String numVol);
    int deleteByNumVol(String numVol);
    List<Vol> findByDateDepartAndVilleDepartAndVilleArriveeAndHeureDepart(Date dateDepart, String villeDepart, String villeArrivee,String heureDepart);
}
