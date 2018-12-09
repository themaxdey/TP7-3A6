/**
 * Auteurs : TODO et Soti
 * Fichier : NoeudAvatar.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 d�cembre 2018
 */

// Packages.

import java.io.*;

/**
 * La classe NoeudAvatar permet de g�rer un objet de l'arbre binaire �quilibr�
 * ordonn� des avatars. Cette classe impl�mente les interfaces Comparable et
 * Serializable.
 */

public class NoeudAvatar implements Comparable<NoeudAvatar>, Serializable {

	// Num�ro d'identification pour la sauvegarde d'un noeud avatar.
	static final long serialVersionUID = 4;

	// Un noeud de l'arbre binaire ordonn� des avatars est compos�
	// d'un avatar et d'un pointeur vers un objet de l'arbre des joueurs.

	private Avatar avatar;

	private NoeudJoueur noeudJoueur;

	/**
	 * Le premier constructeur NoeudAvatar() permet de construire un noeud de
	 * base de l'arbre binaire ordonn� des avatars. Au d�but aucun joueur est
	 * affect� � un avatar.
	 */

	public NoeudAvatar() {

		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 6 de l'�nonc� du TP7.
		 */				

	}

	/**
	 * Le deuxi�me constructeur NoeudAvatar() permet de construire un noeud de
	 * l'arbre binaire ordonn� des avatars. Au d�but aucun joueur est affect� �
	 * un avatar.
	 * 
	 * @param avatar
	 *            Un avatar.
	 */

	public NoeudAvatar( Avatar avatar ) {

		/**
		 * TODO (� COMPL�TER). 
		 * 
		 * Voir page 6 de l'�nonc� du TP7.
		 */				

	}

	/**
	 * Le mutateur setAvatar() permet d'initialiser le champ priv� avatar.
	 * 
	 * @param avatar
	 *            Un avatar.
	 */

	public void setAvatar( Avatar avatar ) {
		this.avatar = avatar;
	}

	/**
	 * Le mutateur setNoeudJoueur() permet d'initialiser le champ priv�
	 * noeudJoueur.
	 * 
	 * @param noeudJoueur
	 *            Un noeud de l'arbre des joueurs. L'avatar sera affect� � ce
	 *            joueur.
	 */

	public void setNoeudJoueur( NoeudJoueur noeudJoueur ) {
		this.noeudJoueur = noeudJoueur;
	}

	/**
	 * L'accesseur getAvatar() permet de retourner un avatar.
	 * 
	 * @return Un avatar.
	 */

	public Avatar getAvatar() {
		return this.avatar;
	}

	/**
	 * L'accesseur getNoeudJoueur() permet de retourner le noeud de l'arbre des
	 * joueurs qui est affect� � l'avatar.
	 * 
	 * @return Le noeud de l'arbre des joueurs.
	 */

	public NoeudJoueur getNoeudJoueur() {
		return this.noeudJoueur;
	}

	/**
	 * La m�thode publique afficherNoeudAvatar() permet d'afficher les
	 * diff�rents champs d'un noeud de l'arbre des avatars.
	 */

	public void afficherNoeudAvatar() {
		// Constantes de la m�thode.
		final String MESS_AUCUN = "\nCet avatar n'est affect� � aucun "
				+ "joueur pour le moment.";

		final String MESS_AFFECTATION = "\nCet avatar est affect� " 
				+ "au joueur suivant";

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
	 * @return Les informations du noeud de l'avatar sous forme de cha�ne de
	 *         caract�res.
	 */

	public String toString() {
		String infos;

		infos = this.getClass().getName() + "[" + this.getAvatar().toString()
				+ "[" + this.getNoeudJoueur().getJoueur().toString() + "]";

		return infos;
	}

	/**
	 * Red�finition de la m�thode equals() de la classe Object. Deux objets de
	 * type NoeudAvatar sont �gaux lorsque leurs avatars sont �gaux.
	 * 
	 * @param autreObjet
	 *            L'autre objet avec lequel on v�rifie l'�galit�.
	 * @return true si l'objet courant et l'autre objet sont �gals et false dans
	 *         le cas contraire.
	 */

	public boolean equals( Object autreObjet ) {
		boolean egalite = false;

		if ( this == autreObjet ) {
			egalite = true;

		} else if ( autreObjet != null ) {

			if ( autreObjet instanceof NoeudAvatar ) {
				NoeudAvatar autre = (NoeudAvatar) autreObjet;

				if ( this.getAvatar().equals( autre.getAvatar() ) ) {
					egalite = true;
				}
			}
		}

		return egalite;
	}

	/**
	 * Impl�mentation de la m�thode compareTo() de l'interface Comparable. Un
	 * objet de type NoeudAvatar est plus petit qu'un autre objet de type
	 * NoeudAvatar lorsque l'avatar du premier objet est plus petit que l'avatar
	 * du deuxi�me objet.
	 * 
	 * @param autreObjet
	 *            L'autre objet � comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est �gal � l'autre objet.
	 */

	public int compareTo( NoeudAvatar autreObjet ) {
		int valCompare;

		valCompare = this.getAvatar().compareTo( autreObjet.getAvatar() );

		return valCompare;
	}
}