//Etape 1: Import des packages requis
import java.sql.*;

public class bdd_lecture {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/college";
	
	//BDD IDs
	static final String USER ="root";
	static final String PWD="";
	
	//====================================================================================================================================================================================
	//====================================================================================================================================================================================
	//====================================================================================================================================================================================
/**CONNEXION BDD RELATIF AUX ELEVES*/	
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
		      
		    //Etape 4: Execution de la requÃªte
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
		    	  String nClasse = rs.getString("nomClasse");
		    	  classe nomClasse = new classe(nClasse);
		    	  gestionnaireEleves g = new gestionnaireEleves();
				  eleve e6A1 = new eleve (nom, prenom, dateNaissance, adresse, nomClasse, ine, absence);
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
	
	public static gestionnaireEleves connLectEleve(int ID) {
		Connection conn = null;
		Statement stmt = null;
		gestionnaireEleves el = new gestionnaireEleves();
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
		    	  String nClasse = rs.getString("nomClasse");
		    	  classe nomClasse = new classe(nClasse);
				  eleve e = new eleve (nom, prenom, dateNaissance, adresse, nomClasse, ine, absence);
				  el.ajouteEleve(e);		
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
			return el;
		  }

	public static gestionnaireClasses connEleveClasse(String nClas) {
		Connection conn = null;
		Statement stmt = null;
		gestionnaireClasses college = new gestionnaireClasses();
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
		      sql = "(SELECT  ine, nom, prenom, dateNaissance, adresse, absence, nomClasse FROM eleve WHERE nomClasse='"+nClas+"')";
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
		    	  String nClasse = rs.getString("nomClasse");
		    	  classe nomClasse = new classe(nClasse);
		    	  
		    	  //création objet
		    	  eleve e = new eleve (nom, prenom, dateNaissance, adresse, nomClasse, ine, absence);
				  classe c = new classe();
				  c.ajoutEleve(e);
		    	  college.ajouteClasse(c);		
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
			return college;
		  }
	
	public static gestionnaireClasses connEleveNiveau(int niv) {
		Connection conn = null;
		Statement stmt = null;
		gestionnaireClasses college = new gestionnaireClasses();
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
		      sql = "(SELECT  ine, nom, prenom, dateNaissance, adresse, absence, nomClasse.eleve FROM eleve, classe WHERE nomClasse.eleve = nomClasse.classe AND niveau.classe='"+niv+"')";
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
		    	  String nomClasse = rs.getString("nomClasse.eleve");
		    	  classe nClasse = new classe(nomClasse);
		    	  
		    	  //crétion objet
		    	  eleve e = new eleve (nom, prenom, dateNaissance, adresse, nClasse, ine, absence);
				  classe c = new classe();
				  c.ajoutEleve(e);
		    	  college.ajouteClasse(c);	
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
			return college;
		  }
		
		//====================================================================================================================================================================================
		//====================================================================================================================================================================================
		//====================================================================================================================================================================================
/**CONNEXION BDD RELATIF AUX ENSEIGNANTS**/
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
		      
		    //Etape 4: Execution de la requÃªte
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
		    	  String mat = rs.getString("matiere"); // à modifier : s'inspirer de menu.java ligne 782
		    	  matiere matiere = new matiere(mat);
				  String nClasse = rs.getString("nomClasse");
				  classe nomClasse = new classe (nClasse);
				  gestionnaireEnseignants p = new gestionnaireEnseignants();
				  enseignant prof = new enseignant (nom, prenom, adresse, dateNaissance, nomClasse, numen, matiere);
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
	
	public static gestionnaireEnseignants connLectProf(int NUM) {
		Connection conn = null;
		Statement stmt = null;
		gestionnaireEnseignants prof = new gestionnaireEnseignants();
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion établie...");
		      
		    //Etape 4: Execution de la requête
		      System.out.println("CrÃ©ation de la requête...");
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
		    	  
		    	  //création objet
				  classe nClasse = new classe(nomClasse);
				  matiere mat = new matiere (matiere);
				  enseignant p = new enseignant (nom, prenom, dateNaissance, adresse, nClasse, numen, mat);	
				  prof.ajouteEnseignant(p);
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
			return prof;
		  }
	
	public static gestionnaireEnseignants connListeProf() {
		Connection conn = null;
		Statement stmt = null;
		gestionnaireEnseignants prof = new gestionnaireEnseignants();
		    try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion à la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion établie...");
		      
		    //Etape 4: Execution de la requÃªte
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
		    	  
		    	  //création objet
				  classe nClasse = new classe(nomClasse);
				  matiere mat = new matiere (matiere);
				  enseignant p = new enseignant (nom, prenom, dateNaissance, adresse, nClasse, numen, mat);	
				  prof.ajouteEnseignant(p);
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
			return prof;
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

		//====================================================================================================================================================================================
		//====================================================================================================================================================================================
		//====================================================================================================================================================================================	
/**CONNEXION BDD RELATIF AU CLASSES*/
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
		      sql = "(SELECT nomClasse, niveau, profPrincipal FROM classe)";
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
	
	public static gestionnaireClasses connLectClasse(String nClasse) {
		Connection conn = null;
		Statement stmt = null;
		gestionnaireClasses college = new gestionnaireClasses();
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
		    	  int niveau = rs.getInt("niveau");
		    	  
		    	  //création objet
				  classe c = new classe (profPrincipal, niveau, nomClasse);
				  college.ajouteClasse(c);
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
			return college;
		  }
	
	public static void connModifClasse(String AcienNClasse, String NouveauNClasse, int niv, String profPrinc) {
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
		      sql = "(UPDATE nomClasse='"+NouveauNClasse+"', profPrincipal='"+profPrinc+"', niveau='"+niv+"' FROM classe WHERE nomClasse='"+AcienNClasse+"')";
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

		//====================================================================================================================================================================================
		//====================================================================================================================================================================================
		//====================================================================================================================================================================================
/**CONNEXION BDD RELATIF AUX NOTES*/
	public static void connLectNote(int el) {
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
		      sql = "(SELECT matiere, ine, note FROM classe WHERE ine='"+el+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String matiere = rs.getString("matiere");
		    	  int ine = rs.getInt("ine");
		    	  float note = rs.getFloat("note");
		    	  
		    	  //affichage des valeurs de la BDD
				  System.out.print("Matière: "+matiere);
		    	  System.out.println(", Eleve: "+ine);
		    	  System.out.println(", Note: "+note);
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

		//====================================================================================================================================================================================
		//====================================================================================================================================================================================
		//====================================================================================================================================================================================
/**CONNEXION BDD RELATIF AUX MATIERES*/
	public static gestionnaireMatieres connListeMatiere() {
		Connection conn = null;
		Statement stmt = null;
		gestionnaireMatieres m = new gestionnaireMatieres();
		
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
		      sql = "(SELECT nomMatiere FROM matiere)";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String nomMatiere = rs.getString("nomMatiere");
		    	  
		    	  //affichage des valeurs de la BDD
				  matiere mat = new matiere(nomMatiere);
				  m.ajouteMatiere(mat);
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
			return m;
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
		    	  System.out.println(", Nouvelle Matière: "+acienneMat);
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
	
			//====================================================================================================================================================================================
			//====================================================================================================================================================================================
			//====================================================================================================================================================================================
/**CONNEXION BDD RELATIF AU BULLETIN**/
	public static gestionnaireClasses connClasseBulletin(int IN) {
		Connection conn = null;
		Statement stmt = null;
		gestionnaireClasses college = new gestionnaireClasses();
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
		      sql = "(SELECT  ProfPrincipal, niveau, nomClasse.classe FROM eleve, classe WHERE nomClasse.eleve = nomClasse.classe AND ine='"+IN+"')";
		      ResultSet rs = stmt.executeQuery(sql);
		      
		    //Etape 5: Extraction data du ResultSet
		      while(rs.next()){
		    	  //Retrieve par colonne
		    	  String ProfPrincipal = rs.getString("ProfPrincipal");
		    	  String nomClasse = rs.getString("nomClasse.classe");
		    	  int niveau = rs.getInt("niveau");
		    	  
		    	  //création objet
				  classe c = new classe(ProfPrincipal, niveau, nomClasse);
		    	  college.ajouteClasse(c);		
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
			return college;
		  }

}

