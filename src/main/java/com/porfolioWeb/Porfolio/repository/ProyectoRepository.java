
package com.porfolioWeb.Porfolio.repository;

import com.porfolioWeb.Porfolio.model.Proyecto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProyectoRepository extends JpaRepository<Proyecto, Long>{
    
}
