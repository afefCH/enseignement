package iit.projet.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import iit.projet.model.Groupe;
import iit.projet.service.GroupeService;

@RestController
@RequestMapping(value = "/groupe")
public class GroupeController {
	
	@Autowired
	private GroupeService gpService;
	
	@RequestMapping(value = "/groupes", method = RequestMethod.GET)
	public List getAllGroupes() {
		
		return gpService.getAllGroupes();
		
	}
	
	@RequestMapping(value = "/groupe/{id}", method = RequestMethod.GET)
	public Groupe getGroupe(@PathVariable long id) {
		return gpService.getGroupe(id);
	}
	
	@RequestMapping(value = "/groupe", method = RequestMethod.POST)
	public void addGroupe(@RequestBody Groupe groupe) {
		gpService.addGroupe(groupe);
		
	}
	
	@RequestMapping(value = "/groupe/{id}", method = RequestMethod.PUT)
	public void updateGroupe(@RequestBody Groupe groupe,@PathVariable long id) {
		gpService.updateGroupe(id, groupe);
	}
	
	@RequestMapping(value = "/groupe/{id}", method = RequestMethod.DELETE)
	public void deleteGroupe(@PathVariable long id) {
		gpService.deleteGroupe(id);
	}

}
