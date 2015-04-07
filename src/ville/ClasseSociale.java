package ville;

/**
 *
 */

public enum ClasseSociale
{
    riches("Riche", 0.40f),
    pauvres("Pauvre", 0.001f),
    travailleurs("Travaillant en dehors de sa ville", 0.75f);

    private String m_type;
    private float m_pourc;

    private ClasseSociale( String type, float pourcChangeVille )
    {
	m_type = type;
	m_pourc = pourcChangeVille;
    }

}
