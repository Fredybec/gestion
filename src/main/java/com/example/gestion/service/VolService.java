package com.example.gestion.service;

import com.example.gestion.bean.Avion;
import com.example.gestion.bean.Vol;
import com.example.gestion.dao.VolDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@Service
public class VolService {
    @Autowired
    private VolDao volDao;
    @Autowired
    private AvionService avionService;

    public Vol findByNumVol(String numVol) {
        return volDao.findByNumVol(numVol);
    }
    @Transactional
    public int deleteByNumVol(String numVol) {
        return volDao.deleteByNumVol(numVol);
    }

    public List<Vol> findByDateDepartAndVilleDepartAndVilleArriveeAndHeureDepart(Vol vol) {
        return volDao.findByDateDepartAndVilleDepartAndVilleArriveeAndHeureDepart(vol.getDateDepart(),vol.getVilleDepart(),vol.getVilleArrivee(),vol.getHeureDepart());
    }
    public int save(Vol vol){
        Avion foundedAvion = avionService.findByCodeAvion(vol.getAvion().getCodeAvion());
        Vol founded = findByNumVol(vol.getNumVol());
        if (founded != null){
            return -1;
        } else if (vol.getDateDepart() == null || vol.getDateArrivee() == null) {
            return -2;
        } else if (vol.getVilleDepart() == null || vol.getVilleArrivee()==null) {
            return -3;
        } else if (vol.getDateDepart().getTime() > vol.getDateArrivee().getTime()) {
            return -4;
        } else if (vol.getHeureDepart() == null || vol.getHeureArrivee()==null) {
            return -5;
        }else {
            vol.setAvion(foundedAvion);
            volDao.save(vol);
            return 1;

        }
    }
}
