
package com.porfolioWeb.Porfolio.service;

import com.porfolioWeb.Porfolio.model.Softskill;
import com.porfolioWeb.Porfolio.repository.SoftSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftSkillService implements ISoftSkillService{

    @Autowired
    public SoftSkillRepository softServ;
    
    @Override
    public List<Softskill> verSoftSkill() {
        return softServ.findAll();
    }

    @Override
    public void crearSoftSkill(Softskill soft) {
        softServ.save(soft);
    }

    @Override
    public void borrarSoftSkill(Long id) {
        softServ.deleteById(id);
    }

    @Override
    public Softskill buscarSoftSkill(Long id) {
        return softServ.findById(id).orElse(null);
    }
    
}
