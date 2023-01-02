
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
public class Educacion {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String nombreIntitucion;
    private String titulo;
    private String urlImage;
    private String periodo;
    
    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "persona_id")
    private Persona persona;

    public Educacion() {
    }

    public Educacion(Long id, String nombreIntitucion, String titulo, String urlImage, String periodo, Persona persona) {
        this.id = id;
        this.nombreIntitucion = nombreIntitucion;
        this.titulo = titulo;
        this.urlImage = urlImage;
        this.periodo = periodo;
        this.persona = persona;
    }

}
