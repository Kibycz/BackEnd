
package com.porfolioWeb.Porfolio.model;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Persona {
    
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    
    private String nombre;
    private String perfil;
    private String titulo;
    private String image;
    private String banner;
    
    @JsonManagedReference
    @OneToMany(mappedBy="persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Educacion> listaEducacion;
    
    @JsonManagedReference
    @OneToMany(mappedBy="persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Experiencia> listaExperiencia;
    
    @JsonManagedReference
    @OneToMany(mappedBy="persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Proyecto> listaProyecto;
    
    @JsonManagedReference
    @OneToMany(mappedBy="persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<HardSkill> listaHardSkill;
    
    @JsonManagedReference
    @OneToMany(mappedBy="persona", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Softskill> listaSoftSkill;

    public Persona() {
    }

    public Persona(long id, String nombre, String perfil, String titulo, String image, String banner, Set<Educacion> listaEducacion, Set<Experiencia> listaExperiencia, Set<Proyecto> listaProyecto, Set<HardSkill> listaHardSkill, Set<Softskill> listaSoftSkill) {
        this.id = id;
        this.nombre = nombre;
        this.perfil = perfil;
        this.titulo = titulo;
        this.image = image;
        this.banner = banner;
        this.listaEducacion = listaEducacion;
        this.listaExperiencia = listaExperiencia;
        this.listaProyecto = listaProyecto;
        this.listaHardSkill = listaHardSkill;
        this.listaSoftSkill = listaSoftSkill;
    }

   

                    
}
