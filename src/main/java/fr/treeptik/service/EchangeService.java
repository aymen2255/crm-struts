package fr.treeptik.service;

import java.util.List;

import fr.treeptik.model.Contact;
import fr.treeptik.model.Echange;

public interface EchangeService {
	Echange addEchange(Echange echange);
	List<Echange> getEchangeOfContact(Integer id);
	List<Echange> getAllEchange();
	
}
