package EX2;

public class Voiture extends Vehicule{
	int nbrportes;
	String carburant;
	String Color;
	public Voiture(String marque,int nbrportes,String carburant,String Color) {
		super(marque);
	}
	void afficherDetails() {
		afficherMarque();
		System.out.println("le carburant de voiture"+carburant);
		System.out.println("la color de voiture"+Color);
	} 
	void klaxonner() {
		System.out.println("la voiture Klaxonner:pipppppip");
	}}
