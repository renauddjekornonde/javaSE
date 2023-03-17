package model;

public class Fournisseur {
private int id;
private String nom;
private String prenom;
private String adresse;

//constructeur par défaut
public Fournisseur() {
	super();
}

//Constructeur avec paramètre
public Fournisseur(int id, String nom, String prenom, String adresse) {
	super();
	this.id = id;
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
}

//constructeur sans id
public Fournisseur(String nom, String prenom, String adresse) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.adresse = adresse;
}








}
