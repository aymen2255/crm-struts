package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.model.Echange;

public interface EchangeDAO extends JpaRepository<Echange, Integer>{
	//@Query("SELECT e FROM Echange e left join fetch e.contact contact WHERE contact.id =:id")
	@Query("SELECT e FROM Echange e WHERE e.contact.id =:id")
	public List<Echange> getEchangeOfContact(@Param("id") int id);


	
}
