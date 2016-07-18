//Etape 1: Import des packages requis
import java.sql.*;

public class bdd {
	//JDBC diver nom et database URL
	static final String JDBC_DRIVER ="com.mysql.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost/college";
	
	//BDD IDs
	static final String USER ="root";
	static final String PWD="";
	
	public void connexionAjoutEleve(int ine, String nom, String prenom, String dateNaissance, String adresse, float absence, String nomClasse){
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
			System.out.println("Insertion des données dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO eleve " +
						 "VALUES ('"+this.nom+"', '"+this.prenom+"', '"+this.dateNaissance+"', '"+this.adresse+"', '"+this.ine+"', '"+this.absence+"', '"+this.nomClasse+"')";
			stmt.executeUpdate(sql);
      
			System.out.println("Données ajoutées dans la table...");

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
			//bloc finally utilisé pour fermer les ressources
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
	
	public void connexionAjoutProf(int numen, String nom, String prenom, String dateNaissance, String adresse, String matiere, String nomClasse){
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
			System.out.println("Insertion des données dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO enseignant " +
						 "VALUES ('"+this.nom+"', '"+this.prenom+"', '"+this.dateNaissance+"', '"+this.adresse+"', '"+this.numen+"', '"+this.matiere+"', '"+this.nomClasse+"')";
			stmt.executeUpdate(sql);
      
			System.out.println("Données ajoutées dans la table...");

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
			//bloc finally utilisé pour fermer les ressources
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
	
	public void connexionAjoutNote(String matiere, int ine, float note, String nomClasse){
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
			System.out.println("Insertion des données dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO note " +
						 "VALUES ('"+this.matiere+"', '"+this.ine+"', '"+this.note+"', '"+this.nomClasse+"')";
			stmt.executeUpdate(sql);
      
			System.out.println("Données ajoutées dans la table...");

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
			//bloc finally utilisé pour fermer les ressources
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
	
	public void connexionAjoutClasse(String nomClasse, int numen){
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
			System.out.println("Insertion des données dans la table...");
			stmt = conn.createStatement();
      
			String sql = "INSERT INTO classe " +
						 "VALUES ('"+this.nomClasse+"', '"+this.numen+"')";
			stmt.executeUpdate(sql);
      
			System.out.println("Données ajoutées dans la table...");

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
			//bloc finally utilisé pour fermer les ressources
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
