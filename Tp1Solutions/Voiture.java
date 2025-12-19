package com.Tp1Solutions;

public class Voiture {
	private String marque ;
	private String modele;
	private int annee;
	
	public Voiture(String marque , String modele,int an) {
		this.marque=marque;
		this.modele=modele;
		this.annee=an;
	}
	
	public void afficherDetails() {
		System.out.println("voiture: "+marque+","+modele+",Annee: "+annee);
	}
	
	public void SetM(String marque) {
		this.marque=marque;
	}
	
	public String GetM() {
		return marque;
	}
}
