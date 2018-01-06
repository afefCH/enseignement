package iit.projet.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import iit.projet.model.Enseignant;
import iit.projet.repository.EnseignantRepository;

@Service
public class EnseignantService {

	@Autowired
	private EnseignantRepository enseigRepo;
	
	// Retrieve all rows from table and populate list with objects
	public List getAllEnseignants() {
		
		List enseignants = new ArrayList<>();
		enseigRepo.findAll().forEach(enseignants::add);
		
		return enseignants;
	}
	
	// Retrieves one row from table based on given id
	public Enseignant getEnseignant(Long id) {
		return enseigRepo.findOne(id);
	
	}
	
	// return seance find by libelle
	public List<Enseignant> findByNom(@PathVariable String nom) {
		 
		List<Enseignant> enseignants = enseigRepo.findByNom(nom);
		return enseignants;
	}
	
	// Inserts row into table 
	public void addEnseignant(Enseignant enseignant) {
		enseigRepo.save(enseignant);
	}
	
	// Updates row in table
	public void updateEnseignant(Long id, Enseignant enseignant) {
		enseigRepo.save(enseignant);
	}
	
	// Removes row from table
	public void deleteEnseignant(Long id) {
		enseigRepo.delete(id);
	}
}
