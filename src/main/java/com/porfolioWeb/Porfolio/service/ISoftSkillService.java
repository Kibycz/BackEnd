
package com.porfolioWeb.Porfolio.service;

import com.porfolioWeb.Porfolio.model.Softskill;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface ISoftSkillService {
    
    public List<Softskill> verSoftSkill();
    public void crearSoftSkill(Softskill soft);
    public void borrarSoftSkill(Long id);
    public Softskill buscarSoftSkill(Long id);
    
    
}
