/**
 * Auteurs : TODO et Soti
 * Fichier : Jeu.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import java.io.*;
import java.util.*;

/**
 * La classe Jeu contient les données et les méthodes pour un jeu. Cette classe
 * implémente l'interface Serilizable.
 */

public class Jeu implements Serializable {
	
	// Numéro d'identification pour la sauvegarde d'un jeu.
	static final long serialVersionUID = 5;

	/**
	 * Un jeu est composé d'un arbre binaire ordonné équilibré de joueurs et
	 * d'un arbre binaire ordonné équilibré d'avatars.
	 */

	private TreeSet<NoeudJoueur> arbreJoueurs;

	private TreeSet<NoeudAvatar> arbreAvatars;

	/**
	 * Le constructeur Jeu() permet de construire un jeu de base. Au début le
	 * jeu ne contient aucun joueur et aucun avatar.
	 */

	public Jeu() {

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 7 de l'énoncé du TP7.
		 */				
		
	}

	/**
	 * L'accesseur getArbreJoueurs() permet de retourner l'arbre binaire ordonné
	 * équlibré des joueurs.
	 * 
	 * @return L'arbre des joueurs.
	 */

	public TreeSet<NoeudJoueur> getArbreJoueurs() {
		return this.arbreJoueurs;
	}

	/**
	 * L'accesseur getArbreAvatars() permet de retourner l'arbre binaire ordonné
	 * équlibré des avatars.
	 * 
	 * @return L'arbre des avatars.
	 */

	public TreeSet<NoeudAvatar> getArbreAvatars() {
		return this.arbreAvatars;
	}

	/**
	 * La méthode publique statique lireFicBin() permet de lire un objet de type
	 * Jeu du fichier binaire.
	 * 
	 * @param ficLecture
	 *            Nom logique du fichier binaire déjà ouvert en mode lecture.
	 * 
	 * @return Un objet de type Jeu ou null si fin de fichier.
	 */
	
	public static Jeu lireFicBin( ObjectInputStream ficLecture ) {

		Jeu jeu;

		try {
			jeu = (Jeu) ficLecture.readObject();
		}

		catch ( EOFException erEOF ) {
			jeu = null;
		}

		catch ( ClassNotFoundException erClasse ) {
			System.out.println( "\nErreur, impossible de lire un objet "
					+ "de type Jeu du fichier binaire." );
			jeu = null;
		}

		catch ( IOException erIO ) {
			System.out.println( "\nErreur d'entrée-sortie avec le fichier "
					+ "binaire." );
			jeu = null;
		}

		return jeu;
	}

	/**
	 * La méthode ecrireFicBin() permet d'écrire l'objet courant dans le fichier
	 * binaire.
	 * 
	 * @param ficEcriture
	 *            Nom logique du fichier binaire déjà ouvert en mode écriture.
	 */
	
	public void ecrireFicBin( ObjectOutputStream ficEcriture ) {

		/* this fait référence à l'objet courant de type Jeu. */

		try {
			ficEcriture.writeObject( this );
		}

		catch ( IOException erIO ) {
			System.out.println( "\nErreur d'écriture d'un objet Jeu "
					+ "dans le fichier binaire." );
		}
	}
}