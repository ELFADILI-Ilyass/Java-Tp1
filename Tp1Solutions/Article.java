package com.Tp1Solutions;

public class Article {

	private String nom;
	public double prix;
	
	public Article(String n , double p) {
		nom=n;
		prix=p;

	}
	
	public String toString() {
		return "Article[nom: " +nom+", prix= "+prix+"]";
	}
}
