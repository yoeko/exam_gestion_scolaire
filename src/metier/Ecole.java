package metier;

public class Ecole {
	
	private int id;
	private String nom;
	private String email;
	private String telephone;
	private String adresse;
	private String directeur;
	
	/**
	 * constructeur de la classe
	 * @param id
	 * @param nom
	 * @param email
	 * @param telephone
	 * @param adresse
	 * @param directeur
	 */
	public Ecole(int id, String nom, String email, String telephone, String adresse, String directeur) {
		super();
		this.id = id;
		this.nom = nom;
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
		this.directeur = directeur;
	}
	/**
	 * get the id
	 * @return
	 */
	public int getId() {
		return id;
	}
	
	/*
	 * set the id
	 */
	public void setId(int id) {
		this.id = id;
	}
	
	/**
	 * get the name
	 * @return
	 */
	public String getNom() {
		return nom;
	}
	
	/**
	 * set the name
	 * @param nom
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	/**
	 * get the email
	 * @return
	 */
	public String getEmail() {
		return email;
	}
	
	/**
	 * set the email
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	
	/**
	 * get the phone
	 * @return
	 */
	public String getTelephone() {
		return telephone;
	}
	
	/**
	 * set the phone
	 * @param telephone
	 */
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	/**
	 * get the address
	 * @return
	 */
	public String getAdresse() {
		return adresse;
	}
	
	/**
	 * set the address
	 * @param adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	
	/**
	 * get the director
	 * @return
	 */
	public String getDirecteur() {
		return directeur;
	}
	
	/**
	 * set the director
	 * @param directeur
	 */
	public void setDirecteur(String directeur) {
		this.directeur = directeur;
	}
	
	/**
	 * return attributes values
	 */
	@Override
	public String toString() {
		return "Ecole [id=" + id + ", nom=" + nom + ", email=" + email + ", telephone=" + telephone + ", adresse="
				+ adresse + ", directeur=" + directeur + "]";
	}
	
	

}
