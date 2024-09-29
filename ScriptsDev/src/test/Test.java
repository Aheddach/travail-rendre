
package test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Test {
    public static void createtab(){ 
       //information d'accès à la base de données 
            String user = "root"; 
            String password = ""; 
            String url = "jdbc:mysql://localhost:3306/scriptsdev"; 
            Connection cn = null; 
            Statement st = null; 
            
            try{ 
        //etape 1 : chargement du driver 
                Class.forName("com.mysql.jdbc.Driver"); 
        //etape 2 : récupération de la connexion 
                cn = DriverManager.getConnection(url, user, password); 
                
        //etape 3 : création de statement 
                st = cn.createStatement(); 
                String req = "CREATE TABLE DevData (\n" +"Developpeurs VARCHAR (32),\n" +"Jour CHAR (11),\n" +"NbScripts INTEGER)";
        //etape 4 : exécution de la requête          
                st.executeUpdate(req);
            }catch (SQLException e){
                System.out.println("Erreur SQL");
            }catch (ClassNotFoundException ex){
                System.out.println("Impossible de charger le driver");
            }finally {
            try{
                   //etape 5 : libérer les ressources de la mémoire
                   st.close();
                   cn.close();
            }catch (SQLException ex){
                   System.out.println("Impossible de libérer les ressources");
                }
        } 
    
    }
   
    public static void insert(){
        //information d'accès à la base de données 
                   String user = "root"; 
                   String password = ""; 
                   String url = "jdbc:mysql://localhost:3306/scriptsdev"; 
                   Connection cn = null; 
                   Statement st = null;
                   int nbUpdated;
                   try{ 
        //etape 1 : chargement du driver 
                Class.forName("com.mysql.jdbc.Driver"); 
        //etape 2 : récupération de la connexion 
                cn = DriverManager.getConnection(url, user, password); 
                
        //etape 3 : création de statement 
                st = cn.createStatement(); 
                String req = "INSERT INTO `devdata` VALUES ('SAFI', 'Mardi', 2)";
                
        //etape 4 : exécution de la requête          
                nbUpdated = st.executeUpdate(req);
                
        }catch (SQLException e){
                System.out.println("Erreur SQL");
        }catch (ClassNotFoundException ex){
                System.out.println("Impossible de charger le driver");
        }finally {
                try{
                   //etape 5 : libérer les ressources de la mémoire
                   st.close();
                   cn.close();
                }catch (SQLException ex){
                   System.out.println("Impossible de libérer les ressources");
                }
        } 
    
    }    
}
