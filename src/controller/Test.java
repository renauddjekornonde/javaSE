package controller;

import dao.ConnexionJdbc;
import model.Client;

public class Test {

	public static void main(String[] args) {
	//	ConnexionJdbc cj= new ConnexionJdbc();
		//cj.connect();
		
		Client cl= new Client("Abdou","Diouf","Dakar",7700000);
		TraitementClient tc= new TraitementClient();
		tc.ajouter(cl);
	}
}
