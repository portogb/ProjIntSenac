package com.senac.grupocinco.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "acompanhamento")
public class Acompanhamento {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private Date inicio;

    // private Date finalizacao;

    private Integer status;

    private Participante participante;

    private AvaliacaoConceito avaliacaoConceito;

    private Atividade atividade;

    private ObjetoAprendizagem objetoAprendizagem;

    private SituacaoAprendizagem situacaoAprendizagem;

    private Badge badge;

    // private Date acompanhamentoDataBadge;

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

    public Atividade getAtividade() {
        return atividade;
    }

    public void setAtividade(Atividade atividade) {
        this.atividade = atividade;
    }

    public ObjetoAprendizagem getObjetoAprendizagem() {
        return objetoAprendizagem;
    }

    public void setObjetoAprendizagem(ObjetoAprendizagem objetoAprendizagem) {
        this.objetoAprendizagem = objetoAprendizagem;
    }

    public SituacaoAprendizagem getSituacaoAprendizagem() {
        return situacaoAprendizagem;
    }

    public void setSituacaoAprendizagem(SituacaoAprendizagem situacaoAprendizagem) {
        this.situacaoAprendizagem = situacaoAprendizagem;
    }

    public Badge getBadge() {
        return badge;
    }

    public void setBadge(Badge badge) {
        this.badge = badge;
    }
    
}
