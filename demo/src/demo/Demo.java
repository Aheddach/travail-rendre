
package demo;

import beans.Site;
import test.Test;
import static test.Test.load;
import static test.Test.save;


public class Demo {

   
     
    public static void main(String[] args) {
         //insertion des données
      
        
        save(new Site("SAFI"));
        save(new Site("MARRAKECH"));
        save(new Site("EL JADIDA"));
           //récupération des données
        load();
    }
    
}
