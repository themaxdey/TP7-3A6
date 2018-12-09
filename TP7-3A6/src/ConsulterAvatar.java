/**
 * Auteurs : TODO et Soti
 * Fichier : ConsulterAvatar.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 d�cembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe ConsulterAvatar permet de faire des consultations d'avatars.
 */

public class ConsulterAvatar implements OutilsConstantes {

	/**
	 * Le constructeur ConsulterAvatar() permet de g�rer les consultations
	 * d'avatars.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	public ConsulterAvatar( Jeu jeu ) {
		// Constantes du constructeur.
		final String AUCUN_AVATAR =	"\nErreur, impossible d'effectuer "
				+ "la consultation d'un avatar, "
				+ "car il n'y a pas d'avatar.";

		final String TITRE = "\nConsultation d'un avatar.";

		final String AUTRE_CONSULTATION = "\nVoulez-vous consulter " 
				+ "un autre avatar (O ou N) ? ";
		
		// Code du constructeur.

		char rep = NON;

		if ( jeu.getArbreAvatars().isEmpty() ) {
			System.out.println( AUCUN_AVATAR );
		} else {

			do {
				System.out.println( TITRE );


				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 9 de l'�nonc� du TP7.
				 */				

				rep = OutilsLecture.lireOuiNon( AUTRE_CONSULTATION );

			} while ( rep == OUI );
		}
	}
}