package service;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;

import metier.Etudiant;

public class GestionEtudiant {
	
	public static void ajouterEtudiant(Etudiant etudiant) {
		// Information d'accès à la base de données
				String url = "jdbc:mysql://localhost/gestion_ecole";
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
					
					String sql = "INSERT INTO `etudiant` VALUES ('" + etudiant.getNom() + "',"
									+ " '" + etudiant.getPrenom() + "', '" + etudiant.getEmail() + "','" + etudiant.getAdresse() + "','" + etudiant.getTelephone() + "','" + etudiant.getDateNaissance() + "')";
					
					// Etape 4 : Exécution requête
					statement.executeUpdate(sql);
					
					System.out.println("Ajout de l'étudiant '" + etudiant.getPrenom() + " " + etudiant.getNom() + "'.");
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
	
	public static void modifierEtudiant(String numeroEtudiant, Etudiant nouvelEtudiant)
	{
		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/gestion_ecole";
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
			
			String sql = "UPDATE `etudiant`"
					+ "SET prenom = '" + nouvelEtudiant.getPrenom() + "',"
					+ "nom = '" + nouvelEtudiant.getNom() + "'"
					+ "WHERE numero_etudiant = '" + numeroEtudiant + "'";
			
			// Etape 4 : Exécution requête
			statement.executeUpdate(sql);
			
			System.out.println("Modification de l'étudiant au numéro '" + numeroEtudiant + "'.");
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
	
	public static void supprimerEtudiant(String numeroEtudiant)
	{
		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/gestion_ecole";
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
			
			String sql = "DELETE FROM `etudiant` WHERE numero_etudiant = '" + numeroEtudiant + "'";
			
			// Etape 4 : Exécution requête
			statement.executeUpdate(sql);
			
			System.out.println("Suppression de l'étudiant au numéro '" + numeroEtudiant + "'.");
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
	
	public static void afficherEtudiants()
	{
		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/gestion_ecole";
		String login = "root";
		String password = "";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		try
		{
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : Récupération de la connexion
			connection = DriverManager.getConnection(url, login, password);
			
			// Etape 3 : Création d'un statement
			statement = connection.createStatement();
			
			String sql = "SELECT * FROM `etudiant` ";
			
			// Etape 4 : Exécution requête
			result = statement.executeQuery(sql);
			
			System.out.println("Liste des étudiants :");
			
			while (result.next())
			{
				System.out.println(result.getString("prenom") + " " + result.getString("nom")+ " " + result.getString("email")+ " " + result.getString("adresse"));
			}
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
	
	public static Etudiant trouverEtudiant(String nom)
	{
		// Information d'accès à la base de données
		String url = "jdbc:mysql://localhost/gestion_ecole";
		String login = "root";
		String password = "";
		
		Connection connection = null;
		Statement statement = null;
		ResultSet result = null;
		
		Etudiant etudiant = null;
		
		try
		{
			// Etape 1 : Chargement du driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// Etape 2 : Récupération de la connexion
			connection = DriverManager.getConnection(url, login, password);
			
			// Etape 3 : Création d'un statement
			statement = connection.createStatement();
			
			String sql = "SELECT * FROM `etudiant` WHERE nom = '" + nom + "'";
			
			// Etape 4 : Exécution requête
			result = statement.executeQuery(sql);
			
			System.out.println("Etudiant correspondant au nom '" + nom + "' :");
			
			while (result.next())
			{
				System.out.println(result.getString("prenom") + " " + result.getString("nom"));
				
//				etudiant = new Etudiant(result.getString("id"),
//										result.getString("prenom"),
//										result.getString("nom"));
			}
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
		return etudiant;
	}
	
	

}
