package EX9;

public class VoitureElectrique extends Vehicule implements Electrique {
	double Autonomie;
	public void charger() {
		 System.out.println("Recharge  la batterie");
	}
	public void verifierBatterie() {
        System.out.println("Batterie bien charger");
	}
	void afficherAutonomie(double Autonomie) {
		System.out.println("Autonomie : " + Autonomie );
    }
	void optimiserConsommation() {
        System.out.println("Mode économie activé");
    }
	 public void demarrer() {
	        System.out.println("La voiture électrique démarre");
	    }}
