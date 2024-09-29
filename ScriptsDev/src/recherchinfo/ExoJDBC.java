
package recherchinfo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author ACCENT W5000
 */
public class ExoJDBC {
    

    public static void maxscripts(){
            
        //information d'accès à la base de données :
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/scriptsdev";
        Connection cn = null;
        Statement st = null;
        ResultSet rs =null;

        try{
        //Etape 1 : Chargement du driver :
            Class.forName("com.mysql.jdbc.Driver");

        //Etape 2 : Récupération de la connexion :
            cn = DriverManager.getConnection(url, user, password);

        //Etape 3 : Création de statement :        
            st = cn.createStatement();
            String req = "SELECT Developpeurs, jour, max(NBScripts)\n" +
                         "from devdata\n" +
                         "group by jour";

        //Etape 4 : Exécution de la requête :       
            rs =st.executeQuery(req);
            
            int resultsetType = rs.getType();
        //Etape 5 : Parcourir de ResultSet :
            while(rs.next()){
                System.out.println("le développeur qui a réalisé le nombre maximum de scripts : " +rs.getString("Developpeurs") + "  " +rs.getString("jour")+ " "+ rs.getInt(3));
            } 
        }catch (SQLException e){
                System.out.println(e.getMessage());
        }catch (ClassNotFoundException ex){
                System.out.println("Impossible de charger le driver");
        }finally {
                try{
                   //Etape 5 : libérer les ressources de la mémoire :
                   st.close();
                   cn.close();
                }catch (SQLException ex){
                   System.out.println("Impossible de libérer les ressources");
                }
        } 
}

    public static void listeDev(){
            
        //information d'accès à la base de données :
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/scriptsdev";
        Connection cn = null;
        Statement st = null;
        ResultSet rs =null;

        try{
        //Etape 1 : Chargement du driver:
            Class.forName("com.mysql.jdbc.Driver");

        //Etape 2 : Récupération de la connexion :
            cn = DriverManager.getConnection(url, user, password);

        //Etape 3 : Création de statement  :      
            st = cn.createStatement();
            String req = "SELECT Developpeurs, sum(NBScripts) as c\n" +
                            "from devdata\n" +
                            "Group by Developpeurs\n" +
                            "order by c desc";

        //etape 4 : exécution de la requête          
            rs =st.executeQuery(req);
        //methode getType()
            int resultsetType = rs.getType();
        //etape 5 : parcourir de ResultSet
            while(rs.next()){
                System.out.println(rs.getString("Developpeurs") + "  " +rs.getInt("c"));
            }
        }catch (SQLException e){
                System.out.println(e.getMessage());
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
    public static void nbscriptstt(){
            
        //information d'accès à la base de données 
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/scriptsdev";
        Connection cn = null;
        Statement st = null;
        ResultSet rs =null;

        try{
        //etape 1 : chargement du driver
            Class.forName("com.mysql.jdbc.Driver");

        //etape 2 : récupération de la connexion
            cn = DriverManager.getConnection(url, user, password);

        //etape 3 : création de statement          
            st = cn.createStatement();
            String req = "SELECT SUM(NBScripts) AS total_scripts FROM devdata WHERE date_creation >= DATE_SUB(CURDATE(), INTERVAL 7 DAY)";

        //etape 4 : exécution de la requête          
            rs =st.executeQuery(req);
        //methode getType()
            int resultsetType = rs.getType();
        //etape 5 : parcourir de ResultSet
            while(rs.next()){
               int totalScripts = rs.getInt("total_scripts");
                    System.out.println("Nombre total de scripts réalisés en une semaine : " + totalScripts);
            }
        }catch (SQLException e){
                System.out.println(e.getMessage());
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

    public static void nbscriptsttpardev(String developpeurs){
            
        //information d'accès à la base de données :
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/scriptsdev";
        Connection cn = null;
        Statement st = null;
        ResultSet rs =null;

        try{
        //Etape 1 : Chargement du driver:
            Class.forName("com.mysql.jdbc.Driver");

        //Etape 2 : Cécupération de la connexion:
            cn = DriverManager.getConnection(url, user, password);

        //Etape 3 : Création de statement          
            String req = "SELECT SUM(NBScripts) AS total_scripts FROM devdata WHERE Developpeurs = '" + developpeurs + "'";
            st = cn.prepareStatement(req);
            
            
        //Etape 4 : Exécution de la requête          
            rs = st.executeQuery(req);
      
        //Etape 5 : Parcourir  ResultSet:
            while(rs.next()){
               int totalScripts = rs.getInt("total_scripts");
                System.out.println("Nombre total de scripts réalisés par " + developpeurs + " : " + totalScripts);
            }
        }catch (SQLException e){
                System.out.println(e.getMessage());
        }catch (ClassNotFoundException ex){
                System.out.println("Impossible de charger le driver");
        }finally {
                try{
        //Etape 5 : libérer les ressources :
                   st.close();
                   cn.close();
                }catch (SQLException ex){
                   System.out.println("Impossible de libérer les ressources");
                }
        } 
}


    
    public static void reqLibre() {

        // Informations d'accès à la BD :
        String user = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/scriptsdev";
        Connection cn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // Etape 1 : chargement du driver :
            Class.forName("com.mysql.jdbc.Driver");

            // etape 2 : recupération de la connexion
            cn = DriverManager.getConnection(url, user, password);

            // l'utilisateur  saisi la  requête SQL
            Scanner scanner = new Scanner(System.in);
            System.out.println("Veuillez entrer une requête SQL libre : ");
            String req = scanner.nextLine();

            // Etape 3 : Creation d'un Statement :
            st = cn.createStatement();

            // Execution de la requête :
            boolean hasResultSet = st.execute(req);

            // si la requête produit un ResultSet :
            if (hasResultSet) {
                rs = st.getResultSet();
                ResultSetMetaData rsMetaData = rs.getMetaData();
                
                // Nb de colonnes :
                int columnCount = rsMetaData.getColumnCount();
                System.out.println("Le nombre de colonnes dans le résultat : " + columnCount);

                // afficher le nom et le type de chaque colonne :
                for (int i = 1; i <= columnCount; i++) {
                    System.out.println("Colonne " + i + " : " + rsMetaData.getColumnName(i) + " (Type: " + rsMetaData.getColumnTypeName(i) + ")");
                }

                // afficher les resultats ligne par ligne :
                System.out.println("\nContenu des résultats :");
                while (rs.next()) {
                    for (int i = 1; i <= columnCount; i++) {
                        System.out.print(rs.getString(i) + "\t");
                    }
                    System.out.println();
                }

            } else {
                // si la requête est une mise à jour, affichage du nombre de lignes affectées :
                int rowsAffected = st.getUpdateCount();
                System.out.println("Nombre de lignes affectées : " + rowsAffected);
            }

        } catch (SQLException e) {
            System.out.println("Erreur SQL : " + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("Impossible de charger le driver");
        } finally {
            // Libération des ressources :
            try {
                if (rs != null) rs.close();
                if (st != null) st.close();
                if (cn != null) cn.close();
            } catch (SQLException ex) {
                System.out.println("Impossible de libérer les ressources");
            }
        }
    }

}
    
    


