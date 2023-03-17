package controller;

import java.sql.ResultSet;
import java.sql.SQLException;

import dao.ConnexionJdbc;
import model.Client;

public class TraitementClient {

	
	//Ajouter
	public void ajouter(Client cl) {
		ConnexionJdbc cj= new ConnexionJdbc();
		
		cj.connect();
		String req= "INSERT INTO Client(prenom,nom,ville,tel) VALUES ('"+cl.getPrenom()+"','"+cl.getNom()+"','"+cl.getVille()+"','"+cl.getTel()+"')";
		
		try {
			cj.State.executeUpdate(req);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Supprimer
	public void supprimer(int id) {
		
	}
	
	//Modifier
	public void modifier(Client cl) {
		
	}
	//Lister
	public ResultSet liste() {
		ResultSet rs= null;
		
		
		return rs;
	}
	
	//Rechercher
	public Client recherche(int id) {
		Client cl= null;
		
		
		return cl;
	}
}
