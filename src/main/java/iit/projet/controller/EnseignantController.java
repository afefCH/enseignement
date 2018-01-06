package iit.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import iit.projet.model.Enseignant;
import iit.projet.service.EnseignantService;

@RestController
@RequestMapping(value = "/enseignant")
public class EnseignantController {

	@Autowired
	private EnseignantService enseigService;
	
	@RequestMapping(value = "/enseignants", method = RequestMethod.GET)
	public List getAllEnseignants() {
		
		return enseigService.getAllEnseignants();
		
	}
	
	@RequestMapping(value = "/enseignant/{id}", method = RequestMethod.GET)
	public Enseignant getEnseignant(@PathVariable long id) {
		return enseigService.getEnseignant(id);
	}
	
	@RequestMapping(value = "/enseignant", method = RequestMethod.POST)
	public void addEnseignant(@RequestBody Enseignant enseignant) {
		enseigService.addEnseignant(enseignant);
		
	}
	
	@RequestMapping(value = "/enseignant/{id}", method = RequestMethod.PUT)
	public void updateEnseignant(@RequestBody Enseignant enseignant,@PathVariable long id) {
		enseigService.updateEnseignant(id, enseignant);
	}
	
	@RequestMapping(value = "/enseignant/{id}", method = RequestMethod.DELETE)
	public void deleteEnseignant(@PathVariable long id) {
		enseigService.deleteEnseignant(id);
	}

}
