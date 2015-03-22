package personne;

/**
 * Classe qui permet d'avoir un groupe de personne
 */

import java.util.LinkedList;
import java.util.Iterator;

import personne.Personne;


public class PersonneGroupe
{
    /* Attribut de classe */

    /** Attribut qui représente la taille du groupe. */
    protected int m_tailleGroupe;

    /** Attribut qui représente le groupe. */
    protected LinkedList<Personne> m_liste;

    /* Constructeurs */
    
    /** Constructeur par défaut. */
    public PersonneGroupe()
    {
	m_tailleGroupe = 0;
	m_liste = new LinkedList<Personne>();
    }

    /**
     * @param Taille du groupe;
     */
    public PersonneGroupe( int tailleGroupe )
    {
	m_tailleGroupe = tailleGroupe;
	
	m_liste = new LinkedList<Personne>();

	for( int i = 0; i < m_tailleGroupe; i++ ){
	    if( ! m_liste.add( new Personne() ) )
		return;
	}
    }

    /**
     * @param Taille du groupe.
     * @param Si la personne est une personne a risque ou pas.
     * @param Pourcentage de resistance au Virus.
     * @param Pourcentage de résistance au Vaccin.
     */
    public PersonneGroupe( int tailleGroupe, boolean aRisque, float pourcResVirus, float pourcResVaccin )
    {
	m_tailleGroupe = tailleGroupe;
	
	m_liste = new LinkedList<Personne>();

	for( int i = 0; i < m_tailleGroupe; i++ )
	    if( ! m_liste.add( new Personne( aRisque, pourcResVirus, pourcResVaccin ) ) )
		return;
    }

    /**
     * @param Taille du groupe.
     * @param Si la personne est une personne a risque ou pas.
     * @param Pourcentage de resistance au Virus.
     * @param Pourcentage de résistance au Vaccin.
     * @param Stade de la maladie.
     */
    public PersonneGroupe( int tailleGroupe, boolean aRisque, float pourcResVirus, float pourcResVaccin, PalierMaladie etatMalade )
    {
	m_tailleGroupe = tailleGroupe;
	
	m_liste = new LinkedList<Personne>();

	for( int i = 0; i < m_tailleGroupe; i++ )
	    if( ! m_liste.add( new Personne( aRisque, pourcResVirus, pourcResVaccin, etatMalade ) ) )
		return;
    }

    /**
     * @param Une LinkedList de personne qui représentera le groupe.
     */
    public PersonneGroupe( LinkedList<Personne> groupe )
    {
	m_tailleGroupe = groupe.size();

	m_liste = groupe;
    }

    /* Methodes */
    
    /**
     * @param Une personne a ajouté dans le groupe.
     * @return Si l'opération a réussis ou non.
     */
    public boolean ajoutPersonne( Personne pers ) { m_tailleGroupe++; return m_liste.add( pers ); }

    /** Supprime les gens mort du groupe. */
    public void supprMort()
    {
	int temp_Taille = m_tailleGroupe;
	for( int i = 0; i < m_tailleGroupe; i++ )
	    if( m_liste.get( i ).etatMalade() == PalierMaladie.mort ){
		m_liste.remove(i);
		m_tailleGroupe--;
	    }
    }

    /**
     * @return La taille du groupe.
     */
    public int taille()
    {
	return m_tailleGroupe;
    }

    /**
     * Methode qui ajoute un personnage au groupe.
     * @param Un instance de la classe Personne.
     */
    public void ajout( Personne pers )
    {
	m_tailleGroupe ++;

	m_liste.push( pers );
    }

    /**
     * Methode qui supprime toutes les personnes.
     */
    public void supprimerGroupe() { suppressionListe(); }

    protected void suppressionListe()
    {
	for( int i = 0; i < m_tailleGroupe; i++ )
	    m_liste.removeFirst();

	m_tailleGroupe = 0;
    }

    /**
     * Fonction qui fera évoluer une personne au rang "rang".
     * @param Rang du personnage.
     */
    public void evolutionPersonnage( int rang ) { (m_liste.get( rang )).evolueEtat(); }

}
