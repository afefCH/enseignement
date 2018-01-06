package iit.projet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import iit.projet.model.Salle;

public interface SalleRepository extends JpaRepository<Salle, Long> {
	Salle findByNom(String nom);
}