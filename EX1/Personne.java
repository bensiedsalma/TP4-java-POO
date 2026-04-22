package EX1;

public class Personne {
    String nom;
    String prenom;
    int age;
    public Personne(String nom,String prenom,int age) {
    	this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }
    void afficherInformations() {
    	 System.out.println("Nom : " + nom);
         System.out.println("Prénom : " + prenom);
         System.out.println("Age : " + age +"ans");
     }
    void estMajeur() {
    	if (this.age>=18) {
    		System.out.println(" la personne est majeure  ");
    	}	
    }
    String sePresenter() {
    	return "Je m'appelle " + prenom + " " + nom + " et j'ai " + age + " ans";
    }
    
    }

