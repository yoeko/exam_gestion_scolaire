package metier;

public class Cours {
	
	/**
	 * this is the attributes
	 */
	private int id;
	private String theme;
	private String nombreHeure;
	
	/**
	 * this the constructor
	 * @param theme
	 * @param nombreHeure
	 */
	public Cours(String theme, String nombreHeure) {
		super();
		this.theme = theme;
		this.nombreHeure = nombreHeure;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getNombreHeure() {
		return nombreHeure;
	}

	public void setNombreHeure(String nombreHeure) {
		this.nombreHeure = nombreHeure;
	}

	@Override
	public String toString() {
		return "Cours [theme=" + theme + ", nombreHeure=" + nombreHeure + "]";
	}
	
	
}
