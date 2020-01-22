package service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import metier.Cours;
import metier.Etudiant;

public class GestionEtudiantCours {
	
	public static void inscrireEtudiant(Etudiant etudiant, Cours cours)
	{
		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/gestion_etudiant";
		String login = "root";
		String password = "";
		
		Connection connection = null;
		Statement statement = null;
		
		try
		{
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : Récupération de la connexion
			connection = DriverManager.getConnection(url, login, password);
			
			// Etape 3 : Création d'un statement
			statement = connection.createStatement();
			
			String sql = "INSERT INTO `etudiantCours`"
							+ "VALUES ('" + etudiant.getId() + "',"
							+ "'" + cours.getId() + "')";
			
			// Etape 4 : Exécution requête
			statement.executeUpdate(sql);
			
			System.out.println("Etudiant '" + etudiant.getPrenom() + " " + etudiant.getNom() +
								"' ajouter au cours '" + cours.getTheme() + "'.");
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
		catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				// Etape 5 : Libérer ressources de la mémoire
				connection.close();
				statement.close();
			}
			catch (SQLException e)
			{
				e.printStackTrace();
			}
		}
	}

}
