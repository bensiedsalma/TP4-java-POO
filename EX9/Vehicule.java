package EX9;

public abstract class Vehicule {
	double vitesse;
	void accelerer() {
		 vitesse = vitesse+10;
		 System.out.println("Le véhicule accelere. Vitesse = " + vitesse);
    }
	void freiner(){
        vitesse = vitesse-10;
        System.out.println("Le véhicule freine. Vitesse = " + vitesse);
    }
	abstract void demarrer();
}
