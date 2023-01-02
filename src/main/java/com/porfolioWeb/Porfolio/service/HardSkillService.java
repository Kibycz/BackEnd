
package com.porfolioWeb.Porfolio.service;

import com.porfolioWeb.Porfolio.model.HardSkill;
import com.porfolioWeb.Porfolio.repository.HardSkillRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HardSkillService implements IHardSkillService{
    
    @Autowired
    public HardSkillRepository hardServ;

    @Override
    public List<HardSkill> verHardSkill() {
        return hardServ.findAll();
    }

    @Override
    public void crearHardSkill(HardSkill hard) {
        hardServ.save(hard);
    }

    @Override
    public void borrarHardSkill(Long id) {
        hardServ.deleteById(id);
    }

    @Override
    public HardSkill buscarHardSkill(Long id) {
        return hardServ.findById(id).orElse(null);
    }
    
        
}
