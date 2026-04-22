package EX10;

public class Livre extends Document implements Empruntable {
	
	int nombreDePages  ;
	String genre;
	public Livre(String identifiant, String titre, String auteur, int nombreDePages, String genre) {
        super(identifiant, titre, auteur);
        this.nombreDePages = nombreDePages;
        this.genre = genre;
    }
	 
	 int calculerDureeEmpruntMax() {
		return 20 ;
		 
	 }
	 public boolean estDisponible() {
	        return etat;
	    }
	 public void reserver() {
		 System.out.println("Livre réservé");
	    }
	 void afficherDetails() {
	        System.out.println("Nombre de pages : " + nombreDePages);
	        System.out.println("Genre : " + genre);
	    }
	 public void recommander(String titre,String genre) {
		 System.out.println("Livre recommandé");
	    } }
