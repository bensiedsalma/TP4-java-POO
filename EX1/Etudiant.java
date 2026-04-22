package EX1;

public class Etudiant extends Personne {
	String niveauetude;
	double moyenne;
	public Etudiant(String nom, String prenom, int age, String niveauetude, double moyenne) {
		super(nom, prenom, age);
		this.niveauetude = niveauetude;
        this.moyenne = moyenne; 
}
	String calculerMention() {
		if (moyenne >= 16) 
            return "Tres Bien";
         else if (moyenne >= 14) 
            return "Bien";
         else if (moyenne >= 12) 
            return "Assez Bien";
         else if (moyenne >= 10) 
            return "Passable";
         else 
            return "";
        
    }
	void estAdmis() {
		if(moyenne >=12) {
			System.out.println(" l’étudiant est validé ");
		}}
	void afficherProfil() {
		afficherInformations();
		System.out.println(" niveau d’étude:"+niveauetude);
		System.out.println(" moyenne:"+ moyenne);
		
	}}
	

