package model;

public class Client {
private int id;
private String prenom;
private String nom;
private String ville;
private int tel;

//Constructeur
public Client(int id, String prenom, String nom, String ville, int tel) {
	super();
	this.id = id;
	this.prenom = prenom;
	this.nom = nom;
	this.ville = ville;
	this.tel = tel;
}

public Client() {
	super();
}

//contructeur qui gere l'auto incrementation de l'id
public Client(String prenom, String nom, String ville, int tel) {
	super();
	this.prenom = prenom;
	this.nom = nom;
	this.ville = ville;
	this.tel = tel;
}

//getter et setter 
public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getPrenom() {
	return prenom;
}

public void setPrenom(String prenom) {
	this.prenom = prenom;
}

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public String getVille() {
	return ville;
}

public void setVille(String ville) {
	this.ville = ville;
}

public int getTel() {
	return tel;
}

public void setTel(int tel) {
	this.tel = tel;
} 


}
