/**
 * Auteurs : Jean-Sébastien Beaulne, Maxime Déry et Soti
 * Fichier : SupprimerJoueur.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe SupprimerJoueur permet de faire des suppressions de joueurs.
 */

public class SupprimerJoueur implements OutilsConstantes {

	/**
	 * Le constructeur SupprimerJoueur() permet de gérer les suppressions de
	 * joueurs.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	public SupprimerJoueur( Jeu jeu ) {
		// Constantes du constructeur.
		final String AUCUN_JOUEUR = "\nErreur, impossible d'effectuer la "
				+ "suppression de joueurs, car il n'y a pas de joueur.";

		final String TITRE = "\nSuppression d'un joueur.";

		final String QUEST_CONF_SUPP = "\nVoulez-vous supprimer" 
				+ " ce joueur (O ou N) ? ";

		final String MESS_SUPP_OK = "\nCe joueur a été supprimé.";

		final String MESS_SUPP_ANNULEE = "\nCe joueur n'a pas été supprimé.";

		final String DEVENU_VIDE = "\nImpossible d'effectuer d'autres "
				+ "suppressions de joueurs, "
				+ "car il ne reste plus de joueurs.";

		final String AUTRE_SUPPRESSION = "\nVoulez-vous supprimer " 
				+ "un autre joueur (O ou N) ? ";

		// Code du constructeur.
		
		char rep = NON;

		if ( jeu.getArbreJoueurs().isEmpty() ) {
			System.out.println( AUCUN_JOUEUR );
		} else {

			do {
				System.out.println( TITRE );


				/**
				 * TODO (À COMPLÉTER). 
				 * 
				 * Voir page 8 de l'énoncé du TP7.
				 */				
				
				if ( jeu.getArbreJoueurs().isEmpty() ) {
					System.out.println( DEVENU_VIDE );
					rep = NON;
				} else {
					rep = OutilsLecture.lireOuiNon( AUTRE_SUPPRESSION );
				}

			} while ( rep == OUI );
		}
	}
}