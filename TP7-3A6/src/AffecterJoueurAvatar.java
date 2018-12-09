/**
 * Auteurs : Jean-S�bastien Beaulne, Maxime D�ry et Soti
 * Fichier : AffecterJoueurAvatar.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 d�cembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe AffecterJoueurAvatar permet de faire des affectations de joueurs �
 * des avatars.
 */

public class AffecterJoueurAvatar implements OutilsConstantes {

	/**
	 * Le constructeur AffecterJoueurAvatar() permet de g�rer les affectations
	 * de joueurs � des avatars. Un joueur peut �tre affect� � un seul avatar et
	 * un avatar peut �tre affect� � un seul joueur.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	public AffecterJoueurAvatar( Jeu jeu ) {
		// Constantes du constructeur.
		final String AUCUN_JOUEUR =
				"\nErreur, impossible d'affecter un joueur"
						+ " � un avatar, car il n'y a pas de joueur.";

		final String AUCUN_AVATAR =
				"\nErreur, impossible d'affecter un joueur"
						+ " � un avatar, car il n'y a pas d'avatar.";

		final String TITRE = "\nAffectation d'un joueur � un avatar.";

		final String AUTRE_AFFECTATION =
				"\nVoulez-vous affecter "
						+ "un autre joueur � un avatar (O ou N) ? ";

		// Code du constructeur.

		char rep = NON;

		if ( jeu.getArbreJoueurs().isEmpty() ) {
			System.out.println( AUCUN_JOUEUR );

		} else if ( jeu.getArbreAvatars().isEmpty() ) {
			System.out.println( AUCUN_AVATAR );
		} else {

			do {
				System.out.println( TITRE );


				/**
				 * TODO (� COMPL�TER). 
				 * 
				 * Voir page 11 de l'�nonc� du TP7.
				 */				

				rep = OutilsLecture.lireOuiNon( AUTRE_AFFECTATION );

			} while ( rep == OUI );
		}
	}
}