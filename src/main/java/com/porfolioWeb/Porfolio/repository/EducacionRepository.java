
package com.porfolioWeb.Porfolio.repository;

import com.porfolioWeb.Porfolio.model.Educacion;;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository <Educacion, Long>{
    
}
