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
    private static int nombreEntite = 0; // Ici pour que les classes filles ne peuvent pas modifier la valeur de cet attribut.

    /** Attributs nom: Est le nom de l'entité. */
    protected String m_nom;

    /** Attributs description: Est la description de l'entitée. */
    protected String m_description;
    
    /**
     * Constructeur par défaut.
     */
    public Entite()
    /* Ce constructeur n'est qu'ici pour incrémenté le nombre d'instance de la classe Entite.  */
    {
	m_nom = "Nom Vide";
	m_description = "Description Vide";

	nombreEntite++;
    }

    /**
     * @param Nom de l'entité.
     * @param Description de l'entité.
     */
    public Entite( String nom, String description )
    /* Ce constructeur est ici pour initialisé les attributs. */
    {
	m_nom = nom;
	m_description = description;

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
     * @return String renvoyant le nom de l'entite.
     */
    public String nom(){ return m_nom; }

    /**
     * @param Nouveau nom de l'entite.
     */
    public void nom( String nom ) { m_nom = nom; }
    
    /**
     * @param Nouvelle description de l'entite.
     */
    public void description( String description ) { m_description = description; }

    /**
     * @return Retourne description de l'entite.
     */
    public String toString() { return m_description; }

}
