package ville;

/**
 * Représente une ville.
 */

import java.util.ArrayList;

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
    
}
