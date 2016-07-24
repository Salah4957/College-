//Etape 1: Import des packages requis
import java.sql.*;

public class bdd_lecture {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:8889/college";
	
	//BDD IDs
	static final String USER ="root";
	static final String PWD="root";
	
	public static void connLectAllEleve() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion établie...");
		      
		    //Etape 4: Execution de la requête
		      System.out.println("Création de la requête...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT  ine, nom, prenom, dateNaissance, adresse, absence, nomClasse FROM eleve)";
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
		    	  String nomClasse = rs.getString("nomClasse");
		    	  
		    	  gestionnaireEleves g = new gestionnaireEleves();
				  eleve e6A1 = new eleve (nom, prenom, dateNaissance, adresse, ine, absence);
				  g.ajouteEleve(e6A1);		
				  //TODO add to class
				  
		    	  //affichage des valeurs de la BDD
				  System.out.print("INE: "+ine);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
		    	  System.out.print(", Date de Naissance: "+dateNaissance);
		    	  System.out.print(", adresse: "+adresse);
		    	  System.out.print(", Absence: "+absence);
		    	  System.out.println(", Classe: "+nomClasse);
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
		  }
	
	public static void connLectEleve(int ID) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion établie...");
		      
		    //Etape 4: Execution de la requête
		      System.out.println("Création de la requête...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT  ine, nom, prenom, dateNaissance, adresse, absence, nomClasse FROM eleve WHERE ine='"+ID+"')";
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
		    	  String nomClasse = rs.getString("nomClasse");
		    	  gestionnaireEleves g = new gestionnaireEleves();
				  eleve e6A1 = new eleve (nom, prenom, dateNaissance, adresse, ine, absence);
				  g.ajouteEleve(e6A1);		
				  //TODO add to class
		    	  //affichage des valeurs de la BDD
				  System.out.print("INE: "+ine);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
		    	  System.out.print(", Date de Naissance: "+dateNaissance);
		    	  System.out.print(", adresse: "+adresse);
		    	  System.out.print(", Absence: "+absence);
		    	  System.out.println(", Classe: "+nomClasse);
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
		  }

	public static void connLectAllProf() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion établie...");
		      
		    //Etape 4: Execution de la requête
		      System.out.println("Création de la requête...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT numen, nom, prenom, dateNaissance, adresse, matiere, nomClasse FROM enseignant)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
				  int numen = rs.getInt("numen");
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  String dateNaissance = rs.getString("dateNaissance");
		    	  String adresse = rs.getString("adresse");
		    	  matiere matiere = rs.getmatiere("matiere"); // à modifier : s'inspirer de menu.java ligne 782
				  String nomClasse = rs.getString("nomClasse");
				  gestionnaireEnseignants p = new gestionnaireEnseignants();
				  enseignant prof = new enseignant (numen, nom, prenom, dateNaissance, adresse, matiere, nomClasse);
			      p.ajouteEnseignant(prof);
		    	  //affichage des valeurs de la BDD
				  System.out.print("NUMEN: "+numen);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
		    	  System.out.print(", Date de Naissance: "+dateNaissance);
		    	  System.out.print(", adresse: "+adresse);
		    	  System.out.print(", Matiere: "+matiere);
				  System.out.println(", Classe: "+nomClasse);				  
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
		  }
	
	public static void connLectProf(int NUM) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion établie...");
		      
		    //Etape 4: Execution de la requête
		      System.out.println("Création de la requête...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT numen, nom, prenom, dateNaissance, adresse, matiere, nomClasse FROM enseignant WHERE numen='"+NUM+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
				  int numen = rs.getInt("numen");
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  String dateNaissance = rs.getString("dateNaissance");
		    	  String adresse = rs.getString("adresse");
		    	  String matiere = rs.getString("matiere");
				  String nomClasse = rs.getString("nomClasse");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("NUMEN: "+numen);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
		    	  System.out.print(", Date de Naissance: "+dateNaissance);
		    	  System.out.print(", adresse: "+adresse);
		    	  System.out.print(", Matiere: "+matiere);
				  System.out.println(", Classe: "+nomClasse);				  
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
		  }
	public static void connLectAllClasse() {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion établie...");
		      
		    //Etape 4: Execution de la requête
		      System.out.println("Création de la requête...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT nomClasse, niveau, profPrincipal, FROM classe)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nomClasse = rs.getString("nomClasse");
		    	  int niveau = rs.getInt("niveau");
		    	  String profPrincipal = rs.getString("profPrincipal");
		    	  gestionnaireClasses college = new gestionnaireClasses();
				  classe classe6A = new classe(profPrincipal, niveau, nomClasse);
				  college.ajouteClasse(classe6A);
		    	  //affichage des valeurs de la BDD
				  System.out.print("Classe: "+nomClasse);
				  System.out.print("Niveau: "+niveau);
		    	  System.out.println(", Professeur Principal: "+profPrincipal);
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
		  }
	
	public static void connLectClasse(String nClasse) {
		Connection conn = null;
		Statement stmt = null;
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion établie...");
		      
		    //Etape 4: Execution de la requête
		      System.out.println("Création de la requête...");
		      stmt = conn.createStatement();
		      String sql;
		      sql = "(SELECT nomClasse, profPrincipal, FROM classe WHERE nomClasse='"+nClasse+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nomClasse = rs.getString("nomClasse");
		    	  String profPrincipal = rs.getString("profPrincipal");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("Classe: "+nomClasse);
		    	  System.out.println(", Professeur Principal: "+profPrincipal);
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
		  }
}
