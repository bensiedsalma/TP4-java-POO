package EX10;

public abstract class Document {
	String identifiant ;
	String titre;
	String auteur;
	boolean etat;
	public Document(String identifiant, String titre, String auteur) {
        this.identifiant = identifiant;
        this.titre = titre;
        this.auteur = auteur;
        this.etat = true;
    }
	void emprunter() {
			etat = false;
	        System.out.println("document emprunté");
	    }
	void retourner() {
        etat = true;
        System.out.println("document retourné  "); 
    }
	void afficherInformations() {
        System.out.println("ID : " + identifiant);
        System.out.println("Titre : " + titre);
        System.out.println("Auteur : " + auteur);
        System.out.println("Disponible : " + (etat ? "Oui" : "Non"));
    }

    abstract int calculerDureeEmpruntMax();
}
