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
import fr.treeptik.service.ContactService;
import fr.treeptik.service.EchangeService;

@Component(value = "echangeAction")
@Scope("prototype")
@Namespace("/contact/echange")
public class EchangeAction extends ActionSupport implements
		ModelDriven<Echange> {
	@Autowired
	private EchangeService echangeService;
	@Autowired
	private ContactService contactService;
	List<Echange> echanges = new ArrayList<Echange>();
	private Contact contact = new Contact();
	private Echange echange = new Echange();

	@Override
	public Echange getModel() {
		return echange;
	}

	@Action(value = "listAction", results = { @Result(name = "success", location = "/echange/list.jsp") })
	@SkipValidation
	public String listContacts() throws Exception {
System.out.println(echange.getContact().getId());
		echanges = echangeService.getEchangeOfContact(echange.getContact()
				.getId());

		return SUCCESS;
	}
	@Action(value = "addAction", results = {
			@Result(name = "success", type = "chain", location = "listAction"),
			@Result(name = "input", location = "/echange/add.jsp") })
	public String addContact() throws Exception  {

		//entreprises = entrepriseService.listentreprises();
		
		//contactService.addContact(contact);
		echangeService.addEchange(echange);
		//echange.setContact(contactService.getContactById(echange.getContact().getId()));
		System.out.println("addContact" + echange.getContact().getId());
		
		return SUCCESS;
	}
	@Action(value = "initaddAction", results = { @Result(name = "success", location = "/echange/add.jsp") })
	public String initUpdate() throws Exception {
		echange.setContact(contactService.getContactById(echange.getContact().getId()));
System.out.println(echange.getContact().getNom());
		return SUCCESS;

	}

	public List<Echange> getEchanges() {
		return echanges;
	}

	public void setEchanges(List<Echange> echanges) {
		this.echanges = echanges;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public Echange getEchange() {
		return echange;
	}

	public void setEchange(Echange echange) {
		this.echange = echange;
	}

}
