package display;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.lang.IllegalArgumentException;
import java.util.ArrayList;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;

/** Fen&ecirc;tre pour l'affichage d'objets de type Affichable et l'interaction souris avec ces objets. L'affichage peut se faire sur un fond color&eacute; ou sur une image. */
public class GUIEpidemie extends JFrame implements MouseListener{
	
	private int offset = 12;
	private Graphic p;
	private Color fond = null;
	private BufferedImage img = null;
	private ArrayList<Affichable> elements;
	private ArrayList<MouseEvent> clics;
	private JTextField jtf;
	
	/** Cr&eacute;e une JFrame permettant d'afficher sur la couleur de fond sp&eacute;cifi&eacute;e des Affichable ayant des coordonn&eacute;es dans [0..largeur,0..hauteur]. */
	public GUIEpidemie(String titre, int largeur, int hauteur, Color fond){
		super(titre);
		this.elements = new ArrayList<Affichable>();
		this.clics = new ArrayList<MouseEvent>();
		this.fond = fond;
		this.setLayout(new BorderLayout());
		this.p = new Graphic();
		this.p.addMouseListener(this);
		this.getContentPane().add(this.p,BorderLayout.CENTER);
		jtf = new JTextField(20);
		this.getContentPane().add(jtf,BorderLayout.SOUTH);
		this.setSize(largeur,hauteur);
		this.setResizable(false);
		this.setLocation((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width-this.getWidth())/2,(java.awt.Toolkit.getDefaultToolkit().getScreenSize().height-this.getHeight())/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/** Cr&eacute;e une JFrame permettant d'afficher des Affichable sur l'image de fond sp&eacute;cifi&eacute;e. 
	  * @throws IOException si le fichier image sp&eacute;cifi&eacute; n'existe pas ou n'est pas une image lisible. */
	public GUIEpidemie(String titre, String fichierImage) throws IOException{
		super(titre);
		this.elements = new ArrayList<Affichable>();
		this.clics = new ArrayList<MouseEvent>();
		this.fond = fond;
		this.img = ImageIO.read(new File(fichierImage));
		this.setLayout(new BorderLayout());
		this.p = new Graphic();
		this.p.addMouseListener(this);
		this.getContentPane().add(this.p,BorderLayout.CENTER);
		jtf = new JTextField(20);
		this.getContentPane().add(jtf,BorderLayout.SOUTH);
		this.setSize(img.getWidth(),img.getHeight());
		this.setResizable(false);
		this.setLocation((java.awt.Toolkit.getDefaultToolkit().getScreenSize().width-this.getWidth())/2,(java.awt.Toolkit.getDefaultToolkit().getScreenSize().height-this.getHeight())/2);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	/** Ajoute un Affichable &agrave; l'interface et rafraichit l'affichage. */
	public void addAffichable(Affichable a){
		this.elements.add(a);
		this.p.repaint();
	}
	
	/** Retire un Affichable de l'interface et rafraichit l'affichage. */
	public boolean removeAffichable(Affichable a){
		if(this.elements.remove(a)){
			this.p.repaint();
			return true;
		}
		else return false;
	}
	
	public void mouseClicked(MouseEvent e){
		this.clics.add(e);
	}
	
	public void mouseEntered(MouseEvent e){}
	
	public void mouseExited(MouseEvent e){}
	
	public void mousePressed(MouseEvent e){}
	
	public void mouseReleased(MouseEvent e){}
	
	/** Retourne un MouseEvent correspondant au dernier clic de l'utilisateur, ou null s'il n'y a plus de clic à renvoyer. */
	public MouseEvent getClic(){
		if(this.clics.isEmpty()) return null;
		else return this.clics.remove(0);
	}
	
	private class Graphic extends JPanel{
		public void paint(Graphics gr){
			if(GUIEpidemie.this.fond != null){
				gr.setColor(GUIEpidemie.this.fond);
				gr.fillRect(0,0,this.getWidth(),this.getHeight());
			}
			if(GUIEpidemie.this.img != null){
				gr.drawImage(GUIEpidemie.this.img,0,0,this);
			}
			for(Affichable a:GUIEpidemie.this.elements){
				gr.setColor(a.getColor());
				((Graphics2D) gr).fill(a.getShape());
				gr.setColor(Color.BLACK);
				gr.setFont(gr.getFont().deriveFont(Font.BOLD));
				Point p = a.getStringPosition();
				String[] s = a.getString().split("\n");
				for(int i=0;i<s.length;i++) gr.drawString(s[i],p.x,p.y+(i+1)*GUIEpidemie.this.offset);
			}
		}
	}
	
	/** Affiche le message m dans une boite de dialogue. */
	public void displayMessage(String m){
		JOptionPane.showMessageDialog(this,m);
	}
	
	/** Affiche le texte s dans la zone de texte en bas de la fen&ecirc;tre. */
	public void setBottomFieldText(String s){
		this.jtf.setText(s);
	}	
	
}