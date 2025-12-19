package com.Tp1Solutions;

public class Utulisateur {
	
	private String nom;
	private static int compteurUtulisateurs=0;
	
	public Utulisateur(String n) {
		this.nom=n;
		compteurUtulisateurs++;
		
	}
	
	
	public static int getCompteurUtulisateurs() {
		return compteurUtulisateurs;
	}

}
