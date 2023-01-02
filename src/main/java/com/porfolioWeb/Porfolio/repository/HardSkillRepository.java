
package com.porfolioWeb.Porfolio.repository;

import com.porfolioWeb.Porfolio.model.HardSkill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HardSkillRepository extends JpaRepository <HardSkill, Long>{
    
}
