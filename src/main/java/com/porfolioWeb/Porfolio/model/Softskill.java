
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
public class Softskill {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String etiqueta;
    private int progreso;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Softskill() {
    }

    public Softskill(Long id, String etiqueta, int progreso, Persona persona) {
        this.id = id;
        this.etiqueta = etiqueta;
        this.progreso = progreso;
        this.persona = persona;
    }
    
}
