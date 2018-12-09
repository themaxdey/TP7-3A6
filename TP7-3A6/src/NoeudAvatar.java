/**
 * Auteurs : TODO et Soti
 * Fichier : NoeudAvatar.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import java.io.*;

/**
 * La classe NoeudAvatar permet de gérer un objet de l'arbre binaire équilibré
 * ordonné des avatars. Cette classe implémente les interfaces Comparable et
 * Serializable.
 */

public class NoeudAvatar implements Comparable<NoeudAvatar>, Serializable {

	// Numéro d'identification pour la sauvegarde d'un noeud avatar.
	static final long serialVersionUID = 4;

	// Un noeud de l'arbre binaire ordonné des avatars est composé
	// d'un avatar et d'un pointeur vers un objet de l'arbre des joueurs.

	private Avatar avatar;

	private NoeudJoueur noeudJoueur;

	/**
	 * Le premier constructeur NoeudAvatar() permet de construire un noeud de
	 * base de l'arbre binaire ordonné des avatars. Au début aucun joueur est
	 * affecté à un avatar.
	 */

	public NoeudAvatar() {

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 6 de l'énoncé du TP7.
		 */				

	}

	/**
	 * Le deuxième constructeur NoeudAvatar() permet de construire un noeud de
	 * l'arbre binaire ordonné des avatars. Au début aucun joueur est affecté à
	 * un avatar.
	 * 
	 * @param avatar
	 *            Un avatar.
	 */

	public NoeudAvatar( Avatar avatar ) {

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 6 de l'énoncé du TP7.
		 */				

	}

	/**
	 * Le mutateur setAvatar() permet d'initialiser le champ privé avatar.
	 * 
	 * @param avatar
	 *            Un avatar.
	 */

	public void setAvatar( Avatar avatar ) {
		this.avatar = avatar;
	}

	/**
	 * Le mutateur setNoeudJoueur() permet d'initialiser le champ privé
	 * noeudJoueur.
	 * 
	 * @param noeudJoueur
	 *            Un noeud de l'arbre des joueurs. L'avatar sera affecté à ce
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
	 * joueurs qui est affecté à l'avatar.
	 * 
	 * @return Le noeud de l'arbre des joueurs.
	 */

	public NoeudJoueur getNoeudJoueur() {
		return this.noeudJoueur;
	}

	/**
	 * La méthode publique afficherNoeudAvatar() permet d'afficher les
	 * différents champs d'un noeud de l'arbre des avatars.
	 */

	public void afficherNoeudAvatar() {
		// Constantes de la méthode.
		final String MESS_AUCUN = "\nCet avatar n'est affecté à aucun "
				+ "joueur pour le moment.";

		final String MESS_AFFECTATION = "\nCet avatar est affecté " 
				+ "au joueur suivant";

		// Code de la méthode.
		

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 6 de l'énoncé du TP7.
		 */				

	}

	/**
	 * Redéfinition de la méthode toString() de la classe Object.
	 * 
	 * @return Les informations du noeud de l'avatar sous forme de chaîne de
	 *         caractères.
	 */

	public String toString() {
		String infos;

		infos = this.getClass().getName() + "[" + this.getAvatar().toString()
				+ "[" + this.getNoeudJoueur().getJoueur().toString() + "]";

		return infos;
	}

	/**
	 * Redéfinition de la méthode equals() de la classe Object. Deux objets de
	 * type NoeudAvatar sont égaux lorsque leurs avatars sont égaux.
	 * 
	 * @param autreObjet
	 *            L'autre objet avec lequel on vérifie l'égalité.
	 * @return true si l'objet courant et l'autre objet sont égals et false dans
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
	 * Implémentation de la méthode compareTo() de l'interface Comparable. Un
	 * objet de type NoeudAvatar est plus petit qu'un autre objet de type
	 * NoeudAvatar lorsque l'avatar du premier objet est plus petit que l'avatar
	 * du deuxième objet.
	 * 
	 * @param autreObjet
	 *            L'autre objet à comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est égal à l'autre objet.
	 */

	public int compareTo( NoeudAvatar autreObjet ) {
		int valCompare;

		valCompare = this.getAvatar().compareTo( autreObjet.getAvatar() );

		return valCompare;
	}
}