package iit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iit.projet.model.Seance;

public interface SeanceRepository extends JpaRepository<Seance, Long> {
	Seance findByLibelle(String libelle);
}
