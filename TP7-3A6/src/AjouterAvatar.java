/**
 * Auteurs : Jean-S�bastien Beaulne, Maxime D�ry et Soti
 * Fichier : AjouterAvatar.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 d�cembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe AjouterAvatar permet de faire des ajouts d'avatars.
 */

public class AjouterAvatar implements OutilsConstantes {

	/**
	 * Le constructeur AjouterAvatar() permet de g�rer les ajouts d'avatars.
	 * Lorsqu'on ajoute un avatar, il n'est affect� � aucun joueur.
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
			 * TODO (� COMPL�TER). 
			 * 
			 * Voir page 9 de l'�nonc� du TP7.
			 */				

			rep = OutilsLecture.lireOuiNon( AUTRE_AJOUT );

		} while ( rep == OUI );
	}
}