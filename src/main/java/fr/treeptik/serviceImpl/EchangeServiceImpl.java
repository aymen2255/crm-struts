package fr.treeptik.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.EchangeDAO;
import fr.treeptik.model.Contact;
import fr.treeptik.model.Echange;
import fr.treeptik.service.ContactService;
import fr.treeptik.service.EchangeService;
@Service
public class EchangeServiceImpl implements EchangeService{

	@Autowired
	private EchangeDAO echangeDAO;
	@Autowired
	private ContactService contactService;
	
	@Override
	@Transactional
	public Echange addEchange(Echange echange) {
		return echangeDAO.save(echange);
		
	}

	@Override
	public List<Echange> getEchangeOfContact(Integer id) {
		
		return echangeDAO.getEchangeOfContact(id);
		
		
	}

	@Override
	public List<Echange> getAllEchange() {
		return echangeDAO.findAll();
	}


}
