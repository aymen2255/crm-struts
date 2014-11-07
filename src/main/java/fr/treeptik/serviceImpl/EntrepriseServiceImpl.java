package fr.treeptik.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.EntrepriseDAO;
import fr.treeptik.model.Entreprise;
import fr.treeptik.service.EntrepriseService;

@Service
public class EntrepriseServiceImpl implements EntrepriseService {

	@Autowired
	private EntrepriseDAO entrepriseDAO;

	@Override
	@Transactional
	public void addEntreprise(Entreprise entreprise) throws Exception {
		entrepriseDAO.save(entreprise);

	}

	@Override
	public List<Entreprise> listentreprises() throws Exception {
		return entrepriseDAO.findAll();

	}

	@Override
	public Entreprise getEntrepriseById(Integer id) {
		return entrepriseDAO.findOne(id);
		
	}

}
