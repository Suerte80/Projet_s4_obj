package entite;

/**
 * Cette classe modélise une entitée de base ( ex:  virus/bactérie ou Ville ).
 * 
 * @author Courtin Alexis
 * @version 0.0.1
 *
 */

public class Entite
{
    /* Attributs */
    private static final int nombreEntite = 0; // Ici pour que les classes filles ne peuvent pas modifier la valeur de cet attribut.

    /** Attributs nom: Est le nom de l'entité. */
    protected String nom;

    /** Attributs description: Est la description de l'entitée. */
    protected String description;
    
    /**
     * Constructeur par défaut.
     */
    public Entite()
    /* Ce constructeur n'est qu'ici pour incrémenté le nombre d'instance de la classe Entite.  */
    {
	nom = "Nom Vide";
	description = "Description Vide";

	nombreEntite++;
    }

    /**
     * @param Nom de l'entité.
     * @param Description de l'entité.
     */
    public Entite( String n, String d )
    /* Ce constructeur est ici pour initialisé les attributs. */
    {
	nom = n;
	description = d;

	nombreEntite ++;
    }

    /* Methodes */

    /**
     * @return Nombre d'instance de la classe Entite.
     */
    public final static int nombreEntite()
    {
	return nombreEntite;
    }

    /**
     * @return Le nombre d'entité dans le programme.
     */
    public static int nombreEntite() { return nombreEntite; }

    /**
     * @return String renvoyant le nom de l'entite.
     */
    public String nom(){ return nom; }

    /**
     * @param Nouveau nom de l'entite.
     */
    public void nom( String n ) { nom = n; }
    
    /**
     * @param Nouvelle description de l'entite.
     */
    public void description( String d ) { description = d; }
    
    /**
     * @return Retourne la description de l'entite.
     */
    public String description() { return description; }

    /**
     * @return Retourne description de l'entite.
     */
    public String toString() { return description; }

}
