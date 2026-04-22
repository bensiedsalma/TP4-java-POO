package EX3;

public class Compte {
	double solde;
	public  Compte(double solde) {
		this.solde=solde;
		}
	void deposer(double montant) {
		if (montant>0) {
			solde=solde+montant;		
		}
	}
	void retirer(double montant ) {
		if (montant>0 ) {
			solde=solde-montant;}
		else {
		    System.out.println("impossible de faire de retirer");
		}}
	 public double consulterSolde() {
	        return solde;
	    }

	    public void afficher() {
	        System.out.println("Compte - Solde : " + solde);
	    }
	
}