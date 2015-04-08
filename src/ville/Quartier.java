package ville;

/**
 * @author Courtin Alexis
 * @date 28/03/15
 * @version 0.0.1
 *
 * Classe qui permet de créer un quartier appartenant a une ville.
 * Ici pour simplifier nous avons fait le choix de représenter qu'une classe social de personne par quartier.
 */

import java.util.Random;

import entite.Entite;
import personne.Personne;
import personne.PersonneGroupe;

public final class Quartier extends Entite
{
    
    /* Attributs */
    private PersonneGroupe m_population; /** La population de la ville. */
    private ClasseSociale m_classe; /** La classe social de la population dans le quartier. */

    /* Constructeur */

<<<<<<< HEAD
    public Quartier( String nom, String description, PersonneGroupe population, ClasseSociale classe )
=======
    /**
     * @param Un groupe de personne.
     * @param Une classe sociale associé au quartier.
     */
    public Quartier( PersonneGroupe population, ClasseSociale classe )
>>>>>>> 4c5716c4e971ac54a5e58178dbc81d6a1c3365b9
    {
    	super( nom, description );
    	
    	m_population = population;

		m_classe = classe;
    }

<<<<<<< HEAD
    public Quartier( String nom, String description, int nombrePersonne, ClasseSociale classe, float pourcResVirus, float pourcResVaccin )
    {
    	super( nom, description );
    	
    	Random rand = new Random();
    	
    	m_classe = classe;

		m_population = new PersonneGroupe();
		
		for( int i = 0; i < nombrePersonne; i++ ){
			m_population.ajoutPersonne( new Personne( rand.nextBoolean() , pourcResVirus, pourcResVaccin) );
		}
=======
    /**
     * @param Le nombre de personnes dans le quartier.
     * @param La classe sociale associé au quartier.
     */
    public Quartier( int nombrePersonne, ClasseSociale classe )
    {
	m_classe = classe;

	m_population = new PersonneGroupe( nombrePersonne );	
>>>>>>> 4c5716c4e971ac54a5e58178dbc81d6a1c3365b9
    }

    /* Methodes */
    
<<<<<<< HEAD
    public boolean ajoutPersonne( boolean aRisque, float pourcResVirus, float pourcResVaccin )
    {
    	return m_population.ajoutPersonne( new Personne( aRisque, pourcResVirus, pourcResVaccin ) );
    }
    
    public int totalPersonne()
    {
    	return m_population.tailleGroupe();
    }
=======
    /**
     * Permet de vacciner tous le monde.
     */
    public void vacciner ( )
    {
	
    } 
>>>>>>> 4c5716c4e971ac54a5e58178dbc81d6a1c3365b9

}
