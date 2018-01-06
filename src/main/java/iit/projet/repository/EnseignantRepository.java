package iit.projet.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import iit.projet.model.Enseignant;

public interface EnseignantRepository extends JpaRepository<Enseignant, Long> {
	List<Enseignant> findByNom(String nom);
}
