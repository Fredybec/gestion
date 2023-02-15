package com.example.gestion.webService;

import com.example.gestion.bean.Avion;
import com.example.gestion.service.AvionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping("api/v1/avion")
public class AvionWs {
    @Autowired
    private AvionService avionService;

    @GetMapping("/findall")
    public List<Avion> findAll() {
        return avionService.findAll();
    }
    @GetMapping("/codeAvion/{codeAvion}")
    public Avion findByCodeAvion(@PathVariable String codeAvion) {
        return avionService.findByCodeAvion(codeAvion);
    }

    @DeleteMapping("/codeAvion/{codeAvion}")
    @Transactional
    public int deleteByCodeAvion(@PathVariable String codeAvion) {
        return avionService.deleteByCodeAvion(codeAvion);
    }
    @GetMapping("/id/{idAvion}")
    public Avion findByidAvion(@PathVariable Long idAvion) {
        return avionService.findByidAvion(idAvion);
    }

    @PostMapping("/")
    public int save(@RequestBody Avion avion) {
        return avionService.save(avion);
    }
}
