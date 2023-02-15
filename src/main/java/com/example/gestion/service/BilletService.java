package com.example.gestion.service;

import com.example.gestion.bean.Billet;
import com.example.gestion.dao.BilletDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BilletService {
    @Autowired
    private BilletDao billetDao;

    public List<Billet> findByVolNumVol(String numVol) {
        return billetDao.findByVolNumVol(numVol);
    }
    public int save(Billet billet){
        billetDao.save(billet);
        return 1;
    }
}
