package personne;

/**
 * @author Courtin Alexis
 * @date 19/03/15
 *
 * Classe qui représente une personne.
 */

public class Personne
{

    /* Constructeurs */
    
    /**
     * Constructeur par défault.
     */
    public Personne()
    {
	m_aRisque = false;
	m_pourcResVirus = 0.0f;
	m_pourcResVaccin = 0.0f;
	m_etatMalade = PalierMaladie.nonMalade;

	m_nombrePersonne++;
    }

    /**
     * @param Permet de savoir si la personne est une personne a risque ou pas.
     * @param Pourcentage de résistance au Virus.
     * @param Pourcentage de resistance au Vaccin.
     */
    public Personne( boolean aRisque, float pourcResVirus, float pourcResVaccin )
    {
	m_aRisque = aRisque;
	m_pourcResVirus = pourcResVirus;
	m_pourcResVaccin = pourcResVaccin;
	m_etatMalade = PalierMaladie.nonMalade;

	m_nombrePersonne++;
    }
    
    /**
     * @param Permet de savoir si la personne est une personne a risque ou pas.
     * @param Pourcentage de résistance au Virus.
     * @param Pourcentage de resistance au Vaccin.
     * @param Détermine l'état du patient.
     */
    public Personne( boolean aRisque, float pourcResVirus, float pourcResVaccin, PalierMaladie etatMalade )
    {
	m_aRisque = aRisque;
	m_pourcResVirus = pourcResVirus;
	m_pourcResVaccin = pourcResVaccin;
	m_etatMalade = etatMalade;
	
	m_nombrePersonne++;
    }

    /* Attributs de classe */

    /** Nombre de classe Personne instancié. */
    private static int m_nombrePersonne = 0;
    
    /** Pourcentage d'ajout losque une personne est aRisque. */
    private static final float m_pourcARisque = 0.15f;

    /** Vrai si la personne a un risque suplémentaire d'etre malade faux sinon. */
    protected boolean m_aRisque; // Si la personne est une personne a risque on lui ajoute "pourcARisque" % de chance d'attrapé le virus.
    
    /** Pourcentage de résistance a la maladie. */
    protected float m_pourcResVirus;

    /** Pourcentage de résistance au vaccin. */
    protected float m_pourcResVaccin;

    /** Enumération PalierMaladie qui décrit le palier de la maladie. */
    protected PalierMaladie m_etatMalade;
    
rea    /* Methodes */
    
    /** @return Nombre de Personne instancié. */
    public static final int nombrePersonne() { return m_nombrePersonne; }
    
    /** @return Pourcentage a ajouter si la personne est a risque. */
    protected static final float pourcARisque() { return m_pourcARisque; }

    /** @return Si c'est une personne a risque ou pas. */
    public boolean aRisque() { return m_aRisque; }

    /** @return Pourcentage de la résistance au virus de la personne. */
    public float pourcResVirus() { return m_pourcResVirus; }

    /** @return Pourcentage de la résistance au vaccin de la personne. */
    public float pourcResVaccin() { return m_pourcResVaccin; }

    /** @return Retourne l'état du malade. */
    public PalierMaladie etatMalade() { return m_etatMalade; }

    /** @param Etat du malade. */
    public void etatMalade( PalierMaladie etatMalade ) { m_etatMalade = etatMalade; }


    /** Fait évoluer l'état du malade vers l'état suivant */
    public void evolueEtat()
    {

	if( m_etatMalade == PalierMaladie.nonMalade )
	    m_etatMalade = PalierMaladie.incubation;
	else if( m_etatMalade == PalierMaladie.incubation )
	    m_etatMalade = PalierMaladie.contamination;
	else if( m_etatMalade == PalierMaladie.contamination  )
	    m_etatMalade = PalierMaladie.mort;
	else
	    m_etatMalade = PalierMaladie.mort;

    }

}
