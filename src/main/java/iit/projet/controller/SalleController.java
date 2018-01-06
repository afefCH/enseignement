package iit.projet.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import iit.projet.model.Salle;
import iit.projet.service.SalleService;

@RestController
@RequestMapping(value = "/salle")
public class SalleController {

	@Autowired
	private SalleService salleService;
	
	@RequestMapping(value = "/salles", method = RequestMethod.GET)
	public List getAllSalles() {
		
		return salleService.getAllSalles();
		
	}
	
	@RequestMapping(value = "/salles/{id}", method = RequestMethod.GET)
	public Salle getSalle(@PathVariable long id) {
		return salleService.getSalle(id);
	}
	
	@RequestMapping(value = "/salles", method = RequestMethod.POST)
	public void addSalle(@RequestBody Salle salle) {
		salleService.addSalle(salle);
		
	}
	
	@RequestMapping(value = "/salles/{id}", method = RequestMethod.PUT)
	public void updateReservation(@RequestBody Salle salle,@PathVariable long id) {
		salleService.updateSalle(id, salle);
	}
	
	@RequestMapping(value = "/salles/{id}", method = RequestMethod.DELETE)
	public void deleteSalle(@PathVariable long id) {
		salleService.deleteSalle(id);
	}
}
