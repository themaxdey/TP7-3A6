/**
 * Auteurs : Jean-Sébastien Beaulne, Maxime Déry et Soti
 * Fichier : AjouterAvatar.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe AjouterAvatar permet de faire des ajouts d'avatars.
 */

public class AjouterAvatar implements OutilsConstantes {

	/**
	 * Le constructeur AjouterAvatar() permet de gérer les ajouts d'avatars.
	 * Lorsqu'on ajoute un avatar, il n'est affecté à aucun joueur.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	public AjouterAvatar( Jeu jeu ) {
		// Constantes du constructeur.
		final String TITRE = "\nAjout d'un avatar.";

		final String AUTRE_AJOUT =
				"\nVoulez-vous ajouter " + "un autre avatar (O ou N) ? ";

		// Code du constructeur.

		char rep = NON;

		do {
			System.out.println( TITRE );


			/**
			 * TODO (À COMPLÉTER). 
			 * 
			 * Voir page 9 de l'énoncé du TP7.
			 */				

			rep = OutilsLecture.lireOuiNon( AUTRE_AJOUT );

		} while ( rep == OUI );
	}
}