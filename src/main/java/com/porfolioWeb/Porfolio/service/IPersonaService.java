
package com.porfolioWeb.Porfolio.service;

import com.porfolioWeb.Porfolio.model.Persona;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface IPersonaService {
    
    public List<Persona> verPersona();
    public void crearPersona(Persona per);
    public void borrarPersona(Long id);
    public Persona buscarPersona(Long id);
    
}
