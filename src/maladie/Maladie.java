package maladie;

/**
 * Interface qui décrit l'action que doit avoir une maladie.
 */

import personne.Personne;
import ville.Quartier;
import ville.Ville;

public interface Maladie
{

    /** @return Pourcentage de contagiosité. */
    public float contagiosite();
    
    /** @param Pourcentage de contagiosité. */
    protected void contagiosite( float pourcContaguisite );

    /** @return Pourcentage de létalité. */
    public float letalite();

    /** @param Pourcentage de létalité. */
    protected void letalite( float pourcLetalite );

    /** @return Le temps d'incubation en frames. */
    public int tempsIncubation();

    /** @param Le temps d'incubation en frames. */
    protected void tempsIncubation( int tempsIncubation );

    /** @return Le temps de contamination en frames. */
    public int tempsContamination();

    /** @param Le temps de contamination en frames. */
    protected void tempsContamination( int tpsIncub );

    /**
     * @return Si l'infection a réussis sur la personne.
     * @param Une personne.
     */
    public boolean infectionPersonne( Personne pers );

    /**
     * @return Si l'infection a réussis sur le Quartier.
     * @param Un quartier.
     */
    public boolean infectionQuartier( Quartier quar );

    /**
     * @return Si l'infection a réussis sur la Ville.
     * @pram Une ville.
     */
    public boolean infectionVille( Ville vi );

}
