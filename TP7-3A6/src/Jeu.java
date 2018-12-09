/**
 * Auteurs : TODO et Soti
 * Fichier : Jeu.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 d�cembre 2018
 */

// Packages.

import java.io.*;
import java.util.*;

/**
 * La classe Jeu contient les donn�es et les m�thodes pour un jeu. Cette classe
 * impl�mente l'interface Serilizable.
 */

public class Jeu implements Serializable {
	
	// Num�ro d'identification pour la sauvegarde d'un jeu.
	static final long serialVersionUID = 5;

	/**
	 * Un jeu est compos� d'un arbre binaire ordonn� �quilibr� de joueurs et
	 * d'un arbre binaire ordonn� �quilibr� d'avatars.
	 */

	private TreeSet<NoeudJoueur> arbreJoueurs;

	private TreeSet<NoeudAvatar> arbreAvatars;

	/**
	 * Le constructeur Jeu() permet de construire un jeu de base. Au d�but le
	 * jeu ne contient aucun joueur et aucun avatar.
	 */

	public Jeu() {

		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 7 de l'�nonc� du TP7.
		 */				
		
	}

	/**
	 * L'accesseur getArbreJoueurs() permet de retourner l'arbre binaire ordonn�
	 * �qulibr� des joueurs.
	 * 
	 * @return L'arbre des joueurs.
	 */

	public TreeSet<NoeudJoueur> getArbreJoueurs() {
		return this.arbreJoueurs;
	}

	/**
	 * L'accesseur getArbreAvatars() permet de retourner l'arbre binaire ordonn�
	 * �qulibr� des avatars.
	 * 
	 * @return L'arbre des avatars.
	 */

	public TreeSet<NoeudAvatar> getArbreAvatars() {
		return this.arbreAvatars;
	}

	/**
	 * La m�thode publique statique lireFicBin() permet de lire un objet de type
	 * Jeu du fichier binaire.
	 * 
	 * @param ficLecture
	 *            Nom logique du fichier binaire d�j� ouvert en mode lecture.
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
			System.out.println( "\nErreur d'entr�e-sortie avec le fichier "
					+ "binaire." );
			jeu = null;
		}

		return jeu;
	}

	/**
	 * La m�thode ecrireFicBin() permet d'�crire l'objet courant dans le fichier
	 * binaire.
	 * 
	 * @param ficEcriture
	 *            Nom logique du fichier binaire d�j� ouvert en mode �criture.
	 */
	
	public void ecrireFicBin( ObjectOutputStream ficEcriture ) {

		/* this fait r�f�rence � l'objet courant de type Jeu. */

		try {
			ficEcriture.writeObject( this );
		}

		catch ( IOException erIO ) {
			System.out.println( "\nErreur d'�criture d'un objet Jeu "
					+ "dans le fichier binaire." );
		}
	}
}