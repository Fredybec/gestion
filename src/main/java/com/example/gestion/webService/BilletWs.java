package com.example.gestion.webService;

import com.example.gestion.service.BilletService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/billet")
public class BilletWs {
    @Autowired
    private BilletService billetService;

}
