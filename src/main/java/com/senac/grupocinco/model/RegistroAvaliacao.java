package com.senac.grupocinco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registro_avaliacao")
public class RegistroAvaliacao {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private Date data;

    private Integer status;

    private AvaliacaoTipo avaliacaoTipo;

    private Participante participante;

    private AvaliacaoConceito avaliacaoConceito;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public AvaliacaoTipo getAvaliacaoTipo() {
        return avaliacaoTipo;
    }

    public void setAvaliacaoTipo(AvaliacaoTipo avaliacaoTipo) {
        this.avaliacaoTipo = avaliacaoTipo;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public AvaliacaoConceito getAvaliacaoConceito() {
        return avaliacaoConceito;
    }

    public void setAvaliacaoConceito(AvaliacaoConceito avaliacaoConceito) {
        this.avaliacaoConceito = avaliacaoConceito;
    }
}
