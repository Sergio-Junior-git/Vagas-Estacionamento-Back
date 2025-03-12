package com.br.jr.VagasEstacionamento;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.br.jr.VagasEstacionamento.entidades.Vagas;
import com.br.jr.VagasEstacionamento.servicos.VagasService;

@RestController
@RequestMapping("/api/vagas")
@CrossOrigin(origins = "*")
public class VagasController {
     @Autowired
    private VagasService service;

    @GetMapping
    public List<Vagas> listarVagas() {
        return service.listarVagas();
    }

    @PostMapping
    public Vagas salvarVagas(@RequestBody Vagas vagas) {
        return service.salvarVagas(vagas);
    }
    
}
