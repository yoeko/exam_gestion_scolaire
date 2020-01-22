package metier;

import java.util.Date;

public abstract class Personne {
	private String nom;
	private String prenom;
	private String email;
	private String adresse;
	private String telephone;
	
	/**
	 * this is the constructor
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adresse
	 * @param telephone
	 */
	public Personne(String nom, String prenom, String email, String adresse, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.adresse = adresse;
		this.telephone = telephone;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	
	
}
