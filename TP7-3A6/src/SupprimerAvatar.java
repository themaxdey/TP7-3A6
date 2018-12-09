/**
 * Auteurs : Jean-Sébastien Beaulne, Maxime Déry et Soti
 * Fichier : SupprimerAvatar.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe SupprimerAvatar permet de faire des suppressions d'avatars.
 */

public class SupprimerAvatar implements OutilsConstantes {
	
	/**
	 * Le constructeur SupprimerAvatar() permet de gérer les suppressions
	 * d'avatars.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	public SupprimerAvatar( Jeu jeu ) {
		// Constantes du constructeur.
		final String AUCUN_AVATAR =	"\nErreur, impossible d'effectuer la "
				+ "suppression d'un avatar, car il n'y a pas d'avatar.";

		final String TITRE = "\nSuppression d'un avatar.";

		final String QUEST_CONF_SUPP = "\nVoulez-vous supprimer"
				+ " cet avatar (O ou N) ? ";

		final String MESS_SUPP_OK = "\nCet avatar a été supprimé.";

		final String MESS_SUPP_ANNULEE = "\nCet avatar n'a pas été supprimé.";

		final String DEVENU_VIDE = "\nImpossible d'effectuer d'autres "
				+ "suppressions d'avatars, "
				+ "car il ne reste plus d'avatars.";

		final String AUTRE_SUPPRESSION = "\nVoulez-vous supprimer " 
				+ "un autre avatar (O ou N) ? ";

		// Code du constructeur.
		
		char rep = NON;

		if ( jeu.getArbreAvatars().isEmpty() ) {
			System.out.println( AUCUN_AVATAR );
		} else {

			do {
				System.out.println( TITRE );


				/**
				 * TODO (À COMPLÉTER). 
				 * 
				 * Voir page 10 de l'énoncé du TP7.
				 */				
				
				if ( jeu.getArbreAvatars().isEmpty() ) {
					System.out.println( DEVENU_VIDE );
					rep = NON;
				} else {
					rep = OutilsLecture.lireOuiNon( AUTRE_SUPPRESSION );
				}

			} while ( rep == OUI );
		}
	}
}