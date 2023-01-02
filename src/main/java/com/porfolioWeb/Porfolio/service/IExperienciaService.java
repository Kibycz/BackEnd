
package com.porfolioWeb.Porfolio.service;

import com.porfolioWeb.Porfolio.model.Experiencia;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IExperienciaService {
    
    public List<Experiencia> verExperiencia();
    public void crearExperiencia(Experiencia exp);
    public void borrarExperiencia(Long id);
    public Experiencia buscarExperiencia(Long id);
    
}
