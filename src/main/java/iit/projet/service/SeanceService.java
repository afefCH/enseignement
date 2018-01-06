package iit.projet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import iit.projet.model.Seance;
import iit.projet.repository.SeanceRepository;

@Service
public class SeanceService {
	
	@Autowired
	private SeanceRepository seanceRepo;
	
	// Retrieve all rows from table and populate list with objects
	public List getAllSeances() {
		
		List seances = new ArrayList<>();
		seanceRepo.findAll().forEach(seances::add);
		
		return seances;
	}
	
	// Retrieves one row from table based on given id
	public Seance getSeance(Long id) {
		return seanceRepo.findOne(id);
	
	}
	
	// return seance find by libelle
	public Seance findByLibelle(@PathVariable String libelle) {
		 
		Seance seance = seanceRepo.findByLibelle(libelle);
		return seance;
	}
	
	// Inserts row into table 
	public void addSeance(Seance seance) {
		seanceRepo.save(seance);
	}
	
	// Updates row in table
	public void updateSeance(Long id, Seance seance) {
		seanceRepo.save(seance);
	}
	
	// Removes row from table
	public void deleteSeance(Long id) {
		seanceRepo.delete(id);
	}

}
