
package com.porfolioWeb.Porfolio.service;

import com.porfolioWeb.Porfolio.model.Proyecto;
import com.porfolioWeb.Porfolio.repository.ProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProyectoService implements IProyectoService{
    
    @Autowired
    public ProyectoRepository proServ;

    @Override
    public List<Proyecto> verProyecto() {
        return proServ.findAll();
    }

    @Override
    public void crearProyecto(Proyecto pro) {
        proServ.save(pro);
    }

    @Override
    public void borrarProyecto(Long id) {
        proServ.deleteById(id);
    }

    @Override
    public Proyecto buscarProyecto(Long id) {
        return proServ.findById(id).orElse(null);
    }
    
}
