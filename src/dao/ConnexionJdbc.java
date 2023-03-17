package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnexionJdbc {
	public Connection Co= null;
	public Statement State= null;
	
	public void connect() {
		
		//Chargement de driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Connexion a la base de donnée
		try {
			Co= DriverManager.getConnection("jdbc:mysql://localhost/javaSE", "root", "");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//Creation du statement
		try {
			State= Co.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
