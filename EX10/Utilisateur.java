package EX10;

public class Utilisateur {
	String identifiant;
     String nom;
     void emprunterDocument(Document d) {
         d.emprunter();
     } 
     void retournerDocument(Document d) {
         d.retourner();}
     void afficherHistorique() {
    	 System.out.println("Historique utilisateur");
     }
}
