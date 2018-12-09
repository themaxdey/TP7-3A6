/**
 * Auteurs : TODO et Soti
 * Fichier : AjouterJoueur.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import outilsjava.*;

/**
 * La classe AjouterJoueur permet de faire des ajouts de joueurs.
 */

public class AjouterJoueur implements OutilsConstantes {

	/**
	 * Le constructeur AjouterJoueur() permet de gérer les ajouts de joueurs.
	 * Lorsqu'on ajoute un joueur, il n'est affecté à aucun avatar.
	 * 
	 * @param jeu
	 *            L'objet du jeu.
	 */

	public AjouterJoueur( Jeu jeu ) {
		// Constantes du constructeur.
		final String TITRE = "\nAjout d'un joueur.";

		final String AUTRE_AJOUT =
				"\nVoulez-vous ajouter " + "un autre joueur (O ou N) ? ";

		// Code du constructeur.

		char rep = NON;

		do {
			System.out.println( TITRE );

			
			/**
			 * TODO (À COMPLÉTER). 
			 * 
			 * Voir page 7 de l'énoncé du TP7.
			 */				

			rep = OutilsLecture.lireOuiNon( AUTRE_AJOUT );

		} while ( rep == OUI );
	}
}