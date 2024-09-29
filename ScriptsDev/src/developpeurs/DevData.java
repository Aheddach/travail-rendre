/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package developpeurs;

public class DevData {
    private String developpeurs;
    private String jour;
    private int nbScripts ;
    
    public DevData(){
    }
    
    public DevData(String developpeurs, int nbScripts, String jour){
         this.developpeurs = developpeurs;
         this.nbScripts = nbScripts ;
         this.jour = jour;
    }
   
    public String getDeveloppeurs(){
         return developpeurs;
    }
    
    public void setDeveloppeurs(String developpeurs){
        this.developpeurs = developpeurs;
    } 
    
    public int getNBScripts(){
         return nbScripts;
    }
    
    public void setNBScripts(int nbScripts){
         this.nbScripts = nbScripts;
    }
    public String getJour(){
         return jour;
    }
    
    public void setJour(String jour){
        this.jour = jour;
     
    
}
    
}
