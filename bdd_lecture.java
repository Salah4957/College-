//Etape 1: Import des packages requis
import java.sql.*;

public class bdd_lecture {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/college";
	
	//BDD IDs
	static final String USER ="root";
	static final String PWD="";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
		      
		    //Etape 4: Execution de la requête
		      System.out.println("Création de la requête...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "SELECT nom, prenom, dateNaissance, adresse, ine, absence FROM eleve";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  String dateNaissance = rs.getString("dateNaissance");
		    	  String adresse = rs.getString("adresse");
		    	  int ine = rs.getInt("ine");
		    	  float absence = rs.getFloat("absence");
		    	  
		    	  //affichage des valeurs de la BDD
		    	  System.out.print("Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
		    	  System.out.print(", Date de Naissance: "+dateNaissance);
		    	  System.out.print(", adresse: "+adresse);
		    	  System.out.print(", INE: "+ine);
		    	  System.out.println(", Absence: "+absence);
		      }
		      
		    //Etape 6: Nettoyage de l'environnement
		      rs.close();
		      stmt.close();
		      conn.close();		         
		    } 
		    catch (SQLException se) {
		    	//Gestion erreurs pour JDBC
		      se.printStackTrace();
		    }
		    catch (Exception e){
		    	//Gestion erreurs pour Class.forName
		    	e.printStackTrace();
		    }
		    finally{
		    	//bloc finally utilisé pour fermer les ressources
		    	try{
		    		if(stmt != null)
		    			stmt.close();
		    	}
		    	catch (SQLException se2){
		    	}//rien à faire
		    	try{
		    		if(conn != null)
		    			conn.close();
		    	}
		    	catch (SQLException se){
		    		se.printStackTrace();
		    	}
		    }
		    System.out.println("Au revoir!");
		  }
}
