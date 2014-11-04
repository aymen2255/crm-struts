package fr.treeptik.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;

@Entity
public class Echange {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	//private enum type{MAIL, TEL, RDV};
	private Date date;
	@Type(type="text")
	private String commentaire;
	@ManyToOne
    @JoinColumn(name="id_contact")
	private Contact contact;
	
}
