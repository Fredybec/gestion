package com.example.gestion.dao;

import com.example.gestion.bean.Billet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BilletDao extends JpaRepository<Billet,Long> {
    List<Billet> findByVolNumVol(String numVol);
}
