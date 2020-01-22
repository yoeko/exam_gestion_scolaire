package metier;

import java.util.Date;

public class Enseignant extends Personne {
	
	private int id;
	private String matiere;
	
	/**
	 * this is the constructor
	 * @param id
	 * @param dateNaissance
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param adresse
	 * @param telephone
	 */
	public Enseignant(int id, Date dateNaissance, String nom, String prenom, String email, String adresse, String telephone) {
		super(nom, prenom, email, adresse, telephone);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMatiere() {
		return matiere;
	}

	public void setMatiere(String matiere) {
		this.matiere = matiere;
	}

}
