
package com.porfolioWeb.Porfolio.service;

import com.porfolioWeb.Porfolio.model.Educacion;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IEducacionService {
    
    public List<Educacion> verEducacion();
    public void crearEducacion(Educacion edu);
    public void borrarEducacion(Long id);
    public Educacion buscarEducacion(Long id);
    
}
