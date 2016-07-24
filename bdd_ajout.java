//Etape 1: Import des packages requis
import java.sql.*;

public class bdd_ajout {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/college";
	
	//BDD IDs
	static final String USER ="root";
	static final String PWD="";
	
	public static void connexionAjoutEleve(int ine, String nom, String prenom, String dateNaissance, String adresse, float absence, String nomClasse){
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion Ã  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion Ã©tablie...");				  
		
			//Etape 4: Execution de la requÃªte
			System.out.println("Insertion des donnÃ©es dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO eleve " +
						 "VALUES (" + ine + ",'" +nom+"', '"+ prenom + "','"+dateNaissance+"', '"+adresse+"', '"+absence+"', '"+nomClasse+"')";
			System.out.println("RequÃªte : "+sql);
			stmt.executeUpdate(sql);
      
			System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilisÃ© pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
	public static void connexionAjoutProf(int numen, String nom, String prenom, String dateNaissance, String adresse, String matiere, String nomClasse){
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion Ã  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion Ã©tablie...");				  
		
			//Etape 4: Execution de la requÃªte
			System.out.println("Insertion des donnÃ©es dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO enseignant " +
						 "VALUES (" + numen + ",'" +nom+"', '"+prenom+"', '"+dateNaissance+"', '"+adresse+"','"+matiere+"', '"+nomClasse+"')";
			stmt.executeUpdate(sql);
      
			System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilisÃ© pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
	public static void connexionAjoutClasse(String nomClasse, int niveau, String profPrincipal){
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion Ã  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion Ã©tablie...");				  
		
			//Etape 4: Execution de la requÃªte
			System.out.println("Insertion des donnÃ©es dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO classe " +
						 "VALUES ('"+nomClasse+"', '"+niveau+", '"+profPrincipal+"')";
			stmt.executeUpdate(sql);
      
			System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilisÃ© pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
	public static void connexionAjoutNote(String matiere, int ine, float note){
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion Ã  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion Ã©tablie...");				  
		
			//Etape 4: Execution de la requÃªte
			System.out.println("Insertion des donnÃ©es dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO note " +
						 "VALUES ('"+matiere+"', '"+ine+"', '"+note+"')";
			stmt.executeUpdate(sql);
      
			System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilisÃ© pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
	public static void connexionAjoutMatiere(String matiere){
		Connection conn = null;
		Statement stmt = null;
		try {
		    //Etape 2: Enregistrement JDBC Driver
		      Class.forName("com.mysql.jdbc.Driver");
		      System.out.println("Driver O.K.");
		      
		    //Etape 3: Ouverture connexion
		      System.out.println("Connexion Ã  la BDD...");
		      conn = DriverManager.getConnection(DB_URL,USER, PWD);
			  System.out.println("Connexion Ã©tablie...");				  
		
			//Etape 4: Execution de la requÃªte
			System.out.println("Insertion des donnÃ©es dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO matiere " +
						 "VALUES ('"+matiere+"')";
			stmt.executeUpdate(sql);
      
			System.out.println("DonnÃ©es ajoutÃ©es dans la table...");

		}
		catch(SQLException se){
			//Gestion erreurs pour JDBC
			se.printStackTrace();
		}
		catch(Exception e){
			//Gestion erreurs pour Class.forName
			e.printStackTrace();
		}
		finally{
			//bloc finally utilisÃ© pour fermer les ressources
			try{
				if(stmt!=null)
				conn.close();
			}
			catch(SQLException se){
			}// do nothing
			try{
				if(conn!=null)
				conn.close();
			}
			catch(SQLException se){
				se.printStackTrace();
			}
		}
		System.out.println("Fin connexion BDD...");
	}
	
}
