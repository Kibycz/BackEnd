package com.porfolioWeb.Porfolio;

/*import com.porfolioWeb.Porfolio.Controller.Controller;
import com.porfolioWeb.Porfolio.model.Educacion;
import com.porfolioWeb.Porfolio.model.Persona;
import java.util.ArrayList;
import java.util.List;*/
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PorfolioApplication {

	public static void main(String[] args) {
		SpringApplication.run(PorfolioApplication.class, args);
                
                /*Controller contro = new Controller();
                List<Educacion> listaEducacion = new ArrayList();
                Persona perso = new Persona();
                contro.agregarPersona(perso);
                Educacion edu = new Educacion();
                contro.agregarEducacion(edu);
                listaEducacion.add(edu);
                perso.setListaEducacion(listaEducacion);
                contro.editEducacion(edu);*/
                
	}

}
