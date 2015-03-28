package ville;

/**
 * @author Courtin Alexis
 * @date 28/03/15
 * @version 0.0.1
 *
 * Classe qui permet de créer un quartier appartenant a une ville.
 * Ici pour simplifier nous avons fait le choix de représenter qu'une classe social de personne par quartier.
 */

import entite.Entite;
import personne.PersonneGroupe;

public final class Quartier extends Entite
{
    
    /* Attributs */
    private PersonneGroupe m_population; /** La population de la ville. */
    private ClasseSociale m_classe; /** La classe social de la population dans le quartier. */

    /* Constructeur */

    public Quartier( PersonneGroupe population, ClasseSociale classe )
    {
	m_population = population;

	m_classe = classe;
    }

    public Quartier( int nombrePersonne, ClasseSociale classe )
    {
	
    }

    /* Methodes */

}
