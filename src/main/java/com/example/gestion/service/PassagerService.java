package com.example.gestion.service;

import com.example.gestion.bean.Billet;
import com.example.gestion.bean.Passager;
import com.example.gestion.bean.Vol;
import com.example.gestion.dao.PassagerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PassagerService {
    @Autowired
    private PassagerDao passagerDao;
    @Autowired
    private VolService volService;
    @Autowired
    private BilletService billetService;

    public List<Passager> findByNom(String nom) {
        return passagerDao.findByNom(nom);
    }

    public int save(Passager passager) {
        Vol foundedVol = volService.findByNumVol(passager.getBillet().getVol().getNumVol());
        if (billetService.findByVolNumVol(foundedVol.getNumVol()).size() >= foundedVol.getAvion().getNbPassagers()) {
            return -1;
        }else {
            Billet billet = new Billet();
            billetService.save(billet);
            billet.setDateEmission(new Date());
            billet.setDatePaiement(new Date());
            billet.setVol(foundedVol);
            passager.setBillet(billet);
            passagerDao.save(passager);
            billet.setPassager(passager);
            billetService.save(billet);
            return 1;
        }
    }
}
