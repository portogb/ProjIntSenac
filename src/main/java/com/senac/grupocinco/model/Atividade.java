package com.senac.grupocinco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "atividade")
public class Atividade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;

    //private Date dataInicio;

    private Integer minutos;

    private Integer ordem;

    private Integer status;

    private SituacaoAprendizagem situacaoAprendizagem;

    private AtividadeTipo atividadeTipo;

    private GrauDificuldade grauDificuldade;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getMinutos() {
        return minutos;
    }

    public void setMinutos(Integer minutos) {
        this.minutos = minutos;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public SituacaoAprendizagem getSituacaoAprendizagem() {
        return situacaoAprendizagem;
    }

    public void setSituacaoAprendizagem(SituacaoAprendizagem situacaoAprendizagem) {
        this.situacaoAprendizagem = situacaoAprendizagem;
    }

    public AtividadeTipo getAtividadeTipo() {
        return atividadeTipo;
    }

    public void setAtividadeTipo(AtividadeTipo atividadeTipo) {
        this.atividadeTipo = atividadeTipo;
    }

    public GrauDificuldade getGrauDificuldade() {
        return grauDificuldade;
    }

    public void setGrauDificuldade(GrauDificuldade grauDificuldade) {
        this.grauDificuldade = grauDificuldade;
    }
    
}
