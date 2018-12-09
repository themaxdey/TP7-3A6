/**
 * Auteur  : Soti
 * Fichier : PrincipalTp7.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 d�cembre 2018
 */

// Packages.

import java.io.*;
import java.util.*;

import outilsjava.*;

/**
 * La classe PrincipalTp7 permet de g�rer un menu principal pour pour le TP7
 * Programme d'affectation de joueurs � des avatars.
 */

public class PrincipalTp7 {

	/**
	 * Le constructeur PrincipalTp7 permet de g�rer un menu principal pour
	 * faire l'affectation de joueurs � des avatars.
	 */

	public PrincipalTp7() {
		// Constantes pour les choix du menu principal.

		final char GERER_JOUEUR           = '1';
		final char GERER_AVATAR           = '2';
		final char AFFECTER_JOUEUR        = '3';
		final char CONSULTER_AFFECTATIONS = '4';
		final char QUITTER_PROGRAMME      = '5';

		// Tableau des noms de mois.

		String[] tabMois = { "janvier", "f�vrier", "mars", "avril", "mai",
				"juin", "juillet", "ao�t", "septembre", "octobre", "novembre",
				"d�cembre" };

		// Obtenir la date d'aujourd'hui.

		GregorianCalendar aujourdhui = new GregorianCalendar();

		int annee = aujourdhui.get( GregorianCalendar.YEAR );
		int mois = aujourdhui.get( GregorianCalendar.MONTH );
		int jour = aujourdhui.get( GregorianCalendar.DAY_OF_MONTH );

		// Texte du menu principal.

		final String MENU_PRINCIPAL = 
				"\nMenu pour la gestion des joueurs"
				+ " et des avatars des jeux MontMMOrency\n" 
				+ "Date : " + jour + " " + tabMois[mois] + " " + annee + "\n\n"
				+ "1 : G�rer les joueurs\n" 
				+ "2 : G�rer les avatars\n"
				+ "3 : Affectation d'un joueur � un avatar\n"
				+ "4 : Consulter toutes les affectations\n"
				+ "5 : Quitter le programme";
		
		System.out.println( "\nBienvenue au programme de gestion des"
				+ " affectations de joueurs � des avatars"
				+ " pour les jeux MontMMOrency." );

		char choix;

		Jeu jeu = new Jeu(); // Objet du jeu.

		// Nom physique du fichier.
		String nomFichier;

		// Nom logique du fichier binaire en lecture.
		ObjectInputStream ficLecture;

		nomFichier = OutilsFichier.lireNomFichier( "\nEntrez le nom du "
				+ "fichier qui contient les joueurs et les avatars des "
				+ "jeux MontMMOrency : " );

		ficLecture = this.preparerOuvertureFichier(	nomFichier,	jeu );
		
		if ( ficLecture == null ) {
			System.out.println( "\nUne erreur est survenue avec le fichier" +
					" du jeu." );

		} else {
			jeu = Jeu.lireFicBin( ficLecture );

	      	OutilsFichier.fermerFicBinLecture( ficLecture, nomFichier );
	      	
			do {
				choix = OutilsAffichage.afficherChoisirMenu(
						MENU_PRINCIPAL, GERER_JOUEUR, QUITTER_PROGRAMME );

				switch ( choix ) {
				case GERER_JOUEUR:
					this.gererJoueur( jeu );
					break;

				case GERER_AVATAR:
					this.gererAvatar( jeu );
					break;

				case AFFECTER_JOUEUR:
					new AffecterJoueurAvatar( jeu );
					break;

				case CONSULTER_AFFECTATIONS:
					new AfficherAffectations( jeu );
					break;

				case QUITTER_PROGRAMME:
					this.sauvegarderFichier( nomFichier, jeu );
					break;
				}
			} while ( choix != QUITTER_PROGRAMME );
		}

		System.out.println( "\nFin du programme.\n" );
	}

	/**
	 * La m�thode priv�e gererJoueur() permet de g�rer les joueurs avec l'aide
	 * d'un sous-menu.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	private void gererJoueur( Jeu jeu ) {
		// Constantes du sous-menu pour g�rer les joueurs.

		final char AJOUTER_JOUEUR         = '1';
		final char SUPPRIMER_JOUEUR       = '2';
		final char CONSULTER_JOUEUR       = '3';
		final char CONSULTER_TOUS_JOUEURS = '4';
		final char QUITTER_MENU           = '5';

		final String MENU_JOUEUR = 
				"\nMenu pour la gestion des "
				+ "joueurs\n\n" 
				+ "1 : Ajouter un joueur\n"
				+ "2 : Supprimer un joueur\n"
				+ "3 : Consulter un joueur\n"
				+ "4 : Consulter tous les joueurs\n" 
				+ "5 : Quitter ce menu";

		char choix;

		do {
			choix = OutilsAffichage.afficherChoisirMenu( MENU_JOUEUR,
					AJOUTER_JOUEUR, QUITTER_MENU );

			switch ( choix ) {
			case AJOUTER_JOUEUR:
				new AjouterJoueur( jeu );
				break;

			case SUPPRIMER_JOUEUR:
				new SupprimerJoueur( jeu );
				break;

			case CONSULTER_JOUEUR:
				new ConsulterJoueur( jeu );
				break;

			case CONSULTER_TOUS_JOUEURS:
				new ConsulterTousJoueurs( jeu );
				break;

			case QUITTER_MENU:
				System.out.println( "\nFin du sous-menu des joueurs." );
				break;
			}
		} while ( choix != QUITTER_MENU );
	}

	/**
	 * La m�thode priv�e gererAvatar() permet de g�rer les avatars avec
	 * l'aide d'un sous-menu.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	private void gererAvatar( Jeu jeu ) {
		// Constantes de sous-menu pour g�rer les avatars.

		final char AJOUTER_AVATAR         = '1';
		final char SUPPRIMER_AVATAR       = '2';
		final char CONSULTER_AVATAR       = '3';
		final char CONSULTER_TOUS_AVATARS = '4';
		final char QUITTER_MENU           = '5';

		final String MENU_AVATAR = 
				"\nMenu pour la gestion des "
				+ "avatars\n\n" 
				+ "1 : Ajouter un avatar\n"
				+ "2 : Supprimer un avatar\n"
				+ "3 : Consulter un avatar\n"
				+ "4 : Consulter tous les avatars\n" 
				+ "5 : Quitter ce menu";

		char choix;

		do {
			choix = OutilsAffichage.afficherChoisirMenu( MENU_AVATAR,
					AJOUTER_AVATAR, QUITTER_MENU );

			switch ( choix ) {
			case AJOUTER_AVATAR:
				new AjouterAvatar( jeu );
				break;

			case SUPPRIMER_AVATAR:
				new SupprimerAvatar( jeu );
				break;

			case CONSULTER_AVATAR:
				new ConsulterAvatar( jeu );
				break;

			case CONSULTER_TOUS_AVATARS:
				new ConsulterTousAvatars( jeu );
				break;

			case QUITTER_MENU:
				System.out.println( "\nFin du sous-menu des avatars." );
				break;
			}
		} while ( choix != QUITTER_MENU );
	}
	
	/**
	 * La m�thode priv�e preparerOuvertureFichier() permet d'ouvrir le fichier
	 * du jeu en lecture. Si le fichier n'existe pas, on le cr�e sans aucune
	 * donn�e et on ouvre ce fichier par la suite en lecture.
	 * 
	 * @param nomFichier
	 *            Le nom physique du fichier.
	 * @param jeu
	 *            L'objet du jeu.
	 * @return Le nom logique du fichier si l'op�ration est un succ�s et null
	 *         dans le cas contraire.
	 */

	private ObjectInputStream preparerOuvertureFichier( String nomFichier,
			Jeu jeu ) {

		File fic = new File( nomFichier );

		ObjectInputStream ficLecture = null;
		ObjectOutputStream ficEcriture = null;

		boolean peutContinuer = true;

		// Si le fichier n'existe pas, on le cr�e avec un jeu vide.

		if ( !fic.exists() ) {
			ficEcriture = OutilsFichier.ouvrirFicBinEcriture( nomFichier );

			if ( ficEcriture == null ) {
				peutContinuer = false;
			} else {
				// Le fichier n'existe pas.
				// Cr�ation de ce fichier avec un jeu vide.

				jeu.ecrireFicBin( ficEcriture );

				OutilsFichier.fermerFicBinEcriture( ficEcriture, nomFichier );
			}
		}

		// Si on peut continuer, on ouvre le fichier en lecture.

		if ( peutContinuer ) {
			ficLecture = OutilsFichier.ouvrirFicBinLecture( nomFichier );
		}

		return ficLecture;
	}

	/**
	 * La m�thode priv�e sauvegarderFichier() permet de sauvegarder l'objet du
	 * jeu re�u en param�tre dans le fichier re�u en param�tre.
	 * 
	 * @param nomFichier
	 *            Le nom physique du fichier.
	 * @param jeu
	 *            L'objet du jeu.
	 */

	private void sauvegarderFichier( String nomFichier, Jeu jeu ) {

		ObjectOutputStream ficEcriture = null;

		System.out.println( "\nSauvegarde du fichier " + nomFichier + "." );

		ficEcriture = OutilsFichier.ouvrirFicBinEcriture( nomFichier );

		if ( ficEcriture != null ) {
			jeu.ecrireFicBin( ficEcriture );

			OutilsFichier.fermerFicBinEcriture( ficEcriture, nomFichier );
		}
	}
}