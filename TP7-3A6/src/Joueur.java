/**
 * Auteur  : Soti
 * Fichier : Joueur.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import java.io.*;

import outilsjava.*;

/**
 * La classe Joueur contient les informations et les méthodes pour un joueur.
 * Cette classe implémente les interfaces Comparable et Serializable.
 */

public class Joueur implements Comparable<Joueur>, Serializable {
	// Numéro d'identification pour la sauvegarde d'un joueur.
	static final long serialVersionUID = 1;

	// Champs d'instance privés de la classe Joueur.

	private String noJoueur; // Sert de clé.
	private String nomJoueur;
	private String force;
	/**
	 * Le constructeur Joueur() permet de construire un joueur de base.
	 */

	public Joueur() {
		this( "", "", "" );
	}

	/**
	 * Le constructeur Joueur() permet de construire un joueur avec des valeurs.
	 * 
	 * @param no
	 *            Un numéro de joueur.
	 * @param nom
	 *            Un nom de joueur.
	 * @param force
	 *            La force du joueur.
	 */

	public Joueur( String no, String nom, String force ) {
		this.setNoJoueur( no );
		this.setNomJoueur( nom );
		this.setForce( force );
	}

	/**
	 * Le mutateur setNoJoueur() permet d'initialiser le champ privé noJoueur.
	 * 
	 * @param no
	 *            Un numéro de joueur.
	 */

	public void setNoJoueur( String no ) {
		this.noJoueur = no;
	}

	/**
	 * Le mutateur setNomJoueur() permet d'initialiser le champ privé nomJoueur.
	 * 
	 * @param nom
	 *            Un nom de joueur.
	 */

	public void setNomJoueur( String nom ) {
		this.nomJoueur = nom;
	}

	/**
	 * Le mutateur setForce() permet d'initialiser le champ privé force.
	 * 
	 * @param force
	 *            La force du joueur.
	 */

	public void setForce( String force ) {
		this.force = force;
	}

	/**
	 * L'accesseur getNoJoueur() permet de retourner le numéro du joueur.
	 * 
	 * @return Le numéro du joueur.
	 */

	public String getNoJoueur() {
		return this.noJoueur;
	}

	/**
	 * L'accesseur getNomJoueur() permet de retourner le nom du joueur.
	 * 
	 * @return Le nom du joueur.
	 */

	public String getNomJoueur() {
		return this.nomJoueur;
	}

	/**
	 * L'accesseur getForce() permet de retourner la force du joueur.
	 * 
	 * @return La force du joueur.
	 */

	public String getForce() {
		return this.force;
	}

	/**
	 * La méthode publique lireNoJoueur() permet de lire un numéro de joueur et
	 * de l'affecter au champ privé noJoueur.
	 */

	public void lireNoJoueur() {
		final int MAX_CAR_NO_JOUEUR = 3;

		String no;

		no = OutilsLecture.lireChaineExacte( "Entrez le numéro du joueur ("
				+ MAX_CAR_NO_JOUEUR + " car.) : ", MAX_CAR_NO_JOUEUR );

		this.setNoJoueur( no );
	}

	/**
	 * La méthode publique lireNomJoueur() permet de lire un nom du joueur et de
	 * l'affecter au champ privé nomJoueur.
	 */

	public void lireNomJoueur() {
		final int MAX_CAR_NOM_JOUEUR = 40;

		String nom;

		nom = OutilsLecture.lireChaineValide( "Entrez le nom du joueur ("
				+ MAX_CAR_NOM_JOUEUR + " car. maximum) : ", 1,
				MAX_CAR_NOM_JOUEUR );

		this.setNomJoueur( nom );
	}

	/**
	 * La méthode publique lireForce() permet de lire une force pour le joueur
	 * et de l'affecter au champ privé force.
	 */

	public void lireForce() {
		final int MAX_CAR_FORCE = 40;

		String nom;

		nom = OutilsLecture.lireChaineValide( "Entrez la force du joueur ("
				+ MAX_CAR_FORCE + " car. maximum) : ", 1,
				MAX_CAR_FORCE );

		this.setForce( nom );
	}

	/**
	 * La méthode publique lireAutresRenseignements() permet de lire le nom et
	 * la force du joueur dont on connaît le numéro.
	 */

	public void lireAutresRenseignements() {
		System.out.println( "\nEntrez les renseignements du joueur "
				+ this.getNoJoueur() );

		this.lireNomJoueur();
		this.lireForce();
	}

	/**
	 * La méthode publique afficherJoueur() permet d'afficher les différents
	 * champs d'un joueur.
	 */

	public void afficherJoueur() {
		System.out.println( "\nRenseignements sur un joueur\n" );

		System.out.println( "Numéro du joueur : \t" + this.getNoJoueur() );
		System.out.println( "Nom du joueur : \t" + this.getNomJoueur() );
		System.out.println( "Force du joueur : \t" + this.getForce() );
	}

	/**
	 * Redéfinition de la méthode toString() de la classe Object.
	 * 
	 * @return Les informations du joueur sous forme de chaîne de caractères.
	 */

	public String toString() {
	   String infos;

	   infos = this.getClass().getName() + "[" + this.getNoJoueur() + "," +
	           this.getNomJoueur() + "," + this.getForce() + "]";

	   return infos;
	}

	/**
	 * Redéfinition de la méthode equals() de la classe Object. Deux objets de
	 * type Joueur sont égaux lorsque leurs noJoueur sont égaux. On ne fait pas
	 * de différence entre les caractères minuscules et les caractères
	 * majuscules.
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

			if ( autreObjet instanceof Joueur ) {
				Joueur autre = (Joueur) autreObjet;

				if ( this.getNoJoueur().equalsIgnoreCase( autre.getNoJoueur() ) ) {
					egalite = true;
				}
			}
		}

		return egalite;
	}

	/**
	 * Implémentation de la méthode compareTo() de l'interface Comparable. Un
	 * objet de type Joueur est plus petit qu'un autre objet de type Joueur
	 * lorsque le noJoueur du premier objet est alphabétiquement plus petit que
	 * le noJoueur du deuxième objet. On ne fait pas de différence entre les
	 * caractères minuscules et les caractères majuscules.
	 * 
	 * @param autreObjet
	 *            L'autre objet à comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est égal à l'autre objet.
	 */

	public int compareTo( Joueur autreObjet ) {
		int valCompare;

		valCompare = this.getNoJoueur().compareToIgnoreCase(
				autreObjet.getNoJoueur() );

		return valCompare;
	}
}