package fr.treeptik.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.ContactDAO;
import fr.treeptik.model.Contact;
import fr.treeptik.model.Echange;
import fr.treeptik.model.Entreprise;
import fr.treeptik.service.ContactService;
import fr.treeptik.service.EntrepriseService;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDAO contactDAO;
	@Autowired
	private EntrepriseService entrepriseService;

	@Override
	@Transactional
	public void addContact(Contact contact) throws Exception {

		// Integer id = contact.getEntreprise().getId();
		// entrepriseService.getEntrepriseById(id);
		contactDAO.save(contact);

	}

	@Override
	public List<Contact> listcontacts() throws Exception {
		return contactDAO.findAll();
	}

	@Override
	public Contact getContactById(Integer contactId) {
		return contactDAO.findOne(contactId);
	}


}
