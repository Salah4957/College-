//STEP 1. Import des packages requis
import java.sql.*;

public class bdd_ajout {
   //JDBC diver nom et database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost/college";

   //BDD IDs
   static final String USER = "root";
   static final String PASS = "";
   
   public static void main(String[] args) {
   Connection conn = null;
   Statement stmt = null;
   try{
      //Etape 2: Enregistrement JDBC Driver
      Class.forName("com.mysql.jdbc.Driver");

      //Etape 3: Ouverture connexion
      System.out.println("Connecting to a selected database...");
      conn = DriverManager.getConnection(DB_URL, USER, PASS);
      System.out.println("Connected database successfully...");
      
      //Etape 4: Execution de la requête
      System.out.println("Inserting records into the table...");
      stmt = conn.createStatement();
      
      String sql = "INSERT INTO eleve " +
                   "VALUES ('George', 'Mickael', '14/08/46', ' ', 182345987, 0.5)";
      stmt.executeUpdate(sql);
      
      System.out.println("Inserted records into the table...");

   }catch(SQLException se){
      //Gestion erreurs pour JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Gestion erreurs pour Class.forName
      e.printStackTrace();
   }finally{
      //bloc finally utilisé pour fermer les ressources
      try{
         if(stmt!=null)
            conn.close();
      }catch(SQLException se){
      }// do nothing
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }
   }
   System.out.println("Au revoir!");
}
}
