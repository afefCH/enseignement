package iit.projet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import iit.projet.model.Cours;
import iit.projet.repository.CoursRepository;

@Service
public class CoursService {
	
	@Autowired
	private CoursRepository coursRepo;
	
	// Retrieve all rows from table and populate list with objects
	public List getAllCours() {
		
		List cours = new ArrayList<>();
		coursRepo.findAll().forEach(cours::add);
		
		return cours;
	}
	
	// Retrieves one row from table based on given id
	public Cours getCours(Long id) {
		return coursRepo.findOne(id);
	
	}
	
	// return cours find by libelle
	public Cours findByLibelle(@PathVariable String libelle) {
		 
		Cours cours = coursRepo.findByLibelle(libelle);
		return cours;
	}
	
	// Inserts row into table 
	public void addCours(Cours cours) {
		coursRepo.save(cours);
	}
	
	// Updates row in table
	public void updateCours(Long id, Cours cours) {
		coursRepo.save(cours);
	}
	
	// Removes row from table
	public void deleteCours(Long id) {
		coursRepo.delete(id);
	}


}
