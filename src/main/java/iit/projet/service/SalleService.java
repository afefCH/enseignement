package iit.projet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import iit.projet.model.Salle;
import iit.projet.repository.SalleRepository;

@Service	
public class SalleService {
	
	@Autowired
	private SalleRepository salleRepo;
	
	// Retrieve all rows from table and populate list with objects
	public List getAllSalles() {
		
		List salles = new ArrayList<>();
		salleRepo.findAll().forEach(salles::add);
		
		return salles;
	}
	
	// Retrieves one row from table based on given id
	public Salle getSalle(Long id) {
		return salleRepo.findOne(id);
	
	}
	
	// return salle find by nom
	public Salle findByNom(@PathVariable String nom) {
		 
		Salle salle = salleRepo.findByNom(nom);
		return salle;
	}
	
	// Inserts row into table 
	public void addSalle(Salle salle) {
		salleRepo.save(salle);
	}
	
	// Updates row in table
	public void updateSalle(Long id, Salle salle) {
		salleRepo.save(salle);
	}
	
	// Removes row from table
	public void deleteSalle(Long id) {
		salleRepo.delete(id);
	}

}
