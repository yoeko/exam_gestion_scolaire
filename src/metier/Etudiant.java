package metier;

import java.util.Date;

public class Etudiant extends Personne {
	
	private int id;
	private Date dateNaissance;
	
	/**
	 * this is the constructor
	 * 
	 * @param id
	 * @param dateNaissance
	 */
	public Etudiant(Date dateNaissance, String nom, String prenom, String email, String adresse, String telephone) {
		super(nom, prenom, email, adresse, telephone);
		this.id = id;
		this.dateNaissance = dateNaissance;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	
	
	
	

}
