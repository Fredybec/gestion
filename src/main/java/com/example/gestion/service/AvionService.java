package com.example.gestion.service;

import com.example.gestion.bean.Avion;
import com.example.gestion.dao.AvionDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AvionService {
    @Autowired
    private AvionDao avionDao;

    public List<Avion> findAll() {
        return avionDao.findAll();
    }

    public Avion findByCodeAvion(String codeAvion) {
        return avionDao.findByCodeAvion(codeAvion);
    }
    @Transactional
    public int deleteByCodeAvion(String codeAvion) {
        return avionDao.deleteByCodeAvion(codeAvion);
    }

    public Avion findByidAvion(Long idAvion) {
        return avionDao.findByidAvion(idAvion);
    }
    public int save(Avion avion){
        Avion founded = findByCodeAvion(avion.getCodeAvion());
        if (founded != null){
            return -1;
        }else{
            avionDao.save(avion);
            return 1;
        }
    }
}
