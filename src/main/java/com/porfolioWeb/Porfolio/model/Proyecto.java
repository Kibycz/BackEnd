
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
public class Proyecto {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String descripcion;
    private String urlImage;
    private String periodo;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Proyecto() {
    }

    public Proyecto(Long id, String nombre, String descripcion, String urlImage, String periodo, Persona persona) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImage = urlImage;
        this.periodo = periodo;
        this.persona = persona;
    }
    
}
