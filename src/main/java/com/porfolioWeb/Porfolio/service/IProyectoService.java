
package com.porfolioWeb.Porfolio.service;

import com.porfolioWeb.Porfolio.model.Proyecto;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IProyectoService {
    
    public List<Proyecto> verProyecto();
    public void crearProyecto(Proyecto pro);
    public void borrarProyecto(Long id);
    public Proyecto buscarProyecto(Long id);
    
}
