
package com.porfolioWeb.Porfolio.Controller;

import com.porfolioWeb.Porfolio.model.Educacion;
import com.porfolioWeb.Porfolio.model.Experiencia;
import com.porfolioWeb.Porfolio.model.HardSkill;
import com.porfolioWeb.Porfolio.model.Persona;
import com.porfolioWeb.Porfolio.model.Proyecto;
import com.porfolioWeb.Porfolio.model.Softskill;
import com.porfolioWeb.Porfolio.service.IEducacionService;
import com.porfolioWeb.Porfolio.service.IExperienciaService;
import com.porfolioWeb.Porfolio.service.IHardSkillService;
import com.porfolioWeb.Porfolio.service.IPersonaService;
import com.porfolioWeb.Porfolio.service.IProyectoService;
import com.porfolioWeb.Porfolio.service.ISoftSkillService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    
    @Autowired
    private IPersonaService perServ;
    @Autowired
    private IEducacionService eduServ;
    @Autowired
    private IExperienciaService expeServ;
    @Autowired
    private IProyectoService proServ;
    @Autowired
    private IHardSkillService hardServ;
    @Autowired
    private ISoftSkillService softServ;
        
    //-----------Persona-------------
    
    @PostMapping ("/new/persona")
    public void agregarPersona(@RequestBody Persona pers) {
        perServ.crearPersona(pers);
    }
    
    @GetMapping ("/ver/persona")
    @ResponseBody
    public List<Persona> verPersona() {
        return perServ.verPersona();
    }
    
    @DeleteMapping ("/delete/persona/{id}")
    public void borrarPersona(@PathVariable Long id) {
        perServ.borrarPersona(id);
    }
    
    @PutMapping ("/edit/persona")
    public void editPersona(@RequestBody Persona pers){
        perServ.crearPersona(pers);
    }
    
    @GetMapping ("/persona/{id}")
    @ResponseBody
    public Persona traerPersona(@PathVariable Long id){
        return perServ.buscarPersona(id);
    }
    
    //-----------Educacion------------
    
    @PostMapping ("/new/educacion")
    public void agregarEducacion(@RequestBody Educacion edu) {
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("/ver/educacion")
    @ResponseBody
    public List<Educacion> mostrarEducacion() {
        return eduServ.verEducacion();
    }
    
    @DeleteMapping ("/delete/educacion/{id}")
    public void borrarEducacion(@PathVariable Long id) {
        eduServ.borrarEducacion(id);
    }
    
    @PutMapping ("/edit/educacion")
    public void editEducacion(@RequestBody Educacion edu){
        eduServ.crearEducacion(edu);
    }
    
    @GetMapping ("/educacion/{id}")
    @ResponseBody
    public Educacion traerEducacion(@PathVariable Long id){
        return eduServ.buscarEducacion(id);
    }
    
    //-----------Experiencia------------
    
    @PostMapping ("/new/experiencia")
    public void agregarExperiencia(@RequestBody Experiencia exp) {
        expeServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/ver/experiencia")
    @ResponseBody
    public List<Experiencia> mostrarExperiencia() {
        return expeServ.verExperiencia();
    }
    
    @DeleteMapping ("/delete/experiencia/{id}")
    public void borrarExperiencia(@PathVariable Long id) {
        expeServ.borrarExperiencia(id);
    }
    
    @PutMapping ("/edit/experiencia")
    public void editExperiencia(@RequestBody Experiencia exp){
        expeServ.crearExperiencia(exp);
    }
    
    @GetMapping ("/experiencia/{id}")
    @ResponseBody
    public Experiencia traerExperiencia(@PathVariable Long id){
        return expeServ.buscarExperiencia(id);
    }
    
    //-----------Proyecto-------------
    
    @PostMapping ("/new/proyecto")
    public void agregarProyecto(@RequestBody Proyecto pro) {
        proServ.crearProyecto(pro);
    }
    
    @GetMapping ("/ver/proyecto")
    @ResponseBody
    public List<Proyecto> verProyecto() {
        return proServ.verProyecto();
    }
    
    @DeleteMapping ("/delete/proyecto/{id}")
    public void borrarProyecto(@PathVariable Long id) {
        proServ.borrarProyecto(id);
    }
    
    @PutMapping ("/edit/proyecto")
    public void editProyecto(@RequestBody Proyecto pro){
        proServ.crearProyecto(pro);
    }
    
    @GetMapping ("/proyecto/{id}")
    @ResponseBody
    public Proyecto traerProyecto(@PathVariable Long id){
        return proServ.buscarProyecto(id);
    }
    
    //-----------HardSkill-------------
    
    @PostMapping ("/new/hardskill")
    public void agregarHardSkill(@RequestBody HardSkill hard) {
        hardServ.crearHardSkill(hard);
    }
    
    @GetMapping ("/ver/hardskill")
    @ResponseBody
    public List<HardSkill> verHardSkill() {
        return hardServ.verHardSkill();
    }
    
    @DeleteMapping ("/delete/hardskill/{id}")
    public void borrarHardSkill(@PathVariable Long id) {
        hardServ.borrarHardSkill(id);
    }
    
    @PutMapping ("/edit/hardskill")
    public void editHardSkill(@RequestBody HardSkill hard){
        hardServ.crearHardSkill(hard);
    }
    
    @GetMapping ("/hardskill/{id}")
    @ResponseBody
    public HardSkill traerHardSkill(@PathVariable Long id){
        return hardServ.buscarHardSkill(id);
    }
    
    //-----------SoftSkill-------------
    
    @PostMapping ("/new/softskill")
    public void agregarSoftSkill(@RequestBody Softskill soft) {
        softServ.crearSoftSkill(soft);
    }
    
    @GetMapping ("/ver/softskill")
    @ResponseBody
    public List<Softskill> verSoftSkill() {
        return softServ.verSoftSkill();
    }
    
    @DeleteMapping ("/delete/softskill/{id}")
    public void borrarSoftSkill(@PathVariable Long id) {
        softServ.borrarSoftSkill(id);
    }
    
    @PutMapping ("/edit/softskill")
    public void editSoftSkill(@RequestBody Softskill soft){
        softServ.crearSoftSkill(soft);
    }
    
    @GetMapping ("/softskill/{id}")
    @ResponseBody
    public Softskill traerSoftSkill(@PathVariable Long id){
        return softServ.buscarSoftSkill(id);
    }
    
}
