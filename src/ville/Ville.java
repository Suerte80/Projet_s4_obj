<<<<<<< HEAD
package ville;

/**
 * Représente une ville.
=======
package Ville;

/**
 * @author Courtin Alexis
 * @date 30/03/15
 * @version 0.0.1
 *
 * Cette classe permet de modeliser une ville.
>>>>>>> 4c5716c4e971ac54a5e58178dbc81d6a1c3365b9
 */

import java.util.ArrayList;

<<<<<<< HEAD
public class Ville
{
    /* Attributs */
    protected ArrayList<Quartier> m_quartiers;
    protected int m_totalPop;
    protected int m_totalPopMedical;

    /* Constructeurs */
    public Ville()
    {
		m_quartiers = new ArrayList<Quartier>();
		m_totalPop = 0;
		m_totalPopMedical = 0;
    }

    public Ville( ArrayList<Quartier> quartiers )
    {
    	m_quartiers = quartiers;
    	m_totalPop = 0;
    	m_totalPopMedical = 0;
    }
    
    /* Méthodes */
    
    /**
     * Ajoute un quartier dans la ville.
     * 
     * @param Un quartier.
     * @return Un boolean VRAI si réussie FAUX sinon.
     */
    public boolean ajoutQuartier( Quartier quartier )
    {
    	m_quartiers.add( quartier );
    	m_totalPop += quartier.totalPersonne();
    	
    	return true;
    }
    
    public boolean ajoutPersonnelMedical( int n )
    {
    	m_totalPopMedical += n;
    	
    	return true;
    }
    
    public boolean suppressionPersonnelMedical( int n )
    {
    	m_totalPopMedical -= n;
    	
    	if( m_totalPopMedical < 0 )
    		m_totalPopMedical = 0;
    	
    	return true;
    }
    
=======
public Ville extends Entite
{
    /* Attributs */
    protected ArrayList<Quartier> m_quartiers;
    protected int m_totalPopulation;

    /* Constructeurs */
    
    public Ville( ArrayList<Quartier> quartier )
    {
	 
    }

    /* Methodes public */

    /* Methodes privées */

>>>>>>> 4c5716c4e971ac54a5e58178dbc81d6a1c3365b9
}
