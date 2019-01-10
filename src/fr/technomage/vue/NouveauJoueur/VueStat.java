package fr.technomage.vue.NouveauJoueur;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import fr.technomage.objet.Game;
import fr.technomage.objet.miscellaneous.Classe;
import fr.technomage.objet.swing.TLabel;
import fr.technomage.objet.swing.TPanel;
import fr.technomage.vue.Vue;



@SuppressWarnings("serial")
public class VueStat extends TPanel{

	/* ATTRIBUTS PRIVES */
	
	private TPanel panelGauche;
	private TLabel lbForce;
	private TLabel lbIntelligence;
	private TLabel lbAgilité;
	private TLabel lbConstitution;
	private TLabel lbEsprit;
	
	private TPanel panelDroite;
	private TLabel lbPV;
	private TLabel lbRésistance;
	private TLabel lbPhysique;
	private TLabel lbCritique;
	private TLabel lbEsquive;
	private TLabel lbMA;
	private TLabel lbPuissance;
	private TLabel lbMagie;
	private TLabel lbPrécision;
	private TLabel lbVitesse;
	
	/* CONSTRUCTEUR */
	
	public VueStat(Vue vue, VueNouveauJoueur vueNouveauJoueur){
		super(true);
		
		Classe classe = Game.getUneClasseByIndex(0);
		
		this.setLayout(new BorderLayout());
		
		int force = classe.getForce();
		int intelligence = classe.getIntelligence();
		int agilité = classe.getAgilité();
		int constitution = classe.getConstitution();
		int esprit = classe.getEsprit();
		
		/* PANEL GAUCHE */
		
		this.lbForce = new TLabel("Force : " + force);
		this.lbForce.setForeground(new Color(200, 20, 20));
		this.lbIntelligence = new TLabel("Intelligence : " + intelligence);
		this.lbIntelligence.setForeground(new Color(50, 100, 220));
		this.lbAgilité = new TLabel("Agilité : " + agilité);
		this.lbAgilité.setForeground(new Color(40, 180, 60));
		this.lbConstitution = new TLabel("Constitution : " + constitution);
		this.lbConstitution.setForeground(Color.ORANGE);
		this.lbEsprit = new TLabel("Esprit : " + esprit);
		this.lbEsprit.setForeground(Color.PINK);
		
		this.panelGauche = new TPanel(true);
		
		this.panelGauche.setLayout(new GridBagLayout());
		GridBagConstraints c = new GridBagConstraints();
		
		Insets iLeft = new Insets(5, 10, 5, 5);
		Insets iRight = new Insets(5, 5, 5, 10);
		
		c.insets = iLeft;
		c.gridx = 0;
		c.gridy = 0;
		this.panelGauche.add(lbForce, c);
		c.insets = iRight;
		c.gridx++;
		this.panelGauche.add(lbIntelligence, c);
		c.insets = iLeft;
		c.gridx = 0;
		c.gridy++;
		this.panelGauche.add(lbAgilité, c);
		c.insets = iRight;
		c.gridx++;
		this.panelGauche.add(lbConstitution, c);
		c.insets = iLeft;
		c.gridx = 0;
		c.gridy++;
		c.gridwidth = 2;
		this.panelGauche.add(lbEsprit, c);
		this.add(this.panelGauche, BorderLayout.WEST);
		
		/* PANEL DROITE */
		
		this.panelDroite = new TPanel(false);
		
		this.panelDroite.setLayout(new GridBagLayout());
		c = new GridBagConstraints();
		
		this.lbPV = new TLabel("PV : " + (constitution*5));
		this.lbRésistance = new TLabel("Résistance : " + (constitution/5));
		this.lbPhysique = new TLabel("Physique : " + (force/2));
		this.lbCritique = new TLabel("Critique : " + (force/6));
		this.lbEsquive = new TLabel("Esquive : " + (agilité/3));
		this.lbMA = new TLabel("MA : " + (esprit*3));
		this.lbPuissance = new TLabel("Puissance : " + (esprit/7));
		this.lbMagie = new TLabel("Magie : " + (intelligence/3));
		this.lbPrécision = new TLabel("Précision : " + (agilité/4));
		this.lbVitesse = new TLabel("Vitesse : " + (agilité/5));
		
		c.insets = new Insets(10, 10, 10, 10);
		c.gridx = 0;
		c.gridy = 0;
		this.panelDroite.add(lbPV, c);
		c.gridx++;
		this.panelDroite.add(lbRésistance, c);
		c.gridx++;
		this.panelDroite.add(lbPhysique, c);
		c.gridx++;
		this.panelDroite.add(lbCritique, c);
		c.gridx++;
		this.panelDroite.add(lbEsquive, c);
		c.gridx = 0;
		c.gridy++;
		this.panelDroite.add(lbMA, c);
		c.gridx++;
		this.panelDroite.add(lbPuissance, c);
		c.gridx++;
		this.panelDroite.add(lbMagie, c);
		c.gridx++;
		this.panelDroite.add(lbPrécision, c);
		c.gridx++;
		this.panelDroite.add(lbVitesse, c);
		this.add(this.panelDroite, BorderLayout.CENTER);
	}
	
	public void updateStat(int index) {
		Classe classe = Game.getUneClasseByIndex(index);
		
		int force = classe.getForce();
		int intelligence = classe.getIntelligence();
		int agilité = classe.getAgilité();
		int constitution = classe.getConstitution();
		int esprit = classe.getEsprit();
		
		
		this.lbForce.setText("Force : " + force);
		this.lbIntelligence.setText("Intelligence : " + intelligence);
		this.lbAgilité.setText("Agilité : " + agilité);
		this.lbConstitution.setText("Constitution : " + constitution);
		this.lbEsprit.setText("Esprit : " + esprit);
		
		this.lbPV.setText("PV : " + (constitution*5));
		this.lbRésistance.setText("Résistance : " + (constitution/5));
		this.lbPhysique.setText("Physique : " + (force/2));
		this.lbCritique.setText("Critique : " + (force/6));
		this.lbEsquive.setText("Esquive : " + (agilité/3));
		this.lbMA.setText("MA : " + (esprit*3));
		this.lbPuissance.setText("Puissance : " + (esprit/7));
		this.lbMagie.setText("Magie : " + (intelligence/3));
		this.lbPrécision.setText("Précision : " + (agilité/4));
		this.lbVitesse.setText("Vitesse : " + (agilité/5));
	}
}
