//Etape 1: Import des packages requis
import java.sql.*;

public class bdd_lecture {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/college";
	
	//BDD IDs
	static final String USER ="root";
	static final String PWD="";

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

	public static void connEleveClasse(String nClasse) {
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
		      sql = "(SELECT  ine, nom, prenom, dateNaissance, adresse, absence, nomClasse FROM eleve WHERE nomClasse='"+nClasse+"')";
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
		  
	public static void connNiveau(int niv) {
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
		      sql = "(SELECT  ine, nom, prenom, absence, nomClasse.eleve FROM eleve, classe WHERE nomClasse.eleve = nomClasse.classe AND niveau.classe='"+niv+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nom = rs.getString("nom");
		    	  String prenom = rs.getString("prenom");
		    	  int ine = rs.getInt("ine");
		    	  float absence = rs.getFloat("absence");
		    	  String nomClasse = rs.getString("nomClasse");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("INE: "+ine);
		    	  System.out.print(", Nom: "+nom);
		    	  System.out.print(", Prenom:"+prenom);
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
		  
	public static void connListeProf() {
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
		  
	public static void connModifProf(int num, String nAdresse, String mat) {
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
		      sql = "(UPDATE enseignant SET adresse='"+nAdresse+"', matiere='"+mat+"' WHERE ine='"+num+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
				  int numen = rs.getInt("numen");
		    	  String adresse = rs.getString("adresse");
		    	  String matiere = rs.getString("matiere");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("NUMEN: "+numen);
		    	  System.out.print(", nouvelle adresse: "+adresse);
		    	  System.out.print(", nouvelle matiere: "+matiere);		  
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
		      sql = "(SELECT nomClasse, profPrincipal, niveau FROM classe WHERE nomClasse='"+nClasse+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nomClasse = rs.getString("nomClasse");
		    	  String profPrincipal = rs.getString("profPrincipal");
		    	  String niveau = rs.getString("niveau");
				  
		    	  //affichage des valeurs de la BDD
				  System.out.print("Classe: "+nomClasse);
		    	  System.out.print(", Professeur Principal: "+profPrincipal);
				  System.out.println(", niveau: "+niveau);
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
	
	public static void connModifClasse(String AcienNClasse, String NouveauNClasse, int niv, int profPrinc) {
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
		      sql = "(UPDATE nomClasse='"+NouveauNClasse+"', profPrincipal='"+profPrinc"', niveau='"+niv+"' FROM classe WHERE nomClasse='"+AcienNClasse+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nomClasse = rs.getString("nomClasse");
		    	  String profPrincipal = rs.getString("profPrincipal");
		    	  String niveau = rs.getString("niveau");
				  
		    	  //affichage des valeurs de la BDD
				  System.out.print("Classe: "+nomClasse);
		    	  System.out.print(", Professeur Principal: "+profPrincipal);
				  System.out.println(", niveau: "+niveau);
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
	
	public static void connAffMat() {
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
		      sql = "(SELECT matiere from note)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
				System.out.println(Liste des matières: );
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String matiere = rs.getString("matiere");
				  
		    	  //affichage des valeurs de la BDD
				  System.out.println(matiere);
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
	
	public static void connModifMat(String AcienMat, String NouvelleMat ) {
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
		      sql = "(UPDATE matiere='"+NouvelleMat+"' FROM ,note WHERE matiere='"+AcienMat+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nouvelleMat = rs.getString("NouvelleMat");
		    	  String acienneMat = rs.getString("AcienMat");
				  
		    	  //affichage des valeurs de la BDD
				  System.out.print("Acienne Matière: "+nouvelleMat);
		    	  System.out.println(", Nouvelle Matière: "+acienneMat)
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
