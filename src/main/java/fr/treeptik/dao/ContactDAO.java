package fr.treeptik.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.model.Contact;
import fr.treeptik.model.Echange;

public interface ContactDAO extends JpaRepository<Contact, Integer>{
	@Query("select c from Contact c where c.id=:id")
    public Contact findById(@Param("id") Integer id);
	
	@Query("select c from Contact c where c.id=:id")
    public List<Contact> getContacts(@Param("id") Integer id);
	

}
