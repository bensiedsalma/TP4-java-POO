package EX3;

public class CompteCourant extends Compte {
	double decouvertAutorise;
	public CompteCourant(double solde, double decouvertAutorise) {
	    super(solde);
	    this.decouvertAutorise = decouvertAutorise;
	}
	boolean  autoriserDecouvert(double montant) {
		return (solde - montant >= -decouvertAutorise) ;
	}      
	double  calculerFrais() {
	    double frais = 0;

	    if (solde < 0) {
	        frais = Math.abs(solde) * 0.05;
	    } else {
	        frais = 0;
	    }

	    return frais;
	}
	public void afficher() {
	    System.out.println("Solde : " + solde);
	    System.out.println("Découvert autorisé : " + decouvertAutorise);
	    System.out.println("Frais : " + calculerFrais());
	}}
