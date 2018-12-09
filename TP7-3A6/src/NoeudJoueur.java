/**
 * Auteurs : TODO et Soti
 * Fichier : NoeudJoueur.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 d�cembre 2018
 */

// Packages.

import java.io.*;

/**
 * La classe NoeudJoueur permet de g�rer un noeud de l'arbre binaire �quilibr�
 * ordonn� des joueurs. Cette classe impl�mente les interfaces Comparable et
 * Serializable.
 */

public class NoeudJoueur implements Comparable<NoeudJoueur>, Serializable {
	// Num�ro d'identification pour la sauvegarde d'un noeud joueur.
	static final long serialVersionUID = 3;

	// Un noeud de l'arbre binaire ordonn� des joueurs est compos�
	// d'un joueur et d'un pointeur vers un noeud de l'arbre des avatars.

	private Joueur joueur;

	private NoeudAvatar noeudAvatar;

	/**
	 * Le premier constructeur NoeudJoueur() permet de construire un noeud de
	 * base de l'arbre binaire ordonn� des joueurs. Au d�but aucun joueur est
	 * affect� � aucun avatar.
	 */

	public NoeudJoueur() {

		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 5 de l'�nonc� du TP7.
		 */				

	}

	/**
	 * Le deuxi�me constructeur NoeudJoueur() permet de construire un noeud de
	 * l'arbre binaire ordonn� des joueurs. Au d�but le joueur est affect� �
	 * aucun avatar.
	 * 
	 * @param joueur
	 *            Un joueur.
	 */

	public NoeudJoueur( Joueur joueur ) {

		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 5 de l'�nonc� du TP7.
		 */				

	}

	/**
	 * Le mutateur setJoueur() permet d'initialiser le champ priv� joueur.
	 * 
	 * @param joueur
	 *            Un joueur.
	 */

	public void setJoueur( Joueur joueur ) {
		this.joueur = joueur;
	}

	/**
	 * Le mutateur setNoeudAvatar() permet d'initialiser le champ priv�
	 * noeudAvatar.
	 * 
	 * @param noeudAvatar
	 *            Un noeud de l'arbre des avatars auquel le joueur est affect�.
	 */

	public void setNoeudAvatar( NoeudAvatar noeudAvatar ) {
		this.noeudAvatar = noeudAvatar;
	}

	/**
	 * L'accesseur getJoueur() permet de retourner un joueur.
	 * 
	 * @return Un joueur.
	 */

	public Joueur getJoueur() {
		return this.joueur;
	}

	/**
	 * L'accesseur getNoeudAvatar() permet de retourner un noeud de l'arbre des
	 * avatars auquel le joueur est affect�.
	 * 
	 * @return Un noeud de l'arbre des avatars.
	 */

	public NoeudAvatar getNoeudAvatar() {
		return this.noeudAvatar;
	}

	/**
	 * La m�thode publique afficherNoeudJoueur() permet d'afficher les
	 * diff�rents champs d'un noeud de l'arbre binaire ordonn� des joueurs.
	 */

	public void afficherNoeudJoueur() {
		// Constantes de la m�thode.
		final String MESS_AUCUN = "\nCe joueur n'est affect� � aucun" 
				+ " avatar pour le moment.";

		final String MESS_AFFECTATION =	"\nCe joueur est affect� � " 
				+ "l'avatar suivant";

		// Code de la m�thode.
		

		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 6 de l'�nonc� du TP7.
		 */				

	}

	/**
	 * Red�finition de la m�thode toString() de la classe Object.
	 * 
	 * @return Les informations du noeud du joueur sous forme de cha�ne de
	 *         caract�res.
	 */

	public String toString() {
		String infos;

		infos = this.getClass().getName() + "[" + this.getJoueur().toString()
				+ "[" + this.getNoeudAvatar().getAvatar().toString() + "]";

		return infos;
	}

	/**
	 * Red�finition de la m�thode equals() de la classe Object. Deux objets de
	 * type NoeudJoueur sont �gaux lorsque leurs joueurs sont �gaux.
	 * 
	 * @param autreObjet
	 *            L'autre objet avec lequel on v�rifie l'�galit�.
	 * @return true si l'objet courant et l'autre objet sont �gaux et false dans
	 *         le cas contraire.
	 */

	public boolean equals( Object autreObjet ) {
		boolean egalite = false;

		if ( this == autreObjet ) {
			egalite = true;

		} else if ( autreObjet != null ) {

			if ( autreObjet instanceof NoeudJoueur ) {
				NoeudJoueur autre = (NoeudJoueur) autreObjet;

				if ( this.getJoueur().equals( autre.getJoueur() ) ) {
					egalite = true;
				}
			}
		}

		return egalite;
	}

	/**
	 * Impl�mentation de la m�thode compareTo() de l'interface Comparable. Un
	 * objet de type NoeudJoueur est plus petit qu'un autre objet de type
	 * NoeudJoueur lorsque le joueur du premier objet est plus petit que le
	 * joueur du deuxi�me objet.
	 * 
	 * @param autreObjet
	 *            L'autre objet � comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est �gal � l'autre objet.
	 */

	public int compareTo( NoeudJoueur autreObjet ) {
		int valCompare;

		valCompare = this.getJoueur().compareTo( autreObjet.getJoueur() );

		return valCompare;
	}
}