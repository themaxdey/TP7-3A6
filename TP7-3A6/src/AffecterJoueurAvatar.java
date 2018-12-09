/**
 * Auteurs : Jean-Sébastien Beaulne, Maxime Déry et Soti
 * Fichier : AffecterJoueurAvatar.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe AffecterJoueurAvatar permet de faire des affectations de joueurs à
 * des avatars.
 */

public class AffecterJoueurAvatar implements OutilsConstantes {

	/**
	 * Le constructeur AffecterJoueurAvatar() permet de gérer les affectations
	 * de joueurs à des avatars. Un joueur peut être affecté à un seul avatar et
	 * un avatar peut être affecté à un seul joueur.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	public AffecterJoueurAvatar( Jeu jeu ) {
		// Constantes du constructeur.
		final String AUCUN_JOUEUR =
				"\nErreur, impossible d'affecter un joueur"
						+ " à un avatar, car il n'y a pas de joueur.";

		final String AUCUN_AVATAR =
				"\nErreur, impossible d'affecter un joueur"
						+ " à un avatar, car il n'y a pas d'avatar.";

		final String TITRE = "\nAffectation d'un joueur à un avatar.";

		final String AUTRE_AFFECTATION =
				"\nVoulez-vous affecter "
						+ "un autre joueur à un avatar (O ou N) ? ";

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
				 * TODO (À COMPLÉTER). 
				 * 
				 * Voir page 11 de l'énoncé du TP7.
				 */				

				rep = OutilsLecture.lireOuiNon( AUTRE_AFFECTATION );

			} while ( rep == OUI );
		}
	}
}