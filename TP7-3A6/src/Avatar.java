/**
 * Auteur  : Soti
 * Fichier : Avatar.java
 * Cours   : 420-3A6-MO (TP7, Affectation Joueurs, Avatars)
 * Date    : 12 décembre 2018
 */

// Packages.

import java.io.*;

import outilsjava.*;

/**
 * La classe Avatar contient les informations et les méthodes pour un avatar.
 * Cette classe implémente les interfaces Comparable et Serializable.
 */

public class Avatar implements Comparable<Avatar>, Serializable {

	// Numéro d'identification pour la sauvegarde d'un avatar.
	static final long serialVersionUID = 2;

	// Champs d'instance privés de la classe Avatar.

	private String noAvatar; // Sert de clé.
	private String nomAvatar;
	private String apparence;
	private String caracteristiques;
	private String competences;

	/**
	 * Le constructeur Avatar() permet de construire un avatar de base.
	 */

	public Avatar() {
		this( "", "", "", "", "" );
	}

	/**
	 * Le constructeur Avatar() permet de construire un avatar avec des valeurs.
	 * 
	 * @param no
	 *            Le numéro de l'avatar.
	 * @param nom
	 *            Le nom de l'avatar.
	 * @param appar
	 *            L'apparence de l'avatar.
	 * @param carac
	 *            Les caractéristiques de l'avatar.
	 * @param comp
	 *            Les compétences de l'avatar.
	 */

	public Avatar( String no, String nom, String appar, String carac,
		String comp ) {

		this.setNoAvatar( no );
		this.setNomAvatar( nom );
		this.setApparence( appar );
		this.setCaracteristiques( carac );
		this.setCompetences( comp );
	}

	/**
	 * Le mutateur setNoAvatar() permet d'initialiser le champ privé noAvatar.
	 * 
	 * @param no
	 *            Le numéro de l'avatar.
	 */

	public void setNoAvatar( String no ) {
		this.noAvatar = no;
	}

	/**
	 * Le mutateur setNomAvatar() permet d'initialiser le champ privé nomAvatar.
	 * 
	 * @param nom
	 *            Le nom de l'avatar.
	 */

	public void setNomAvatar( String nom ) {
		this.nomAvatar = nom;
	}

	/**
	 * Le mutateur setApparence() permet d'initialiser le champ privé apparence.
	 * 
	 * @param apparence
	 *            L'apparence de l'avatar.
	 */

	public void setApparence( String apparence ) {
		this.apparence = apparence;
	}

	/**
	 * Le mutateur setCaracteristiques() permet d'initialiser le champ privé
	 * caracteristiques.
	 * 
	 * @param caracteristiques
	 *            Les caractéristiques de l'avatar.
	 */

	public void setCaracteristiques( String caracteristiques ) {
		this.caracteristiques = caracteristiques;
	}

	/**
	 * Le mutateur setCompetences() permet d'initialiser le champ privé
	 * competences.
	 * 
	 * @param competences
	 *            Les compétences de l'avatar.
	 */

	public void setCompetences( String competences ) {
		this.competences = competences;
	}

	/**
	 * L'accesseur getNoAvatar() permet de retourner le numéro de l'avatar.
	 * 
	 * @return Le numéro de l'avatar.
	 */

	public String getNoAvatar() {
		return this.noAvatar;
	}

	/**
	 * L'accesseur getNomAvatar() permet de retourner le nom de l'avatar.
	 * 
	 * @return Le nom de l'avatar.
	 */

	public String getNomAvatar() {
		return this.nomAvatar;
	}

	/**
	 * L'accesseur getApparence() permet de retourner l'apparence de l'avatar.
	 * 
	 * @return L'apparence de l'avatar.
	 */

	public String getApparence() {
		return this.apparence;
	}

	/**
	 * L'accesseur getCaracteristiques() permet de retourner les
	 * caractéristiques de l'avatar.
	 * 
	 * @return Les caractéristiques de l'avatar.
	 */

	public String getCaracteristiques() {
		return this.caracteristiques;
	}

	/**
	 * L'accesseur getCompetences() permet de retourner les compétences de
	 * l'avatar.
	 * 
	 * @return Les compétences de l'avatar.
	 */

	public String getCompetences() {
		return this.competences;
	}

	/**
	 * La méthode publique lireNoAvatar() permet de lire un numéro d'avatar et
	 * de l'affecter au champ privé noAvatar.
	 */

	public void lireNoAvatar() {
		final int MAX_CAR_NO_AVATAR = 3;

		String no;

		no =
			OutilsLecture.lireChaineExacte( "Entrez le numéro de l'avatar ("
				+ MAX_CAR_NO_AVATAR + " car.) : ", MAX_CAR_NO_AVATAR );

		this.setNoAvatar( no );
	}

	/**
	 * La méthode publique lireNomAvatar() permet de lire un nom d'avatar et de
	 * l'affecter au champ privé nomAvatar.
	 */

	public void lireNomAvatar() {
		final int MAX_CAR_NOM_AVATAR = 40;

		String nom;

		nom =
			OutilsLecture.lireChaineValide( "Entrez le nom de l'avatar ("
				+ MAX_CAR_NOM_AVATAR + " car. maximum) : ", 1,
				MAX_CAR_NOM_AVATAR );

		this.setNomAvatar( nom );
	}

	/**
	 * La méthode publique lireApparence() permet de lire l'apparence d'un
	 * avatar et de l'affecter au champ privé apparence.
	 */

	public void lireApparence() {
		final int MAX_CAR_APPARENCE = 50;

		String appar;

		appar =
			OutilsLecture
				.lireChaineValide( "Entrez l'apparence de l'avatar ("
					+ MAX_CAR_APPARENCE + " car. maximum) : ", 1,
					MAX_CAR_APPARENCE );

		this.setApparence( appar );
	}

	/**
	 * La méthode publique lireCaracteristiques() permet de lire les
	 * caractéristiques d'un avatar et de l'affecter au champ privé
	 * caracteristiques.
	 */

	public void lireCaracteristiques() {
		final int MAX_CAR_CARACTERISTIQUES = 80;

		String carac;

		carac =
			OutilsLecture.lireChaineValide(
				"Entrez les caractéristiques de l'avatar ("
					+ MAX_CAR_CARACTERISTIQUES + " car. maximum) : ", 1,
				MAX_CAR_CARACTERISTIQUES );

		this.setCaracteristiques( carac );
	}

	/**
	 * La méthode publique lireCompetences() permet de lire les compétences d'un
	 * avatar et de l'affecter au champ privé competences.
	 */

	public void lireCompetences() {
		final int MAX_CAR_COMPETENCES = 80;

		String comp;

		comp =
			OutilsLecture.lireChaineValide(
				"Entrez les compétences de l'avatar (" + MAX_CAR_COMPETENCES
					+ " car. maximum) : ", 1, MAX_CAR_COMPETENCES );

		this.setCompetences( comp );
	}

	/**
	 * La méthode publique lireAutresRenseignements() permet de lire le nom,
	 * l'apparence, les caractéristiques et les compétences de l'avatar dont on
	 * connaît le numéro.
	 */

	public void lireAutresRenseignements() {
		System.out.println( "\nEntrez les renseignements de l'avatar "
			+ this.getNoAvatar() );

		this.lireNomAvatar();
		this.lireApparence();
		this.lireCaracteristiques();
		this.lireCompetences();
	}

	/**
	 * La méthode publique afficherAvatar() permet d'afficher les différents
	 * champs d'un avatar.
	 */

	public void afficherAvatar() {
		System.out.println( "\nRenseignements sur un avatar\n" );

		System.out.println( "Numéro de l'avatar : \t\t" + this.getNoAvatar() );
		System.out.println( "Nom de l'avatar : \t\t" + this.getNomAvatar() );
		System.out.println( "Apparence de l'avatar : \t" + this.getApparence() );
		System.out.println( "Caractéristiques de l'avatar : \t"
			+ this.getCaracteristiques() );
		System.out.println( "Compétences de l'avatar : \t"
			+ this.getCompetences() );
	}

	/**
	 * Redéfinition de la méthode toString() de la classe Object.
	 * 
	 * @return Les informations de l'avatar sous forme de chaîne de caractères.
	 */

	public String toString() {
		String infos;

		infos =
			this.getClass().getName() + "[" + this.getNoAvatar() + ","
				+ this.getNomAvatar() + "," + this.getApparence() + ","
				+ this.getCaracteristiques() + "," + this.getCompetences()
				+ "]";

		return infos;
	}

	/**
	 * Redéfinition de la méthode equals() de la classe Object. Deux objets de
	 * type Avatar sont égaux lorsque leurs noAvatar sont égaux. On ne fait pas
	 * de différence entre les caractères minuscules et les caractères
	 * majuscules.
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

			if ( autreObjet instanceof Avatar ) {
				Avatar autre = (Avatar) autreObjet;

				if ( this.getNoAvatar().equalsIgnoreCase( 
													autre.getNoAvatar() ) ) {
					egalite = true;
				}
			}
		}

		return egalite;
	}

	/**
	 * Implémentation de la méthode compareTo() de l'interface Comparable. Un
	 * objet de type Avatar est plus petit qu'un autre objet de type Avatar
	 * lorsque le noAvatar du premier objet est alphabétiquement plus petit que
	 * le noAvatar du deuxième objet. On ne fait pas de différence entre les
	 * caractères minuscules et les caractères majuscules.
	 * 
	 * @param autreObjet
	 *            L'autre objet à comparer.
	 * @return <0 si l'objet courant est plus petit que l'autre objet, >0 si
	 *         l'objet courant est plus grand que l'autre objet et 0 si l'objet
	 *         courant est égal à l'autre objet.
	 */

	public int compareTo( Avatar autreObjet ) {
		int valCompare;

		valCompare =
			this.getNoAvatar().compareToIgnoreCase( autreObjet.getNoAvatar() );

		return valCompare;
	}
}
