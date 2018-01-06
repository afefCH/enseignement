package iit.projet.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import iit.projet.model.Groupe;

public interface GroupeRepository extends JpaRepository<Groupe, Long> {
	Groupe findByLibelle(String libelle);
}
