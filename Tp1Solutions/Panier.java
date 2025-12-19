package com.Tp1Solutions;

public class Panier {
	
	private Article [] art;
	private int nbrArt;
	
	public Panier() {
		art= new Article[5];
		nbrArt=0;
		
		
	}
	
	public void ajouterArticle(Article a) {
		if (nbrArt < art.length ) {
			art[nbrArt]=a;
			nbrArt++;
		}
		else {
			System.out.println("Panier est Plein ");
		}
	}
	
	public double calculerTotal() {
		double Total=0;
		for(int i=0;i<nbrArt;i++ ) {
			Total=Total+art[i].prix;
		}
		return Total;
	}
	
	public void afficherPanier() {
        System.out.println("Panier {");

	    for (int i = 0; i < nbrArt; i++) {
	    	
	        System.out.println(art[i].toString());
	    }
	    System.out.println("       }");
	}

}
