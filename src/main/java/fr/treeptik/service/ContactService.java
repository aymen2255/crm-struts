package fr.treeptik.service;

import java.util.List;

import fr.treeptik.model.Contact;
import fr.treeptik.model.Echange;
import fr.treeptik.model.Entreprise;

public interface ContactService {
	public void addContact(Contact contact) throws Exception;
	public List<Contact> listcontacts() throws Exception;
	public Contact getContactById(Integer Id);
	
}
