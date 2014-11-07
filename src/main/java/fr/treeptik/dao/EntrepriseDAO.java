package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.model.Contact;
import fr.treeptik.model.Entreprise;

public interface EntrepriseDAO extends JpaRepository<Entreprise, Integer>{
	@Query("select e from Entreprise e where e.id=:id")
    public Entreprise findById(@Param("id") Integer id);
	
	@Query("select e from Entreprise e")
    public List<Entreprise> getEntreprises();
}
