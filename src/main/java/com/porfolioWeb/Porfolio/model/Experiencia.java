package com.porfolioWeb.Porfolio.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String empresa;
    private String puesto;
    private String periodo;
    private String tarea;
    private String url;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Experiencia() {
    }

    public Experiencia(Long id, String empresa, String puesto, String periodo, String tarea, String url, Persona persona) {
        this.id = id;
        this.empresa = empresa;
        this.puesto = puesto;
        this.periodo = periodo;
        this.tarea = tarea;
        this.url = url;
        this.persona = persona;
    }
    
}
