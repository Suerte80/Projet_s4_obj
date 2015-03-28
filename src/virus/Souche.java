package virus;

/**
 * @author Courtin Alexis
 * @date 25/03/15
 * @version 0.0.1
 */

import entite.Entite;
import personne.Personne;

public abstract Souche extends Entite implements SoucheBase
{

     /* Attributs */
    
     /** Attribut qui permet de savoir le pourcentage de contagiosité de la souche. */
     protected float m_contagiosite;

     /** Pourcentage de "chance" pour la personne infécté meurt rapidement ou pas. */
     protected float m_letalite;
    
     /** Temps d'incubation du virus en frame ( de jeu ). */
     protected int m_tempsIncubation;

     /** Temps durant laquelle la personne peut contaminé son entourage. */
     protected int m_tempsContamination;

     /* Constructeur */

     /**
      * @param Nom de la souche.
      * @param Description de la souche.
      * @param Pourcentage de contagiosité de la souche.
      * @param Pourcentage pour que la souche tue une personne aprés la phase de contamination.
      * @param Le temps d'incubation en frames ( in game ).
      * @param Le temps pendant que le virus peut contaminé d'autre personne.
      */
     public Souche( String nom, String description, float contagiosite, float letalite, int tempsIncubation, int tempsContamination )
     {
	  super( nom, description );

	  m_contagiosite = contagiosite;
	  m_letalite = letalite;
	  m_tempsIncubation = tempsIncubation;
	  m_tempsContamination = tempsContamination;

     }
    
     /* Methodes */

     abstract public void changementStat();

     /**
      * @param Une personne.
      */
     public void changeEtatPers( Personne p ) { p.evolueEtat(); }

     /**
      * Cette fonction infecte une personne sans faire le calcul de statistique.
      * @param Une personne.
      */
     public void infecter( Personne p )
     {
	  if( p.etatMalade() == PalierMaladie.nonMalade )
	       p.evolueEtat();
     }

}
