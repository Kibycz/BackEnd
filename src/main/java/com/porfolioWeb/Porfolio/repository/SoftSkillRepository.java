
package com.porfolioWeb.Porfolio.repository;

import com.porfolioWeb.Porfolio.model.Softskill;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftSkillRepository extends JpaRepository <Softskill, Long>{
    
}
