package com.Tp1Solutions;

public class Tp1 {

	public static void main(String[] args) {
		//Test
		System.out.println("Bonjour le monde, mon environnement Java est pret ! ");
		//EX1 w EX2
		Voiture v1= new Voiture("Renault","Clio",2020);
		v1.afficherDetails();
		v1.SetM("Dacia");
		System.out.println(" ");
		v1.afficherDetails();
		System.out.println(v1.GetM());
		//EX3:
		Article a1= new Article("Pc",5000);
		a1.toString();
		Article a2= new Article("lizi",30);
		Article a3= new Article("TV",3500);
		Panier p= new Panier();
		p.ajouterArticle(a1);
		p.ajouterArticle(a2);
		p.ajouterArticle(a3);
		System.out.println(" ");
		p.afficherPanier();
		System.out.println(p.calculerTotal());
		
		//EX4 : 
		Utulisateur u1= new Utulisateur("Ahmed");
		Utulisateur u2= new Utulisateur("hmed");
		Utulisateur u3= new Utulisateur("Ilyass");
		
		System.out.println("Nombre Total d utulisateur crees  :  "  + Utulisateur.getCompteurUtulisateurs());

		
		
		
		
		
		
		
		
	}

}
