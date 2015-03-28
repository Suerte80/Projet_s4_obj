package virus;

/**
 * @author Courtin Alexis
 * @date 25/03/15
 * @version 0.0.1
 */

import personne.Personne;

public interface SoucheBase
{

    /** Permet de changement de statistique de la souche ( viral ou bactérienne ). */
    public void changementStat();

    /** Permet de faire changer d'état d'une personne. */
    public void changeEtatPers( Personne p );

    /** Permet d'infecter une personne. */
    public void infecter( Personne p );

} 
