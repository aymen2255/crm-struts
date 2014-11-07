package fr.treeptik.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Contact {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String nom;
	private String prenom;
	private String mail;
	private Integer telFixe;
	private Integer telMobile;
	private enum statut{PROSPECT, CONTACT_DIRECT, CLIENT};
	@ManyToOne
	@JoinColumn(name="id_entreprise")
	private Entreprise entreprise;
    @OneToMany(mappedBy="contact")
    private List<Echange> echanges;
    
    
	public Contact() {
		super();
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public Integer getTelFixe() {
		return telFixe;
	}
	public void setTelFixe(Integer telFixe) {
		this.telFixe = telFixe;
	}
	public Integer getTelMobile() {
		return telMobile;
	}
	public void setTelMobile(Integer telMobile) {
		this.telMobile = telMobile;
	}
	public Entreprise getEntreprise() {
		return entreprise;
	}
	public void setEntreprise(Entreprise entreprise) {
		this.entreprise = entreprise;
	}
	public List<Echange> getEchanges() {
		return echanges;
	}
	public void setEchanges(List<Echange> echanges) {
		this.echanges = echanges;
	}
	
}
