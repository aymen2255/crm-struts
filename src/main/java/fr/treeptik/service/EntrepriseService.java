package fr.treeptik.service;

import java.util.List;

import fr.treeptik.model.Entreprise;

public interface EntrepriseService {
	public void addEntreprise(Entreprise entreprise) throws Exception;
	public List<Entreprise> listentreprises() throws Exception;
	Entreprise getEntrepriseById(Integer id);
}
