package iit.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import iit.projet.model.Cours;
import iit.projet.service.CoursService;

@RestController
@RequestMapping(value = "/cours")
public class CoursController {
	
	@Autowired
	private CoursService coursService;
	
	@RequestMapping(value = "/cours", method = RequestMethod.GET)
	public List getAllCours() {
		
		return coursService.getAllCours();
		
	}
	
	@RequestMapping(value = "/cours/{id}", method = RequestMethod.GET)
	public Cours getCours(@PathVariable long id) {
		return coursService.getCours(id);
	}
	
	@RequestMapping(value = "/cours", method = RequestMethod.POST)
	public void addCours(@RequestBody Cours cours) {
		coursService.addCours(cours);
		
	}
	
	@RequestMapping(value = "/cours/{id}", method = RequestMethod.PUT)
	public void updateCours(@RequestBody Cours cours,@PathVariable long id) {
		coursService.updateCours(id, cours);
	}
	
	@RequestMapping(value = "/cours/{id}", method = RequestMethod.DELETE)
	public void deleteCours(@PathVariable long id) {
		coursService.deleteCours(id);
	}


}
