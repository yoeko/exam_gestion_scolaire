package presentation;

import java.util.Scanner;

import metier.Etudiant;
import service.GestionEtudiant;

public class Lanceur {

	public static void main(String[] args) {

		System.out.println("Bienvenue sur l'application de gestion de l'ECOLE ENSUP");
		int choix = 0;
		while (choix!=7) {
			System.out.println("****************  MENU ***************");
			System.out.println("1  pour  Liste des etudiants");
			System.out.println("2  pour  Afficher un etudiant");
			System.out.println("3  pour  Creer un etudiant");
			System.out.println("4  pour  Modifier un etudiant");
			System.out.println("5  pour  Supprimer un etudiant");
			System.out.println("6  pour  Associer un etudiant a un cours");
			System.out.println("7  pour  Quitter");
			
			Scanner scan = new Scanner(System.in);
			
			switch (scan.nextInt()) {
			case 1:
				choix = 1;
				System.out.println("LISTE DES ETUDIANTS");
				GestionEtudiant.afficherEtudiants();
				break;
			case 2:
				choix = 2;
				System.out.println("Entrer le nom ");
				Scanner scanNom = new Scanner(System.in);
				String nomAffichage = scanNom.next();
				break;
			case 3:
				choix = 3;
				System.out.println("Entrer le nom de l'etudiant");
				Scanner scanNomNew = new Scanner(System.in);
				String nom = scanNomNew.next();
				System.out.println("Entrer le prenom de l'etudiant");
				Scanner scanPrenomNew = new Scanner(System.in);
				String prenom = scanPrenomNew.next();
				System.out.println("Entrer Email de l'etudiant");
				Scanner scanEmailNew = new Scanner(System.in);
				String email = scanEmailNew.next();
				System.out.println("Entrer Adresse de l'etudiant");
				Scanner scanAdresseNew = new Scanner(System.in);
				String adresse = scanEmailNew.next();
				System.out.println("Entrer Telephone de l'etudiant");
				Scanner scanTelephoneNew = new Scanner(System.in);
				String telephone = scanTelephoneNew.next();
				System.out.println("Entrer Date de naissance de l'etudiant");
				Scanner scanDateNaissanceNew = new Scanner(System.in);
				String dateNaissance = scanDateNaissanceNew.next();
				
//				Etudiant etudiant = new Etudiant(nom,prenom,email,adresse,telephone,dateNaissance);
				
//				GestionEtudiant.ajouterEtudiant(etudiant);
				break;
			
			case 7:
				choix = 7;
				System.out.println("Vous etes deconneter, Veuillez redemarrer le programme pour continuer");
				break;

			default:
				break;
			}
		}
		
	}

}
