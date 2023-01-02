
package com.porfolioWeb.Porfolio.service;

import com.porfolioWeb.Porfolio.model.HardSkill;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public interface IHardSkillService {
    
    public List<HardSkill> verHardSkill();
    public void crearHardSkill(HardSkill hard);
    public void borrarHardSkill(Long id);
    public HardSkill buscarHardSkill(Long id);
    
}
