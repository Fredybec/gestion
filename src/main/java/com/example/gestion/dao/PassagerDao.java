package com.example.gestion.dao;

import com.example.gestion.bean.Passager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PassagerDao extends JpaRepository<Passager,Long> {
    List<Passager>findByNom(String nom);
}
