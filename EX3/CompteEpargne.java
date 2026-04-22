package EX3;

public class CompteEpargne extends Compte {
	double Interet;
	public CompteEpargne(double solde, double Interet) {
        super(solde);
        this.Interet = Interet;
    }
	double calculerInterets() {
        return solde * Interet;
    }
	public void ajouterInterets() {
        solde += calculerInterets();
    }
	 public void afficher() {
	        System.out.println("Solde : " + solde);
	        System.out.println("Interet : " + (Interet * 100) + "%");
	        System.out.println("Interets : " + calculerInterets());
	    }
	}


