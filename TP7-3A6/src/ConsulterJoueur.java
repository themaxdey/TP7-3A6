/**
 * Auteurs : Jean-S�bastien Beaulne, Maxime D�ry et Soti
 * Fichier : ConsulterJoueur.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 d�cembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe ConsulterJoueur permet de faire des consultations de joueurs.
 */

public class ConsulterJoueur implements OutilsConstantes {

	/**
	 * Le constructeur ConsulterJoueur() permet de g�rer les consultations de
	 * joueurs.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	public ConsulterJoueur( Jeu jeu ) {
		// Constantes du constructeur.
		final String AUCUN_JOUEUR =	"\nErreur, impossible d'effectuer "
				+ "la consultation de joueurs, "
				+ "car il n'y a pas de joueur.";

		final String TITRE = "\nConsultation d'un joueur.";

		final String AUTRE_CONSULTATION = "\nVoulez-vous consulter " 
				+ "un autre joueur (O ou N) ? ";
		
		// Code du constructeur.

		char rep = NON;

		if ( jeu.getArbreJoueurs().isEmpty() ) {
			System.out.println( AUCUN_JOUEUR );
		} else {

			do {
				System.out.println( TITRE );

				
				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 7 de l'�nonc� du TP7.
				 */				

				rep = OutilsLecture.lireOuiNon( AUTRE_CONSULTATION );

			} while ( rep == OUI );
		}
	}
}