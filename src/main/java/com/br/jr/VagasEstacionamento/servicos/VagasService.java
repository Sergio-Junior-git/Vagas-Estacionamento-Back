package com.br.jr.VagasEstacionamento.servicos;

import org.springframework.stereotype.Service;
import com.br.jr.VagasEstacionamento.entidades.Vagas;
import com.br.jr.VagasEstacionamento.repositorio.VagasRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class VagasService {
    @Autowired
    private VagasRepository repository;

    public List<Vagas> listarVagas() {
        return repository.findAll();
    }

    public Vagas salvarVagas(Vagas vagas) {
        return repository.save(vagas);
    }
}
