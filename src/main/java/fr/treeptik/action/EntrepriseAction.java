package fr.treeptik.action;

import java.util.ArrayList;
import java.util.List;

import org.apache.struts2.convention.annotation.Action;
import org.apache.struts2.convention.annotation.Namespace;
import org.apache.struts2.convention.annotation.Result;
import org.apache.struts2.interceptor.validation.SkipValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import fr.treeptik.model.Entreprise;
import fr.treeptik.service.EntrepriseService;

@Component(value = "entrepriseAction")
@Scope("prototype")
@Namespace("/entreprise")
public class EntrepriseAction extends ActionSupport implements
		ModelDriven<Entreprise> {

	@Autowired
	private EntrepriseService entrepriseService;
	private Entreprise entreprise = new Entreprise();
	private List<Entreprise> entreprises = new ArrayList<Entreprise>();

	@Override
	public Entreprise getModel() {
		return entreprise;
	}

	@Action(value = "listAction", results = { @Result(name = "success", location = "/entreprise/list.jsp") })
	@SkipValidation
	public String listContacts() throws Exception {
		entreprises = entrepriseService.listentreprises();
		return SUCCESS;
	}

	@Action(value = "addAction", results = {
			@Result(name = "success", type = "redirectAction", location = "listAction.action"),
			@Result(name = "input", location = "/entreprise/add.jsp") })
	public String addEntreprise() throws Exception {

		entrepriseService.addEntreprise(entreprise);

		return SUCCESS;
	}

	public Entreprise getEntreprise() {
		return entreprise;
	}

	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}

	public List<Entreprise> getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}

}
