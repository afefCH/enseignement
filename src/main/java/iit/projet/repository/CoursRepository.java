package iit.projet.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import iit.projet.model.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {
	Cours findByLibelle(String libelle);
}
