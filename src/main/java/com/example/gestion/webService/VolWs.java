package com.example.gestion.webService;

import com.example.gestion.bean.Vol;
import com.example.gestion.service.VolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api/v1/vol")
public class VolWs {
    @Autowired
    private VolService volService;

    @GetMapping("/numVol/{numVol}")
    public Vol findByNumVol(String numVol) {
        return volService.findByNumVol(numVol);
    }
    @DeleteMapping("/delete/numVol/{numVol}")
    @Transactional
    public int deleteByNumVol(String numVol) {
        return volService.deleteByNumVol(numVol);
    }
    @GetMapping("/")
    public List<Vol> findByDateDepartAndVilleDepartAndVilleArriveeAndHeureDepart(@RequestBody Vol vol) {
        return volService.findByDateDepartAndVilleDepartAndVilleArriveeAndHeureDepart(vol);
    }
    @PostMapping("/")
    public int save(@RequestBody Vol vol) {
        return volService.save(vol);
    }
}
