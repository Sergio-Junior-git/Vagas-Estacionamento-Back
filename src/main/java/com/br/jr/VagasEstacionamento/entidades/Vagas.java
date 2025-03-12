package com.br.jr.VagasEstacionamento.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "vagas")
public class Vagas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String numero;
    private String tipo;
    private String valorporhora;
    private String estatos;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getValorporhora() {
        return valorporhora;
    }
    public void setValorporhora(String valorporhora) {
        this.valorporhora = valorporhora;
    }
    public String getEstatos() {
        return estatos;
    }
    public void setEstatos(String estatos) {
        this.estatos = estatos;
    }

    
 
}
