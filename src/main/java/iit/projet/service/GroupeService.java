package iit.projet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import iit.projet.model.Groupe;
import iit.projet.repository.GroupeRepository;

@Service	
public class GroupeService {
	
	@Autowired
	private GroupeRepository gpRepo;
	
	// Retrieve all rows from table and populate list with objects
	public List getAllGroupes() {
		
		List groupes = new ArrayList<>();
		gpRepo.findAll().forEach(groupes::add);
		
		return groupes;
	}
	
	// Retrieves one row from table based on given id
	public Groupe getGroupe(Long id) {
		return gpRepo.findOne(id);
	
	}
	
	// return groupe find by libelle
	public Groupe findByNom(@PathVariable String libelle) {
		 
		Groupe groupe = gpRepo.findByLibelle(libelle);
		return groupe;
	}
	
	// Inserts row into table 
	public void addGroupe(Groupe groupe) {
		gpRepo.save(groupe);
	}
	
	// Updates row in table
	public void updateGroupe(Long id, Groupe groupe) {
		gpRepo.save(groupe);
	}
	
	// Removes row from table
	public void deleteGroupe(Long id) {
		gpRepo.delete(id);
	}

}
