package EX2;

public class Vehicule {
	String marque;
	public Vehicule(String marque) {
		this.marque=marque;	}
	void afficherMarque() {
		System.out.println("la marque de voiture est:"+marque);
	}
	void demarrer()   {
		System.out.println("la voiture est demarrer");
	}
	void arreter()  {
		System.out.println("la voiture est arreter");
	}
	

}
