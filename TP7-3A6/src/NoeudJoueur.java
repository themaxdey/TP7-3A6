/**
 * Auteurs : TODO et Soti
 * Fichier : NoeudJoueur.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import java.io.*;

/**
 * La classe NoeudJoueur permet de gérer un noeud de l'arbre binaire équilibré
 * ordonné des joueurs. Cette classe implémente les interfaces Comparable et
 * Serializable.
 */

public class NoeudJoueur implements Comparable<NoeudJoueur>, Serializable {
	// Numéro d'identification pour la sauvegarde d'un noeud joueur.
	static final long serialVersionUID = 3;

	// Un noeud de l'arbre binaire ordonné des joueurs est composé
	// d'un joueur et d'un pointeur vers un noeud de l'arbre des avatars.

	private Joueur joueur;

	private NoeudAvatar noeudAvatar;

	/**
	 * Le premier constructeur NoeudJoueur() permet de construire un noeud de
	 * base de l'arbre binaire ordonné des joueurs. Au début aucun joueur est
	 * affecté à aucun avatar.
	 */

	public NoeudJoueur() {

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 5 de l'énoncé du TP7.
		 */				

	}

	/**
	 * Le deuxième constructeur NoeudJoueur() permet de construire un noeud de
	 * l'arbre binaire ordonné des joueurs. Au début le joueur est affecté à
	 * aucun avatar.
	 * 
	 * @param joueur
	 *            Un joueur.
	 */

	public NoeudJoueur( Joueur joueur ) {

		/**
		 * TODO (À COMPLÉTER). 
		 * 
		 * Voir page 5 de l'énoncé du TP7.
		 */				

	}

	/**
	 * Le mutateur setJoueur() permet d'initialiser le champ privé joueur.
	 * 
	 * @param joueur
	 *            Un joueur.
	 */

	public void setJoueur( Joueur joueur ) {
		this.joueur = joueur;
	}

	/**
	 * Le mutateur setNoeudAvatar() permet d'initialiser le champ privé
	 * noeudAvatar.
	 * 
	 * @param noeudAvatar
	 *            Un noeud de l'arbre des avatars auquel le joueur est affecté.
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
	 * avatars auquel le joueur est affecté.
	 * 
	 * @return Un noeud de l'arbre des avatars.
	 */

	public NoeudAvatar getNoeudAvatar() {
		return this.noeudAvatar;
	}

	/**
	 * La méthode publique afficherNoeudJoueur() permet d'afficher les
	 * différents champs d'un noeud de l'arbre binaire ordonné des joueurs.
	 */

	public void afficherNoeudJoueur() {
		// Constantes de la méthode.
		final String MESS_AUCUN = "\nCe joueur n'est affecté à aucun" 
				+ " avatar pour le moment.";

		final String MESS_AFFECTATION =	"\nCe joueur est affecté à " 
				+ "l'avatar suivant";

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
	 * @return Les informations du noeud du joueur sous forme de chaîne de
	 *         caractères.
	 */

	public String toString() {
		String infos;

		infos = this.getClass().getName() + "[" + this.getJoueur().toString()
				+ "[" + this.getNoeudAvatar().getAvatar().toString() + "]";

		return infos;
	}

	/**
	 * Redéfinition de la méthode equals() de la classe Object. Deux objets de
	 * type NoeudJoueur sont égaux lorsque leurs joueurs sont égaux.
	 * 
	 * @param autreObjet
	 *            L'autre objet avec lequel on vérifie l'égalité.
	 * @return true si l'objet courant et l'autre objet sont égaux et false dans
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
	 * Implémentation de la méthode compareTo() de l'interface Comparable. Un
	 * objet de type NoeudJoueur est plus petit qu'un autre objet de type
	 * NoeudJoueur lorsque le joueur du premier objet est plus petit que le
	 * joueur du deuxième objet.
	 * 
	 * @param autreObjet
	 *            L'autre objet à comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est égal à l'autre objet.
	 */

	public int compareTo( NoeudJoueur autreObjet ) {
		int valCompare;

		valCompare = this.getJoueur().compareTo( autreObjet.getJoueur() );

		return valCompare;
	}
}