package com.br.jr.VagasEstacionamento.repositorio;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.br.jr.VagasEstacionamento.entidades.Vagas;


@Repository
public interface VagasRepository extends JpaRepository<Vagas, Long>  {

    
}
