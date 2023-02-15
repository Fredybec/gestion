package com.example.gestion.webService;

import com.example.gestion.bean.Passager;
import com.example.gestion.service.PassagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/passager")
public class PassagerWs {
    @Autowired
    private PassagerService passagerService;

    @PostMapping("/")
    public int save(@RequestBody Passager passager) {
        return passagerService.save(passager);
    }
}
