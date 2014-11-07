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

import fr.treeptik.model.Contact;
import fr.treeptik.model.Echange;
import fr.treeptik.model.Entreprise;
import fr.treeptik.service.ContactService;
import fr.treeptik.service.EntrepriseService;

@Component(value = "contactAction")
@Scope("prototype")
@Namespace("/contact")
public class ContactAction extends ActionSupport implements
		ModelDriven<Contact> {

	@Autowired
	private ContactService contactService;
	@Autowired
	private EntrepriseService entrepriseService;
	private Contact contact = new Contact();
	private List<Contact> contacts = new ArrayList<Contact>();
	private List<Entreprise> entreprises = new ArrayList<Entreprise>();

	@Override
	public Contact getModel() {
		return contact;
	}

	@Action(value = "listAction", results = { @Result(name = "success", location = "/contact/list.jsp") })
	@SkipValidation
	public String listContacts() throws Exception {
		contacts = contactService.listcontacts();
		System.out.println(contacts);

		return SUCCESS;
	}

	@Action(value = "addAction", results = {
			@Result(name = "success", type = "redirectAction", location = "listAction.action"),
			@Result(name = "input", location = "/contact/add.jsp") })
	public String addContact() throws Exception  {

		entreprises = entrepriseService.listentreprises();
		
		contactService.addContact(contact);

		return SUCCESS;
	}

	@Action(value = "initUpdateAction", results = { @Result(name = "success", location = "/contact/add.jsp") })
	public String initUpdate() throws Exception {
		entreprises = entrepriseService.listentreprises();
		return SUCCESS;

	}

	

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public List<Contact> getContacts() {
		return contacts;
	}

	public void setContacts(List<Contact> contacts) {
		this.contacts = contacts;
	}

	public List<Entreprise> getEntreprises() {
		return entreprises;
	}

	public void setEntreprises(List<Entreprise> entreprises) {
		this.entreprises = entreprises;
	}


}
