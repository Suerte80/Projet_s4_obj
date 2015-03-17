package entite;

import java.awt.Color;
import java.awt.Point;
import java.awt.Shape;
import java.awt.geom.Arc2D;
import java.awt.geom.Rectangle2D;

import display.Affichable;
import display.GUIEpidemie;

/**
 * Cette classe impl&eacute;mente la classe display.Affichable. Elle mod&eacute;lise 
 * une entit&eacute; basique dans le jeu. 
 * 
 * @author Courtin Alexis
 * @version 0.0.1
 *
$ */

public class Entite implements Affichable
{
	/**
	 * Il y a 6 arguments:
	 * 	- nom: Qui d&eacute;crit le nom de l'entit&eacute;.
	 * 	- shape: Qui d&eacute;crit la forme de l'entit&eacute;.
	 * 	- couleur: Qui d&eacute;crit la couleur de l'entit&eacute;.
	 * 	- texte: Qui d&eacute;crit le texte qui sera &eacute;crit a la position positionTexte.
	 * 	- positionTexte: Qui d&eacute;crit la position du texte li&eacute; a la shape.
	 * 	- positionEntite: Qui d&eacute;crit la position de l'entit&eacute; dans la fenetre avec sa hauteur et sa largeur.
	 */

	protected String nom;
	protected Shape shape;
	protected Color couleur;
	protected String texte;
	protected Point positionTexte;
	
	public Entite( String n, Shape s, Color c, String str, Point posTexte )
	{
		nom = n;
		shape = s;
		couleur = c;
		texte = str;
		positionTexte = posTexte;
	}
	
	public Shape getShape()
	{
		return shape;
	}

	public Color getColor()
	{
		return couleur;
	}

	public String getString()
	{
		return texte;
	}

	public Point getStringPosition()
	{
		return positionTexte;
	}
	
	public void setShape( Shape s )
	{
		shape = s;
	}
	
	public static void main( String[] args )
	{
		GUIEpidemie e = new GUIEpidemie("Test !", 800, 600, Color.BLUE);
		e.addAffichable( new Entite("test",
				new Rectangle2D.Float(100, 100, 100, 100),
				Color.WHITE,
				"Je suis un teste !",
					    new Point(100, 
	}
	
}
