package com.example.gestion.dao;

import com.example.gestion.bean.Avion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvionDao extends JpaRepository<Avion,Long> {
    Avion findByCodeAvion(String codeAvion);
    int deleteByCodeAvion(String codeAvion);
    Avion findByidAvion(Long idAvion);
}
